FROM openjdk:17
EXPOSE 8080
ADD payroll/target/payroll-*.jar /payroll.jar
ENTRYPOINT ["java","-jar","/payroll.jar"]




