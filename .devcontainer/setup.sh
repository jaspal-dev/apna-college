#!/bin/bash

set -e

apt-get -y update
apt-get -y upgrade
apt-get -y install openssh-client