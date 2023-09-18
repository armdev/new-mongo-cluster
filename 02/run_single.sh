#!/bin/bash

docker compose --file mongodb.yml --compatibility up -d --build
docker logs --follow mongodb
