# this image is built and updated weekly
# https://github.com/cse-labs/codespaces-images
FROM ghcr.io/cse-labs/k3d:latest

RUN apt-get update && apt install -y openjdk-11-jdk

# some images require specific values
ARG USERNAME=vscode
ENV PATH $PATH:/home/${USERNAME}/.dapr/bin
