# Backing Bean

## 1. Creamos la clase VacanteForm

![image](https://user-images.githubusercontent.com/31961588/191179157-fa0cf733-2778-4b11-97c8-482efcb5c74d.png)

**VacanteForm.java**

```Java

package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject
    private Candidato candidato;
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("Juan")){
            return "exito";
        }
        else
            return "fallo";
    }
}

```

## 2. Add Botón enviar en index.html

**index.html**

```Xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Hola Mundo JSF</title>
    </head>
    <body>
        <h:form>
            <table>
                <tr>
                    <td><h:outputLabel for="nombre" value="Nombre:"></h:outputLabel></td>
                    <td><h:inputText id="nombre" value="#{candidato.nombre}"></h:inputText></td>
                    <td><h:message for="nombre"></h:message></td>
                </tr>
            </table>
            <h:commandButton action="#{vacanteForm.enviar}" value="Enviar" />
        </h:form>
    </body>
</html>
```

## 3. Creamos exito.xhtml

![image](https://user-images.githubusercontent.com/31961588/191181134-7fb94df4-5639-418f-9d20-d9b17777429f.png)

**exito.xhtml**
```Xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Exito</title>
    </head>
    <body>
        <h:form>
            Gracias #{candidato.nombre} por aplicar a la vacante
            <br/>
            <h:commandLink action="index">Regresar</h:commandLink>
        </h:form>
    </body>
</html>
```

## 4. Creamos fallo.xhtml

**fallo.xhtml**
```Xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Fallo</title>
    </head>
    <body>
        <h:form>
            Lo siento #{candidato.nombre}, no hay vacantes por el momento
            <br/>
            <h:commandLink action="index">Regresar</h:commandLink>
        </h:form>
    </body>
</html>

```

# 5. Creamos el Beans.xml

![image](https://user-images.githubusercontent.com/31961588/191182351-4b8412a6-ff1c-4852-a865-bf41f6596485.png)

**beans.xml**

```Xml
<beans xmlns="http://xmlns.jcp.org/xml/ns/javaee"
       xmlns:xsi="http://www.w3.org/2001/XMLScheme-instance"
       xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                           http://xmlns.jcp.org/xml/ns/javaee/beans_2_0.xsd"
       bean-discovery-mode="all"
       version="2.0">
</beans>   
```


