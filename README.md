# Enterprise Event-Driven DevOps Platform

## Overview

This project demonstrates an enterprise-grade DevOps platform built using Terraform, Kubernetes (EKS), GitOps (ArgoCD), and containerized microservices.

The platform deploys a transaction processing service using a fully automated GitOps workflow and is designed to evolve into a complete CI/CD + MLOps system.

---

## Architecture

### Infrastructure Layer (Terraform)

* AWS VPC, subnets, NAT Gateway, Internet Gateway
* EKS cluster with managed node groups
* Remote state (S3 + DynamoDB)
* Modular stacks:

  * network
  * eks
  * addons

---

### Kubernetes Platform

* ArgoCD (GitOps controller)
* Prometheus + Grafana (monitoring)
* MongoDB (data layer)
* ingress-nginx
* EBS CSI Driver
* Metrics Server

---

### GitOps Flow (ArgoCD)

* Root app manages all applications
* Application definitions live under:

```text
cluster-config/apps/
```

* Each app points to a Helm chart:

```text
cluster-config/helm/
```

---

### Application Deployment Flow

```text
Code → Docker Image → Registry → ArgoCD → Helm → Kubernetes
```

---

### Application (Transaction Service)

* Spring Boot (Java 17)
* REST API (`/health`)
* Containerized using Docker
* Deployed via Helm and ArgoCD

---

## Repository Structure

```text
devops-platform/
├── infra-live/
│   ├── network/
│   ├── eks/
│   └── addons/
├── cluster-config/
│   ├── apps/
│   ├── helm/
│   ├── argocd/
│   └── infrastructure/
├── transaction-service/
├── cicd-platform/
├── scripts/
└── README.md
```

---

## Lifecycle

### Apply Infrastructure

```bash
./scripts/apply-all.sh
```

### Destroy Infrastructure

```bash
./scripts/destroy-all.sh
```

---

## Monitoring Access

```bash
kubectl port-forward svc/monitoring-grafana -n monitoring 3000:80
kubectl port-forward svc/monitoring-kube-prometheus-prometheus -n monitoring 9090
```

---

## ArgoCD Access

```bash
kubectl port-forward svc/argo-cd-argocd-server -n argocd 8080:443
```

---

## Current Status

### Completed

* Infrastructure provisioning (Terraform)
* EKS cluster setup
* GitOps deployment (ArgoCD)
* Monitoring stack
* Transaction service deployed via Helm
* Docker-based deployment pipeline

---

### In Progress

* CI/CD pipeline (Jenkins shared library)
* Kafka integration
* MongoDB integration

---

### Planned

* Kong API Gateway
* PingFederate authentication
* Conjur secrets management
* Event-driven architecture (Kafka)
* MLOps pipeline

---

## Key Concepts

* Infrastructure as Code (Terraform)
* GitOps (ArgoCD)
* Kubernetes (EKS)
* Containerization (Docker)
* Helm-based deployments

---

## Author

Ashutosh Pandey

