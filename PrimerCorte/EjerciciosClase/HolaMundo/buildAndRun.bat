@echo off
call mvn clean package
call docker build -t com.mycompany/HolaMundo .
call docker rm -f HolaMundo
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundo com.mycompany/HolaMundo