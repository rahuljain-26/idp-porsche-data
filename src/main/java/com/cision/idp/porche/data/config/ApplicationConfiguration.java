package com.cision.idp.porche.data.config;

public class ApplicationConfiguration {

  private static ApplicationConfiguration instance;

  public static ApplicationConfiguration getInstance() {
    if (instance == null) {
      instance = new ApplicationConfiguration();
    }
    return instance;
  }

  private String sparkMaster = "local[*]";

  private String sparkEventLogDir = "/tmp/spark_events";



  private String sparkBroadcastThreshold = "20MB";




  private String sparkCheckpointDir = "Checkpoints";
        //  "gs://cision_analytics_experience/IDP/ANALYSIS_LAYER/Checkpoints/";


  private Boolean sparkEventLogEnable = false;

  private String databaseTable="included_p_docs";
  private String startTime = "2020-01-01 00:00:00.000";
  private String endTime = "2020-01-02 00:00:00.000";

  private int year = 2020;

  private String jdbcUsername="svc_insights_data_pp";

  private String jdbcPassword = "ffHAN2GNbyzr6U7";

  private String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

  private String jdbcUrl= "jdbc:sqlserver://mz-pp-dw-001.prime-research.local;databaseName=automotive";

  private String partitionColumns;

  private String numPartitions;

  private String lowerBound;

  private String upperBound;

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  private String factTable = databaseTable;

  private String gcsPcdFullLoad = "/Users/rahuljain/Downloads/IDP_RAW_LAYER_vw_pcd_onetimeload_Year=2020_Month=1_part-00027-014cd377-b250-49de-b04e-7d637e5c0a92.c000.snappy.parquet";
        // "gs://cision_analytics_experience/IDP/RAW_LAYER/vw_pcd_onetimeload/";

  private String filter;

  private Integer fetchSize = 10000;

  private Boolean writePartitionsByMonth = true;

  private String WritePartitionsColumn = "CodedDate";

  private String filterDateFormat = "yyyy.MM.dd HH:mm:ss";

  public String getPcdDimensions() {
    return pcdDimensions;
  }

  public void setPcdDimensions(String pcdDimensions) {
    this.pcdDimensions = pcdDimensions;
  }

  private String pcdDimensions =  "/Users/rahuljain/Documents/pcd_dimensions/";
          // "gs://cision_analytics_experience/IDP/SOURCE_LAYER/PcdDimensions/";
  //"/Users/rahuljain/Documents/pcd_dimensions/";


  public String getPcdOneTimeLoad() {
    return pcdOneTimeLoad;
  }

  public void setPcdOneTimeLoad(String pcdOneTimeLoad) {
    this.pcdOneTimeLoad = pcdOneTimeLoad;
  }

  private String pcdOneTimeLoad ="/Users/rahuljain/Documents/PCDOneTimeLoad/";

         // "gs://cision_analytics_experience/IDP/ANALYSIS_LAYER/PCDOneTimeLoad";
        //"/Users/rahuljain/Documents/PCDOneTimeLoad/";





  public String getSparkMaster() {
    return sparkMaster;
  }

  public void setSparkMaster(String sparkMaster) {
    this.sparkMaster = sparkMaster;
  }

  public String getSparkEventLogDir() {
    return sparkEventLogDir;
  }

  public String getSparkBroadcastThreshold() {
    return sparkBroadcastThreshold;
  }

  public void setSparkBroadcastThreshold(String sparkBroadcastThreshold) {
    this.sparkBroadcastThreshold = sparkBroadcastThreshold;
  }




  public void setSparkEventLogDir(String sparkEventLogDir) {
    this.sparkEventLogDir = sparkEventLogDir;
  }

  public Boolean getSparkEventLogEnable() {
    return sparkEventLogEnable;
  }

  public String getSparkCheckpointDir() {
    return sparkCheckpointDir;
  }

  public void setSparkCheckpointDir(String sparkCheckpointDir) {
    this.sparkCheckpointDir = sparkCheckpointDir;
  }

  public void setSparkEventLogEnable(Boolean sparkEventLogEnable) {
    this.sparkEventLogEnable = sparkEventLogEnable;
  }

  public String getDatabaseTable() {
    return databaseTable;
  }

  public void setDatabaseTable(String databaseTable) {
    this.databaseTable = databaseTable;
  }

  public String getJdbcUsername() {
    return jdbcUsername;
  }

  public void setJdbcUsername(String jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

  public String getJdbcPassword() {
    return jdbcPassword;
  }

  public void setJdbcPassword(String jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

  public String getJdbcDriver() {
    return jdbcDriver;
  }

  public void setJdbcDriver(String jdbcDriver) {
    this.jdbcDriver = jdbcDriver;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }

  public String getPartitionColumns() {
    return partitionColumns;
  }

  public void setPartitionColumns(String partitionColumns) {
    this.partitionColumns = partitionColumns;
  }

  public String getNumPartitions() {
    return numPartitions;
  }

  public void setNumPartitions(String numPartitions) {
    this.numPartitions = numPartitions;
  }

  public String getLowerBound() {
    return lowerBound;
  }

  public void setLowerBound(String lowerBound) {
    this.lowerBound = lowerBound;
  }

  public String getUpperBound() {
    return upperBound;
  }

  public void setUpperBound(String upperBound) {
    this.upperBound = upperBound;
  }

  public String getTable() {
    return factTable;
  }

  public String getGcsPcdFullLoad() {
    return gcsPcdFullLoad;
  }

  public void setGcsPcdFullLoad(String gcsPcdFullLoad) {
    this.gcsPcdFullLoad = gcsPcdFullLoad;
  }

  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Integer getFetchSize() {
    return fetchSize;
  }

  public void setFetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
  }

  public Boolean getWritePartitionsByMonth() {
    return writePartitionsByMonth;
  }

  public void setWritePartitionsByMonth(Boolean writePartitionsByMonth) {
    this.writePartitionsByMonth = writePartitionsByMonth;
  }

  public String getWritePartitionsColumn() {
    return WritePartitionsColumn;
  }

  public void setWritePartitionsColumn(String writePartitionsColumn) {
    WritePartitionsColumn = writePartitionsColumn;
  }

  public String getFilterDateFormat() {
    return filterDateFormat;
  }

  public void setFilterDateFormat(String filterDateFormat) {
    this.filterDateFormat = filterDateFormat;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "ApplicationConfiguration{" +
        "sparkMaster='" + sparkMaster + '\'' +
        ", sparkEventLogDir='" + sparkEventLogDir + '\'' +
        ", sparkEventLogEnable=" + sparkEventLogEnable +
        ", dbTable='" + databaseTable + '\'' +
        ", jdbcUsername='" + jdbcUsername + '\'' +
        ", jdbcDriver='" + jdbcDriver + '\'' +
        ", jdbcUrl='" + jdbcUrl + '\'' +
        ", partitionColumns='" + partitionColumns + '\'' +
        ", numPartitions='" + numPartitions + '\'' +
        ", lowerBound='" + lowerBound + '\'' +
        ", upperBound='" + upperBound + '\'' +
        ", factTable='" + factTable + '\'' +
        ", gcsBucketObject='" + gcsPcdFullLoad + '\'' +
        ", filter='" + filter + '\'' +
        ", fetchSize=" + fetchSize +
        ", writePartitionsByMonth=" + writePartitionsByMonth +
        ", WritePartitionsColumn='" + WritePartitionsColumn + '\'' +
        ", filterDateFormat='" + filterDateFormat + '\'' +
        '}';
  }
}
