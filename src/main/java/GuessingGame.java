import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet(name = "GuessingGame", urlPatterns = "/guess")
public class GuessingGame extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if (request.getMethod().equalsIgnoreCase("post")) {
            String guess = request.getParameter("guess");
            int guessNumber = parseInt(guess);

            if (guessNumber >= 1 & guessNumber <= 3) {
                response.sendRedirect("/correct");
            } else {
                response.sendRedirect("/incorrect");
            }
        }
    }
}
