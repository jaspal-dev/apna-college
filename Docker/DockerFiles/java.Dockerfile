ARG BASE_IMAGE_NAME
ARG BASE_IMAGE_VERSION
ARG JDK_VERSION
ARG USER_NAME

FROM ${BASE_IMAGE_NAME}:${BASE_IMAGE_VERSION}

ARG JDK_VERSION
ARG USER_NAME

RUN apt-get -y update && \
    apt-get -y upgrade

RUN apt-get -y install openjdk-${JDK_VERSION}-jdk

RUN useradd -m -s /bin/bash ${USER_NAME}

USER ${USER_NAME}

CMD ["/bin/bash"]
