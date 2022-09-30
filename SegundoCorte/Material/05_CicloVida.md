# Ciclo de Vida. 

## 1. 
![image](https://user-images.githubusercontent.com/31961588/193358299-ca7f6e8f-ad9b-4360-b62a-0ec148811f0e.png)


### 2. Add las dependencias de log4j en el pom.xml

![image](https://user-images.githubusercontent.com/31961588/193358490-d67350a8-3bfe-47bf-b860-85605e7b6054.png)

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
