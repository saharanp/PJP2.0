#!/bin/bash

echo "Enter any plugin to list its goals : "
read plugin
echo "The goals within the plug-in =>  $plugin are : "

mvn help:describe -Dplugin=org.apache.maven.plugins:maven-$plugin-plugin\-Ddetail=true
