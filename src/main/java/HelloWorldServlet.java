import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MarcoHelloWorld",
        urlPatterns = "/hello") //has to be outside the class. This is the metadata to go with our servlet
public class HelloWorldServlet extends HttpServlet { //this class extends from HttpServlet
    String name;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        name = request.getParameter("name");
        String nameCaps = null;

        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>Hello World Servlet</title>");
        response.getWriter().println("<head>");
        response.getWriter().println("<body>");

//***********Hello World with Name START***********

        if (name != null) {
            String[] names = name.split(" "); //splits names with space between them, into an array
            ArrayList<String> nameList = new ArrayList<>(); //bucket that will collect my names (tried doing regular concatenation, but didn't find it working, hence we're rolling with this)

            for (String name : names) {
                String caps = name.split("")[0].toUpperCase() + name.substring(1); //capitalizes first letter of name
                nameList.add(caps); //adds capitalized name to my ArrayList (for each name)
                StringBuilder string = new StringBuilder(); //created StringBuilder Object
                for (String s : nameList) { //each item in ArrayList is appended to the StringBuilder to create a complete string of names
                    string.append(" "); //separates names with spaces, by adding space before each append
                    string.append(s);
                }
                nameCaps = string.toString(); //getting the final string from StringBuilder, and putting it into a variable that is called on below
            } //only prints last name given
            //update: fixed using null instance, ArrayList and StringBuilder
            response.getWriter().println("<h1>Hello," + nameCaps + "!</h1>");
        } else {
            response.getWriter().println("<h1>Hello World!</h1>");
        }
        //localhost:8080/hello?name=tim --> Hello, Tim!
        //localhost:8080/hello?name=kenyon+luce --> Hello, Kenyon Luce!

//    *********Hello World with Name END***********

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
