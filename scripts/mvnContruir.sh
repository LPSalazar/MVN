#!/bin/bash
export MAVEN_HOME=/opt/apache-maven-3.5.2

export M2_HOME=/opt/apache-maven-3.5.2
export PATH=$PATH:$M2_HOME/bin 

cd /home/ec2-user/PruebaMvn/mvnDeEC2
mvn compile
mvn package
cd /home/ec2-user/PruebaMvn/mvnDeEC2/target
java -jar mvnDeEC2-0.0.1-SNAPSHOT.jar
