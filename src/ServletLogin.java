import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pp = resp.getWriter();
        HttpSession h = req.getSession(false);
        String s =(String)h.getAttribute("n");
        String p = (String)h.getAttribute("p");
        String s1 = req.getParameter("un");
        String s2 = req.getParameter("pswd");
        if (s1.equals(s)&&s2.equals(p)){
            pp.println("Welcome to the"+ s);
        }
    }
}
