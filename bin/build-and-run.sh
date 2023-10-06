#!/bin/sh
./gradlew assemble
docker-compose -f src/main/docker/docker-compose.yml -p spring-boot-lab up
