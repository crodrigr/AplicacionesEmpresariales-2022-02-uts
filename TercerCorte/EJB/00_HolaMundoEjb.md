# Taller Hola Mundo con EjB

## Objetivo del Ejercicio

![image](https://user-images.githubusercontent.com/31961588/197352640-946a6f52-12a7-4325-a300-3e1371ea72e9.png)


![image](https://user-images.githubusercontent.com/31961588/197352687-397b6df4-23b3-4fde-8589-7ac9151cb69d.png)


## 1. Crear un proyecto maven aplication 

![image](https://user-images.githubusercontent.com/31961588/197352758-e7d11d57-cf94-4b17-ae3d-8281ebde050c.png)

![image](https://user-images.githubusercontent.com/31961588/197352778-4e1cac1e-fd27-49ea-ac4b-53ae0c6aa47a.png)

### 1.1 Usar el java 1.8 configurar el pom.xml

![image](https://user-images.githubusercontent.com/31961588/197352863-326828d1-93ce-48bf-bdc8-0e297a83343c.png)

### 1.2 Revisar la propiedades del proyecto para que use java 1.8

![image](https://user-images.githubusercontent.com/31961588/197352929-b9ff1730-bc0b-4bb5-96a8-640fe7990597.png)

### 1.3 Compile 1.8

![image](https://user-images.githubusercontent.com/31961588/197352949-51c0c4ef-ad20-4b18-a4a7-8fc5920b7360.png)

### 1.4 Add la dependencia de Javaee

![image](https://user-images.githubusercontent.com/31961588/197353110-4549b93a-6362-4738-bc83-78276408c917.png)

### 1.5 Add la dependencia para ejecutar el cliente del EJB

![image](https://user-images.githubusercontent.com/31961588/197353685-4757296f-4ad4-4b27-8e14-9092bc63778a.png)

## 2. Crear una interfaz remote para no acceder directamente el Ejb

### 2.1

![image](https://user-images.githubusercontent.com/31961588/197353765-4d7c133b-6ead-4f1a-a96c-eca600577d6e.png)

### 2.3

![image](https://user-images.githubusercontent.com/31961588/197353786-92053acf-d08d-4674-88d3-bf3d7250ad12.png)


### 2.4 Interfaz

![image](https://user-images.githubusercontent.com/31961588/197353852-e9f45c04-8170-4649-8f40-b67761e47335.png)

### 2.5 Crear la clases que implemnta la interfaz

![image](https://user-images.githubusercontent.com/31961588/197353932-d4b752ff-49ee-449a-be61-42436783e0a6.png)

### 2.6 

![image](https://user-images.githubusercontent.com/31961588/197353967-4c0c8b1e-a6bf-45dc-bd50-53d19c696817.png)


## 2.7 Generar el jar.  Hacer clean an build de proyecto. 

Se copia le .jar del proyecto y se hace el deploy en el glassfish. Esto se hace de forma manual

### 2.7.1
![image](https://user-images.githubusercontent.com/31961588/197416914-424b67e0-ac97-48fa-bd6d-f328ac5fe5c2.png)

### 2.7.2
![image](https://user-images.githubusercontent.com/31961588/197416992-f6437a37-527f-498f-8eee-f3b62968b870.png)

### 2.7.3

![image](https://user-images.githubusercontent.com/31961588/197417200-4fbcf4cb-f27d-4f1f-8327-01327e3064a2.png)


### 2.7.4

![image](https://user-images.githubusercontent.com/31961588/197417246-8ae3e0d6-7267-4989-831d-41b2f9643bf5.png)

### 2.7.5

![image](https://user-images.githubusercontent.com/31961588/197417293-06f09940-0b02-4173-bffa-48d141e5d522.png)

### 2.7.6

![image](https://user-images.githubusercontent.com/31961588/197417421-47c75bf3-74cc-463a-8c3c-1e74632fbf11.png)


### 2.7.8

![image](https://user-images.githubusercontent.com/31961588/197417475-068698cc-a877-4d4f-a51c-2bc6c575622f.png)

### 2.7.9 Nombre para invocar el Ejb a traves de JNDI

![image](https://user-images.githubusercontent.com/31961588/197418300-acebc7c3-ed87-4e4e-96f7-c6f0b705be4e.png)


## 3. Crear cliente que consume al Ejb.

![image](https://user-images.githubusercontent.com/31961588/197418225-cbc08a19-4261-4057-bb3a-81c8baf31935.png)


### 3.1 Class TestHolaMundoEJB

![image](https://user-images.githubusercontent.com/31961588/197418321-11f0dc54-3632-444f-bf4c-e1198d72a018.png)


#### 3.2 Ejecutar

![image](https://user-images.githubusercontent.com/31961588/197418576-b5040133-0ba8-4217-9526-5e6f26d6402a.png)



