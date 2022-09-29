# MangeBean

## Iniciamos desde el ejericio anterior

## 1. Creamos la clase candidato

![image](https://user-images.githubusercontent.com/31961588/191173843-d3add6f5-2c7a-4521-8bf5-fe6f0d531187.png)


**Candidato.java**
```Java
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
```

## 2. Modificamos xhtml

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
        </h:form>
    </body>
</html>
```

# 3. Ejecutamos. 

![image](https://user-images.githubusercontent.com/31961588/191177005-1277cdc3-1748-4320-88f9-c3a306e175ba.png)

