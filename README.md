# idp-pcd-layer

## CAHNGELOG

### 1.0.0

* IDP PCD Layer Deployment to Kubernetes

## Applicaiton Env

These are the environment variables which can be set for the idp-metadata-sink Spark ETL. Example for table pmcd_automotive

| Variable                 | Default                                                           | Description                                                                         |
|--------------------------|-------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| MASTER                   |                                                                   | Spark Master !Used for local development only. should not be set for K8 deployment! |
| jdbc_url                 | jdbc:mysql://mz-live-dw-001.prime-research.local/automotive       |                                                                                     |
| database_table           | vw_IDP_PCD_OneTimeLoad                                            |                                                                                     |
| jdbc_user                | svc_insights_data                                                 |                                                                                     |
| jdbc_pwd                 |                                                                   |                                                                                     |
| jdbc_driver              | com.microsoft.sqlserver.jdbc.SQLServerDriver                      |                                                                                     |
| partition_column         | CodedTimestamp                                                    |                                                                                     |
| num_partitions           | 20                                                                |                                                                                     |
| lower_bound              |                                                                   | Example 2023.03.01 00:00:00                                                         |
| upper_bound              |                                                                   | Example 2023.03.31 23:59:59                                                         |
| fetch_size               | 10000                                                             |                                                                                     |
| gcs_pcd_fulload          | gs://cision_analytics_experience/IDP/RAW_LAYER/vw_pcd_onetimeload | Google Cloud Storage bucket object                                                  |
| filter                   |                                                                   | Example 2022.12.01 00:00:00                                                         |
| write_partition_by_month | true                                                              |                                                                                     |
| write_partition_column   | CodedDate                                                         |                                                                                     |
| filter_date_format       | yyyy.MM.dd HH:mm:ss                                               |                                                                                     |
| event_log_dir            | /tmp/spark_events                                                 |                                                                                     |
| event_log_enable         | false                                                             |                                                                                     |

## Development

### Login to Gooble Cloud

To login in via shell to Google cloud you have to have the Google Cloud installed. Open a bash (terminal Mac OS) and login.

```bash
# Login to Google Cloud
gcloud auth login
# Auth applicaiton-default. Needed for GCS and BigQuery for IAM.
gcloud auth application-default login
```

### Build

Build idp-metadata-sink application

```bash
mvn clean -B -P shadedbuild package
```