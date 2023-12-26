#!/usr/bin/env bash

set -e
echo "Build My Ameria Backend"

mvn clean package -U -Dmaven.test.skip=true

