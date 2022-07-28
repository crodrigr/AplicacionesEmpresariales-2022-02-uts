@echo off
call mvn clean package
call docker build -t com.mycompany/Hello .
call docker rm -f Hello
call docker run -d -p 9080:9080 -p 9443:9443 --name Hello com.mycompany/Hello