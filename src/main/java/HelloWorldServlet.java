import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="MarcoHelloWorld", urlPatterns = "/") //has to be outside the class. This is the metadata to go with our servlet
public class HelloWorldServlet extends HttpServlet { //this class extends from HttpServlet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println("<h1>Hello World from the marco cohort!</h1>");

    }
}
