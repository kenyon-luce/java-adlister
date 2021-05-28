import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessIncorrect", urlPatterns = "/incorrect")
public class GuessIncorrect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
//        response.getWriter().println("<h1>You Lose!</h1>");
        String outcome = "<h1>You Lose!</h1>";
    }
}
