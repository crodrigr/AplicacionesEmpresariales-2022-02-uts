# Crear proyecto con Hibernate

## 1. Creamos un proyecto Maven y Java Aplication

![image](https://user-images.githubusercontent.com/31961588/182502963-ee77d478-13e8-4916-bf8a-0af3ce6ec50e.png)


![image](https://user-images.githubusercontent.com/31961588/182503078-99a389d6-36eb-4393-ac3e-82f8a3cd90b0.png)


## 2. Agregamos las dependencias de hibernate y mysql

![image](https://user-images.githubusercontent.com/31961588/182503256-32bbcce5-d0e4-4734-912a-7f37c6164fe9.png)


![image](https://user-images.githubusercontent.com/31961588/182503322-51b787b8-bff3-4976-8bc8-bf3a5602ba77.png)

![image](https://user-images.githubusercontent.com/31961588/182503364-ef571665-1d75-4cf2-81cb-9ab1473c760b.png)

## 3. Clean and Build del proyecto

No tener activo software de proteccion como antivirus fireworks, va impidier conectarse al repositoro. 

![image](https://user-images.githubusercontent.com/31961588/182503437-fdd511b4-7de8-41e8-a1f7-a591d1259958.png)

## 4. Se crea el archivo de persistence.xml

![image](https://user-images.githubusercontent.com/31961588/182504176-45b5cc1d-72ca-4ef9-89e9-8d50128f6605.png)


```Xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence 
    http://xmlns.jcp.org/xml/ns/persistence_2_2.xsd">

    <persistence-unit name="HibernateEjemplo1" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>mx.com.gm.domain.Persona</class>
        <properties>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/test?useSSL=true&amp;useTimezone=true&amp;serverTimezone=UTC"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="admin"/>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>
        </properties>
    </persistence-unit>
</persistence> 
```

## 5. Se crea el archivo  log4j2

```Xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
        </Console>
    </Appenders>
    <Loggers>
        <Logger name="org.hibernate.SQL" level="debug" additivity="false">
            <AppenderRef ref="Console"/>
        </Logger>
        <Logger name="org.hibernate.type.descriptor.sql.BasicBinder" level="trace" additivity="false">
            <AppenderRef ref="Console"/>
        </Logger>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```

