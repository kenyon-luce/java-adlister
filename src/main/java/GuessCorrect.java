import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet(name = "GuessCorrect", urlPatterns = "/correct")
public class GuessCorrect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String outcome = "You Win!";
        request.setAttribute("output", outcome);
        request.getRequestDispatcher("/guess-outcome.jsp").forward(request, response);

    }
}