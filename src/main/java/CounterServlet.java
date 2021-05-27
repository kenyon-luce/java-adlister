import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    int count;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //COUNT NUMBER OF VISITS + RESET
        count++;
        if (request.getParameter("reset") != null) {
            count = 0;
            response.sendRedirect("/count"); //goes back to counting after resetting count
        }

        response.getWriter().println("Times visited: " + count);
    }
}
