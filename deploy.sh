#!/bin/bash
echo "[1/3] Docker-Images bauen"
docker-compose build

echo "[2/3] Container starten"
docker-compose up -d

echo "[3/3] Kubernetes-Deployments aktualisieren"
kubectl apply -f kubernetes/
