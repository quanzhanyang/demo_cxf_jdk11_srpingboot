1. jdk 11 、spring boot 2.1.6 、CXF 3.1.12
2. 依赖
        <dependency>
            <groupId>org.apache.cxf</groupId>
            <artifactId>cxf-spring-boot-starter-jaxws</artifactId>
            <version>3.1.12</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
        </dependency>
3.编写接口
        HelloWebservice
4.实现类HelloWebserviceImpl
5.配置类CxfWebserviceConfig
6.启动 springboot,访问路径 
http://localhost:8066/quan/HelloWebService?wsdl
