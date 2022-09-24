# Ejercicio Hola Mundo Jsf

## 1. Crear proyecto Web Aplication con Maven

### 1.1

![image](https://user-images.githubusercontent.com/31961588/191160260-c75e4515-e2ee-4e31-bc15-f75e9eab133e.png)


### 1.2

![image](https://user-images.githubusercontent.com/31961588/191160371-80ed0872-45c1-44d5-8a19-114edc64b370.png)

### 1.3 Selccionar GlassFishe 5.0

![image](https://user-images.githubusercontent.com/31961588/191160491-249aae93-13b9-4496-bb46-542125146089.png)

## 2. Convertir el proyecto web en un proyecto jsf

### 2.1 Eliminar el index.html

![image](https://user-images.githubusercontent.com/31961588/191160730-24f69772-9b31-4609-8ad9-9854d5eb2571.png)

### 2.2 Configuración del archivo poo.xml

#### Depenencias JEE y Log4j

![image](https://user-images.githubusercontent.com/31961588/191162149-9fc87bf4-fbb3-4ead-a89f-a8a03b493791.png)

**poom.xml**

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>UtsPractica</groupId>
    <artifactId>HolaMundoEmp</artifactId>
    <version>1.0</version>
    <packaging>war</packaging>
    <name>HolaMundoEmp-1.0</name>
    
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <endorsed.dir>${project.build.directory}/endorsed</endorsed.dir>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <failOnMissingWebXml>false</failOnMissingWebXml>
        <jakartaee>8.0</jakartaee>
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
    </dependencies>
    
     <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <compilerArguments>
                        <endorseddirs>${endorsed.dir}</endorseddirs>
                    </compilerArguments>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>3.2.3</version>
                <configuration>
                    <failOnMissingWebXml>false</failOnMissingWebXml>
                </configuration>
            </plugin>          
        </plugins>
    </build>
</project>
```

#### build
  
  ![image](https://user-images.githubusercontent.com/31961588/191162374-37e4636a-3c66-464b-a07d-8bc936824ed7.png)

#### Configuracion source/forma 1.8

![image](https://user-images.githubusercontent.com/31961588/191162496-bfc23651-6927-439e-92c3-66e6424ae655.png)

#### Hacemos clean and build

![image](https://user-images.githubusercontent.com/31961588/191162980-cbae7f85-5bff-45ab-841e-57b313f9af7a.png)

#### Creamos la clase para que reconozca glassfish a jsf

![image](https://user-images.githubusercontent.com/31961588/191163139-273eacee-7dc6-4dae-b4c7-105307d7a20a.png)

#### Creamos la clase configuracionJSF para que reconozca la ulitma version jsf el glassfish

![image](https://user-images.githubusercontent.com/31961588/191163559-cc326eab-7d09-4d99-a9ef-dfc73216b731.png)

**Código**

```Java
package beans.configuracion;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(
        //Activa CDI build-in beans
        version = JSF_2_3
)
@ApplicationScoped
public class ConfigrationJSF {
    
}
```


#### En Files del proyecto creamos si no tenemos el directorio resources, el cual, lleva xmlDocument

![image](https://user-images.githubusercontent.com/31961588/191164169-c87b4983-a2cc-4b6f-97e9-63ab037ac0f8.png)

#### Creamos un xmlDocument log4j

![image](https://user-images.githubusercontent.com/31961588/191164350-f08df8fc-0b66-4e16-a093-711e6d082e8e.png)

![image](https://user-images.githubusercontent.com/31961588/191164470-b2bbb301-3725-4f95-833e-5483145ddcb2.png)

#### Creamos el log4j

![image](https://user-images.githubusercontent.com/31961588/191164712-b53ad6a0-f0d5-4299-b5db-8db09e5685a9.png)

**Código**

```Xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36} -%msg%n"></PatternLayout>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console" /> 
        </Root>
    </Loggers>
</Configuration>
```

### Creamos un index.xhtml

![image](https://user-images.githubusercontent.com/31961588/191165256-ea864367-af01-426d-ad9c-3067b1c5113a.png)

![image](https://user-images.githubusercontent.com/31961588/191165435-357215e3-6330-4280-ae36-060b6f8201b3.png)

![image](https://user-images.githubusercontent.com/31961588/191165663-a8c0e5bc-febd-46de-a89d-c1e20880c484.png)

**Código**

```Java
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Hola Mundo JSF</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <h:outputLabel value="Hola Mundo desde JSF" />
    </body>
</html>
```

### Creamos el web.xml en WEB-ING

![image](https://user-images.githubusercontent.com/31961588/191165960-631d364b-d69f-4ec8-9229-44504fbe822b.png)

**Código**

```Xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                        http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
    version="4.0"
    metadata-complete="true">
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>     
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>/faces/*</url-pattern>
    </servlet-mapping>
    <welcome-file-list>
        <welcome-file>faces/index.xhtml</welcome-file>
    </welcome-file-list>
    
</web-app>
```

### Clean and Build y Run

![image](https://user-images.githubusercontent.com/31961588/191166675-fe11d5c1-e5fd-41dd-b504-6aa30dbf9750.png)









