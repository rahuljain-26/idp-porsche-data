package com.cision.idp.porche.data.config;

import org.apache.spark.sql.SparkSession;

public class AppSparkSession {

  public static final String APP_NAME = "Porsche Data Load";

  private AppSparkSession() {
    // private constructor to hide the implicit public one
  }

  /**
   * Create a Spark Session. Set Spark master for local development
   *
   * @return Spark Session
   */
  public static SparkSession getSparkSession() {

    ApplicationConfiguration config = ApplicationConfiguration.getInstance();
    SparkSession spark;

    if (config.getSparkMaster() != null && !config.getSparkMaster().isEmpty()) {
      spark = SparkSession
          .builder()
          .appName(APP_NAME)
          .master(config.getSparkMaster())
          .config("spark.hadoop.fs.gs.impl", "com.google.cloud.hadoop.fs.gcs.GoogleHadoopFileSystem")
          .config("spark.hadoop.fs.AbstractFileSystem.gs.impl", "com.google.cloud.hadoop.fs.gcs.GoogleHadoopFS")
          .config("spark.hadoop.fs.gs.auth.type", "APPLICATION_DEFAULT")
          .config("spark.eventLog.enabled", config.getSparkEventLogEnable().toString())
          .config("spark.eventLog.dir", config.getSparkEventLogDir())
          .config("spark.sql.autoBroadcastJoinThreshold", config.getSparkBroadcastThreshold() )
          .getOrCreate();
    } else {
      spark = SparkSession
          .builder()
          .appName(APP_NAME)
          .config("spark.hadoop.fs.gs.impl", "com.google.cloud.hadoop.fs.gcs.GoogleHadoopFileSystem")
          .config("spark.hadoop.fs.AbstractFileSystem.gs.impl", "com.google.cloud.hadoop.fs.gcs.GoogleHadoopFS")
          .config("spark.hadoop.fs.gs.auth.type", "APPLICATION_DEFAULT")
          .config("spark.eventLog.enabled", config.getSparkEventLogEnable().toString())
          .config("spark.eventLog.dir", config.getSparkEventLogDir())
          .config("spark.sql.autoBroadcastJoinThreshold", config.getSparkBroadcastThreshold() )
          .getOrCreate();
    }

    spark.sparkContext().setLogLevel("INFO");
    spark.sparkContext().setCheckpointDir(config.getSparkCheckpointDir());
    return spark;

  }
}
