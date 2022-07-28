#!/bin/sh
mvn clean package && docker build -t com.mycompany/HolaMundo .
docker rm -f HolaMundo || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundo com.mycompany/HolaMundo