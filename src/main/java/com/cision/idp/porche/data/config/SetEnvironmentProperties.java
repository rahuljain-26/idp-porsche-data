package com.cision.idp.porche.data.config;

public class SetEnvironmentProperties {

  private static final String MASTER = "MASTER";
  private static final String EVENT_LOG_DIR = "event_log_dir";
  private static final String EVENT_LOG_ENABLE = "event_log_enable";
  private static final String DB_TABLE = "database_table";
  private static final String JDBC_URL = "jdbc_url";
  private static final String JDBC_USER = "jdbc_user";
  private static final String JDBC_PASSWORD = "jdbc_pwd";
  private static final String JDBC_DRIVER = "jdbc_driver";
  private static final String PARTITION_COLUMN = "partition_column";
  private static final String NUM_PARTITION = "num_partitions";
  private static final String LOWER_BOUND = "lower_bound";
  private static final String UPPER_BOUND = "upper_bound";
  private static final String QUERY = "query";
  private static final String GCS_PCD_FULLLOAD = "gcs_pcd_fulload";
  private static final String FETCH_SIZE = "fetch_size";
  private static final String FILTER = "filter";
  private static final String WRITE_PARTITION_BY_MONTH = "write_partition_by_month";
  private static final String WRITE_PARTITION_COLUMN = "write_partition_column";
  private static final String START_TIME = "start_time";
  private static final String END_TIME = "end_time";

  private static final String PCD_ONETIME_LOAD = "pcd_onetime_load";
  private static final String CHECKPOINT_DIR = "checkpoint_dir";
  private static final String PCD_DIMENSIONS = "pcd_dimensions";
  private static final String BROADCAST_THRESHOLD = "braodcast_threshold";






  public SetEnvironmentProperties() {
    // default constructor
  }

  public void loadProperties() {

    ApplicationConfiguration appConfiguration = ApplicationConfiguration.getInstance();
    if (System.getenv(MASTER) != null && !System.getenv(MASTER).isEmpty()) {
      appConfiguration.setSparkMaster(String.valueOf(System.getenv(MASTER)));
    }

    if (System.getenv(EVENT_LOG_DIR) != null && !System.getenv(EVENT_LOG_DIR).isEmpty()) {
      appConfiguration.setSparkEventLogDir(String.valueOf(System.getenv(EVENT_LOG_DIR)));
    }

    if (System.getenv(EVENT_LOG_ENABLE) != null && !System.getenv(EVENT_LOG_ENABLE).isEmpty()) {
      appConfiguration.setSparkEventLogEnable(Boolean.valueOf(System.getenv(EVENT_LOG_ENABLE)));
    }

    if (System.getenv(DB_TABLE) != null && !System.getenv(DB_TABLE).isEmpty()) {
      appConfiguration.setDatabaseTable(String.valueOf(System.getenv(DB_TABLE)));
    }

    if (System.getenv(JDBC_DRIVER) != null && !System.getenv(JDBC_DRIVER).isEmpty()) {
      appConfiguration.setJdbcDriver(String.valueOf(System.getenv(JDBC_DRIVER)));
    }

    if (System.getenv(JDBC_URL) != null && !System.getenv(JDBC_URL).isEmpty()) {
      appConfiguration.setJdbcUrl(String.valueOf(System.getenv(JDBC_URL)));
    }

    if (System.getenv(JDBC_USER) != null && !System.getenv(JDBC_USER).isEmpty()) {
      appConfiguration.setJdbcUsername(String.valueOf(System.getenv(JDBC_USER)));
    }

    if (System.getenv(JDBC_PASSWORD) != null && !System.getenv(JDBC_PASSWORD).isEmpty()) {
      appConfiguration.setJdbcPassword(String.valueOf(System.getenv(JDBC_PASSWORD)));
    }

    if (System.getenv(PARTITION_COLUMN) != null && !System.getenv(PARTITION_COLUMN).isEmpty()) {
      appConfiguration.setPartitionColumns(String.valueOf(System.getenv(PARTITION_COLUMN)));
    }

    if (System.getenv(NUM_PARTITION) != null && !System.getenv(NUM_PARTITION).isEmpty()) {
      appConfiguration.setNumPartitions(String.valueOf(System.getenv(NUM_PARTITION)));
    }

    if (System.getenv(LOWER_BOUND) != null && !System.getenv(LOWER_BOUND).isEmpty()) {
      appConfiguration.setLowerBound(String.valueOf(System.getenv(LOWER_BOUND)));
    }

    if (System.getenv(UPPER_BOUND) != null && !System.getenv(UPPER_BOUND).isEmpty()) {
      appConfiguration.setUpperBound(String.valueOf(System.getenv(UPPER_BOUND)));
    }


    if (System.getenv(GCS_PCD_FULLLOAD) != null && !System.getenv(GCS_PCD_FULLLOAD).isEmpty()) {
      appConfiguration.setGcsPcdFullLoad(String.valueOf(System.getenv(GCS_PCD_FULLLOAD)));
    }

    if (System.getenv(FETCH_SIZE) != null && !System.getenv(FETCH_SIZE).isEmpty()) {
      appConfiguration.setFetchSize(Integer.valueOf(System.getenv(FETCH_SIZE)));
    }

    if (System.getenv(FILTER) != null && !System.getenv(FILTER).isEmpty()) {
      appConfiguration.setFilter(String.valueOf(System.getenv(FILTER)));
    }

    if (System.getenv(WRITE_PARTITION_BY_MONTH) != null && !System.getenv(WRITE_PARTITION_BY_MONTH).isEmpty()) {
      appConfiguration.setWritePartitionsByMonth(Boolean.valueOf(System.getenv(WRITE_PARTITION_BY_MONTH)));
    }

    if (System.getenv(WRITE_PARTITION_COLUMN) != null && !System.getenv(WRITE_PARTITION_COLUMN).isEmpty()) {
      appConfiguration.setWritePartitionsColumn(String.valueOf(System.getenv(WRITE_PARTITION_COLUMN)));
    }

    if (System.getenv(START_TIME) != null && !System.getenv(START_TIME).isEmpty()) {
      appConfiguration.setStartTime(String.valueOf(System.getenv(START_TIME)));
    }
    if (System.getenv(END_TIME) != null && !System.getenv(END_TIME).isEmpty()) {
      appConfiguration.setEndTime(String.valueOf(System.getenv(END_TIME)));
    }
    if (System.getenv(PCD_ONETIME_LOAD) != null && !System.getenv(PCD_ONETIME_LOAD).isEmpty()) {
      appConfiguration.setPcdOneTimeLoad(String.valueOf(System.getenv(PCD_ONETIME_LOAD)));
    }
    if (System.getenv(CHECKPOINT_DIR) != null && !System.getenv(CHECKPOINT_DIR).isEmpty()) {
      appConfiguration.setSparkCheckpointDir(String.valueOf(System.getenv(CHECKPOINT_DIR)));
    }
    if (System.getenv(PCD_DIMENSIONS) != null && !System.getenv(PCD_DIMENSIONS).isEmpty()) {
      appConfiguration.setPcdDimensions(String.valueOf(System.getenv(PCD_DIMENSIONS)));
    }if (System.getenv(BROADCAST_THRESHOLD) != null && !System.getenv(BROADCAST_THRESHOLD).isEmpty()) {
      appConfiguration.setSparkBroadcastThreshold(String.valueOf(System.getenv(BROADCAST_THRESHOLD)));
    }
  }
}
