# Cision Insights Data Platform
# Metadata Database sink

FROM  europe-west3-docker.pkg.dev/cision-container-registry/container-artifact-registry/spark:13

COPY target/*-shaded.jar  /opt/spark/jars/idp-app.jar

ENV SPARK_HOME /opt/spark
ENV PATH $PATH:$SPARK_HOME/bin:$SPARK_HOME/sbin
ENV MAIN_CLASS=App
ENV JAR $SPARK_HOME/jars/idp-app.jar


