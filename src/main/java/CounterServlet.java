import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

@WebServlet(name = "MarcoHelloWorld", urlPatterns = "/count")
public class CounterServlet {
    int count;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        //COUNT NUMBER OF VISITS + RESET
        if (request.getParameter("count").equals("start")) {
            count++;
        } else if (request.getParameter("count").equals("reset")) {
            count = 0;
//            String path = request.getContextPath();
//            URLSearchParams.delete(count);
        }
        response.getWriter().println("Times visited: " + count);
    }
}
