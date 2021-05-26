import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="MarcoHelloWorld",
        urlPatterns = "/hello") //has to be outside the class. This is the metadata to go with our servlet
public class HelloWorldServlet extends HttpServlet { //this class extends from HttpServlet
    String name;
    int count;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        name = request.getParameter("name");
        if(name != null){
            response.getWriter().println("<h1>Hello, " + name + "!</h1>");
        } else {
            response.getWriter().println("<h1>Hello World!</h1>");
        }
        //localhost:8080/hello?name=tim --> Hello, tim!
        //localhost:8080/hello?name=kenyon+luce --> Hello, kenyon luce!


        //COUNT NUMBER OF VISITS + RESET
        if(request.getParameter("count").equals("start")){
            count++;
        }
        else if(request.getParameter("count").equals("reset")){
            count = 0;
        }
        response.getWriter().println("Times visited: " + count);
    }
}
