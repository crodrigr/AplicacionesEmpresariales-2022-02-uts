# Ciclo de Vida. 

## 1. 
![image](https://user-images.githubusercontent.com/31961588/193358299-ca7f6e8f-ad9b-4360-b62a-0ec148811f0e.png)


### 2. Add las dependencias de log4j en el pom.xml

![image](https://user-images.githubusercontent.com/31961588/193358490-d67350a8-3bfe-47bf-b860-85605e7b6054.png)

**pom.xml**

```Xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>mx.com.gm</groupId>
    <artifactId>holamundo-jsf</artifactId>
    <version>1.0</version>
    <packaging>war</packaging>

    <name>holamundo-jsf</name>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-web-api</artifactId>
            <version>8.0.1</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.12.0</version>
        </dependency>
         <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.12.0</version>
        </dependency>
    </dependencies>

   <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>3.2.3</version>
                <configuration>
                    <failOnMissingWebXml>false</failOnMissingWebXml>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```
#### 2.1 Revisar que el archivo log4j2.xml que está en other resource tenga la siguiente configuracón

![image](https://user-images.githubusercontent.com/31961588/193407574-bfc6a011-d3e7-4e9e-a422-ad82e48f6a7e.png)


### 3. Crear la clase DebuggerListener

### 3.1
![image](https://user-images.githubusercontent.com/31961588/193358792-0433030a-992d-41e1-8cc0-1e91d1000842.png)


### 3.2

Implementamos la interfaz PhaseListener y sobre escribimos los metodos

![image](https://user-images.githubusercontent.com/31961588/193359315-55ddab49-465b-4064-9179-1fb3b8f7a670.png)


### 4. Creamos el faces-config

### 4.1

![image](https://user-images.githubusercontent.com/31961588/193360281-df7d11e9-ed57-4a17-a873-3abf37014f92.png)

### 4.2 

![image](https://user-images.githubusercontent.com/31961588/193360372-5e98cc3b-c8cc-4b2e-af65-7850bad40213.png)

**faces-config.xml**

```Xml
<?xml version="1.0" encoding="UTF-8"?>
<faces-config
    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                        http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_3.xsd"
    version="2.3">
    
    <lifecycle>
        <phase-listener>
            beans.lifecycle.DebuggerListener
        </phase-listener>
    </lifecycle>        

</faces-config>

```

## 5. Add en la clase Candidato y VacanteForm el log4j

### 5.1

![image](https://user-images.githubusercontent.com/31961588/193361224-e48398f9-13ab-4862-b4d0-8c88b2dfb56d.png)

### 5.2

![image](https://user-images.githubusercontent.com/31961588/193361356-97ad4875-ef26-41b9-9caf-082952cb4cda.png)


