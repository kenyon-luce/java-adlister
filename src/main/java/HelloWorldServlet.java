import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="MarcoHelloWorld", urlPatterns = "/hello") //has to be outside the class. This is the metadata to go with our servlet
public class HelloWorldServlet extends HttpServlet { //this class extends from HttpServlet
    String name;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        name = request.getParameter("name");

        if(name != null){
            response.getWriter().println("<h1>Hello " + name + "!</h1>");
        } else {
            response.getWriter().println("<h1>Hello World!</h1>");
        }
    }
}
