#!/bin/bash
cd /home/ec2-user/PruebaMvn/mvnDeEC2
mvn compile
mvn package
cd /home/ec2-user/PruebaMvn/mvnDeEC2/target
java -jar mvnDeEC2-0.0.1-SNAPSHOT.jar
