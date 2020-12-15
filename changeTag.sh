#!/bin/bash
sed "s/latest/$1/g" ./k8s/deployment.yml > ./update/deployment.yml