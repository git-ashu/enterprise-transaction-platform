# Enterprise Transaction Processing Platform

## Overview

This project demonstrates a secure, cloud-native, event-driven transaction processing platform built using enterprise DevOps and Platform Engineering practices.

The system simulates financial transaction processing using Kafka and MongoDB, deployed on AWS EKS with full CI/CD, GitOps, policy enforcement, observability, and secret management.

---

## Architecture Highlights

- AWS Infrastructure provisioned using Terraform
- EKS Cluster with IRSA (IAM Roles for Service Accounts)
- HashiCorp Vault for dynamic secrets and certificate management
- Kafka for event streaming
- MongoDB for persistence
- Spring Boot application (Gradle-based)
- OpenTelemetry for metrics and tracing
- Prometheus + Grafana for monitoring
- Splunk for centralized logging
- HPA based on Kafka consumer lag
- Pod Disruption Budgets and Affinity rules
- OPA Gatekeeper for policy-as-code
- Jenkins (Kubernetes agents) with Shared Library
- Snyk + SonarQube + Container scanning
- Helm packaging
- ArgoCD for GitOps-based deployment
- Ansible for configuration management

---

## Repository Structure

app/ -> Spring Boot Transaction Application
terraform/ -> Infrastructure as Code (AWS)
helm/ -> Helm Charts for Application
jenkins-shared-lib/ -> Shared CI logic
jenkins-pipelines/ -> Application & Infra pipelines
argocd/ -> GitOps manifests
policies/ -> OPA Gatekeeper policies
ansible/ -> Configuration management
docs/ -> Architecture diagrams and documentation


---

## Key Capabilities Demonstrated

- Secure identity-based authentication (IAM + IRSA)
- Vault dynamic database credential rotation
- Kafka consumer lag monitoring and autoscaling
- Policy enforcement in Kubernetes
- Infrastructure pipeline with remote state management
- Enterprise CI/CD standardization
- GitOps deployment model
- Observability-driven scaling decisions

---

## Future Enhancements

- Multi-environment promotion (dev/stage/prod)
- Automated blue-green rollback strategies
- Service Mesh integration
- Image signing & verification
