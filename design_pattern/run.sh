#!/bin/bash
cd $1
javac Main.java -d ./tmp
cd ./tmp
java Main
rm -rf ../tmp
