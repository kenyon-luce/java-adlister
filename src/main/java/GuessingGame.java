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
            int max = 3;
            int min = 1;
            int random = (int) (Math.floor(Math.random() * max) + min);

            String guess = request.getParameter("guess");
            int guessNumber = parseInt(guess);

            if(guessNumber > max | guessNumber < min){
                response.sendRedirect("/guess");
            } else if (guessNumber == random) {
                response.sendRedirect("/correct");
            } else {
                response.sendRedirect("/incorrect");
            }
        }
    }
}
