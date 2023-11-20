FROM gitpod/workspace-full

RUN brew install clojure/tools/clojure
RUN brew install borkdude/brew/babashka
RUN brew install babashka/brew/neil