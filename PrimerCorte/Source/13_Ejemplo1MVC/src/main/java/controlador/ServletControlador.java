package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        //1. Procesamos parametros
        
        //2. Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3. Agregamos el javabean a algun alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        //4.redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
}
