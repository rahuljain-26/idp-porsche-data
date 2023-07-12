package com.cision.idp.porche.data;

import com.cision.idp.porche.data.config.ApplicationConfiguration;
import com.cision.idp.porche.data.config.AppSparkSession;
import com.cision.idp.porche.data.config.SetEnvironmentProperties;
import com.cision.idp.porche.data.service.SparkGcsService;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  public static final String COL_YEAR = "Year";
  public static final String COL_MONTH = "Month";


  public static void main(String[] args) {
    startSparkJob();
  }

  /**
   * This method starts the spark job.
   */
  private static void startSparkJob() {

    SetEnvironmentProperties setEnvironmentProperties = new SetEnvironmentProperties();
    setEnvironmentProperties.loadProperties();
    ApplicationConfiguration config = ApplicationConfiguration.getInstance();

    SparkSession spark = AppSparkSession.getSparkSession();
    SparkGcsService gcsService = new SparkGcsService(spark);

    Dataset<Row> includedDocumentDf = gcsService.readGcsCsv("gs://idp_porsche/PorscheArticles.csv");

    includedDocumentDf.show();

    System.out.println(config.getJdbcUrl());
    System.out.println(config.getTable());

    includedDocumentDf.write()
              .format("jdbc")
              .mode("append")
              .option("url", config.getJdbcUrl())
              .option("user", config.getJdbcUsername())
              .option("password", config.getJdbcPassword())
              .option("dbtable", config.getTable())
              .option("driver",config.getJdbcDriver())
              .option("encrypt", "false")
              .option("ServerCertificate", "false")
            .save();
  }

}
