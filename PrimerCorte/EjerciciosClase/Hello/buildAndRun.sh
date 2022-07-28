#!/bin/sh
mvn clean package && docker build -t com.mycompany/Hello .
docker rm -f Hello || true && docker run -d -p 9080:9080 -p 9443:9443 --name Hello com.mycompany/Hello