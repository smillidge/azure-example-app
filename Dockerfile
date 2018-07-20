FROM payara/azure-micro-base

COPY AzureWebAppsExample/target/AzureWebAppsExample-1.0-SNAPSHOT.war /opt/payara/deployments/AzureWebAppsExample.war
