FROM --platform=linux/amd64 mcr.microsoft.com/devcontainers/base:ubuntu

RUN /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# TODO: broken
RUN brew install clojure/tools/clojure
RUN brew install borkdude/brew/babashka
RUN brew install babashka/brew/neil