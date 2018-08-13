import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome2servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter =resp.getWriter();
        if (
                "/Welcome".equals(req.getRequestURI())){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
            requestDispatcher.forward(req,resp);


        }
        else if ("/Welcome".equals(req.getRequestURI())){



        printWriter.print("<html><body>");
        printWriter.print("<h1>Welcome to my program</h1>");
        printWriter.print("</body></html>");}

        else {

            resp.getWriter().print("<font color='red><b>Incorrect username and password </b>/font");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome jsp");
            requestDispatcher.forward(req,resp);



        }
        System.out.println("test");





            /*ServletConfig config = getServletConfig();

        String greeting = config.getInitParameter("greteing");

        System.out.println(greeting);

        ServletContext context = getServletContext();

        System.out.println(context.getInitParameter("name")); */

    }
}
