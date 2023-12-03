# Dockerfile to build a clojure devcontainer for arm64 (no brew)
FROM mcr.microsoft.com/devcontainers/base:ubuntu

RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    curl \
    ca-certificates \
    rlwrap \
    wget \
    zip \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Install GraalVM
RUN mkdir -p /usr/lib/jvm
RUN curl -L -O https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_linux-aarch64_bin.tar.gz && \
    tar -xvf graalvm-jdk-21_linux-aarch64_bin.tar.gz && \
    mv graalvm-jdk-21.0.1+12.1 /usr/lib/jvm && \
    rm graalvm-jdk-21_linux-aarch64_bin.tar.gz

ENV PATH="${PATH}:/usr/lib/jvm/graalvm-jdk-21.0.1+12.1/bin"
ENV JAVA_HOME=/usr/lib/jvm/graalvm-jdk-21.0.1+12.1
    
# Install clojure
RUN curl -L -O https://github.com/clojure/brew-install/releases/latest/download/linux-install.sh && \
    chmod +x linux-install.sh && \
    sudo ./linux-install.sh && \
    rm linux-install.sh
    
# Install babashka
RUN curl -sLO https://raw.githubusercontent.com/babashka/babashka/master/install && \
    chmod +x install && \
    ./install

# Install neil
RUN curl -sLO https://raw.githubusercontent.com/babashka/neil/main/neil && \
    chmod +x neil && \
    mv neil /usr/local/bin