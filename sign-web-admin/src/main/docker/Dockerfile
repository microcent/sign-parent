# 基于哪个镜像
# FROM openjdk:8-jdk-alpine
FROM java:8
# 将本地文件夹挂载到当前容器
VOLUME /tmp
# 拷贝文件到容器，也可以直接写成ADD docker-spring-boot-demo-0.0.1-SNAPSHOT.jar /app.jar
ADD ./sign-web-admin-1.0.0.jar app.jar

RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]