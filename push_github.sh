#!/bin/bash

message=$1


if [ -n "$1" ]
then
  git add .
#  git commit -m "$message"
  git commit --author="xiculan<ffurroy@gmail.com>" -m "$message"
#   echo $message
else
  echo "falta mensaje"
  exit
fi

git push



exit



