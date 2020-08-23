#!/bin/bash
echo "Enter the name of a file"

read log
echo "Enter the maven command : "
read cmd 
$cmd -l
echo "Log generated"
