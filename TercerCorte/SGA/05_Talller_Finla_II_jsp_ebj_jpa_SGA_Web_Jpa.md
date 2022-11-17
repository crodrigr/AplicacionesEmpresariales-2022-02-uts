# Proyecto SGA WEB implementando JPA.


![image](https://user-images.githubusercontent.com/31961588/200236910-3be923d8-61a8-4cc6-b1d7-8f2171139231.png)

## 1. Crear el directorio resources

![image](https://user-images.githubusercontent.com/31961588/200237130-aec10497-4a2b-4e63-97bb-17f2db036667.png)

## 2 Copiamos del proyecto holamundo-jpa: log4j2.xml y persistence.xml

![image](https://user-images.githubusercontent.com/31961588/200237715-4d52a53d-ff03-4b64-a823-aaac19bb1f54.png)

## 3. Remplazar la clase persona de holamundo-jpa en sga-web-jpa

![image](https://user-images.githubusercontent.com/31961588/200238258-ac2eca86-eedd-446f-8ab2-168d462af6ed.png)

## 3.1 Persona.java

![image](https://user-images.githubusercontent.com/31961588/200238313-b906d7cd-d5e8-4375-b207-bb282438071e.png)


## 3.2 Se copia del pom.xml de holamundo-jpa al pom.xml de sga-web-jpa

![image](https://user-images.githubusercontent.com/31961588/200238572-08cda635-bd85-465e-8a09-07d2bc9ac102.png)

## 4. Crear PersonaDao

![image](https://user-images.githubusercontent.com/31961588/200238880-c9ccf27a-da91-4a63-a096-0bc7495e06be.png)

#### 4.1 PersonaDao.java

![image](https://user-images.githubusercontent.com/31961588/200239008-ae588a2e-34bc-49f6-94e1-c6d4d69635fb.png)

#### 4.2 PersonaDaoImpl.java

![image](https://user-images.githubusercontent.com/31961588/200239128-01404ed1-f99b-4229-9a25-24d1611ad9d8.png)

#### 4.3 PersonaDaoImpl.java

![image](https://user-images.githubusercontent.com/31961588/200239284-6f55ffe8-bc24-4c74-8696-06eb54828f9a.png)

#### 4.4 En Persona.java add un namequery  para obtener todas las personas de la bd

![image](https://user-images.githubusercontent.com/31961588/200239629-f29e596c-52a2-415a-82a1-6b331d974f7d.png)

#### 4.3 PersaonDaoImpl.java se definie la logica de los métodos que implementa de la interfaz

![image](https://user-images.githubusercontent.com/31961588/200239818-1f9305bc-588a-4016-b858-ca43486bdeb3.png)

#### 4.4 Utilización nameQuery

![image](https://user-images.githubusercontent.com/31961588/200240017-28ef46fa-0d04-44e4-866f-3ea1fd3cd17f.png)

![image](https://user-images.githubusercontent.com/31961588/200240830-73ab7549-65ab-43bf-94ea-b4470e854ed0.png)


#### 4.5 Verificar que el campo email en la tabla persona tenga la restricción de ser unico

![image](https://user-images.githubusercontent.com/31961588/200240600-3cc86b33-1cd0-4a1d-80f9-4f1059d1c196.png)

#### 4.6 Otros metodos

![image](https://user-images.githubusercontent.com/31961588/200241066-dcda9805-fdea-4378-9b00-cbcc762a0aa2.png)

### 4.7 Implementación de PersonaDao en PersonaSeviceImpl

![image](https://user-images.githubusercontent.com/31961588/200241472-f5bef2a0-ec95-4a66-b606-9f3813857531.png)

### 4.8 Ajustar el persistence.xml para usar jpa, ya que se va hacer desde el servidor. 

![image](https://user-images.githubusercontent.com/31961588/200241884-6f61787d-2ea3-4a0b-b3de-ca7ed2e60318.png)





