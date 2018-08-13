import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletAssignment1 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter =resp.getWriter();
        printWriter.print("<html><body>");
        printWriter.print("<h1>Welcome to my program</h1>");
        printWriter.print("</body></html>");}

       /* resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String gn = req.getParameter("gn");
        String email = req.getParameter("email");
        String uname = req.getParameter("username");
        String pswd = req.getParameter("possword");

        if (
                fname != null && fname != "" && lname != null && lname != "" && gn != null && gn != "" && email != null && email != "" && uname != null && uname != "" && pswd != null && pswd != "") {

            p.print(fname + "Welcome to the Login Page");

            RequestDispatcher RDI = req.getRequestDispatcher("ServletLogin.jsp");
            RDI.include(req, resp);
        } else {
            p.print("<html><b><h>please fill the fields</h></b></html>");
            RequestDispatcher RD = req.getRequestDispatcher("login.jsp");
            RD.include(req, resp);
        }

        HttpSession hs = req.getSession();
        hs.setAttribute("n", uname);
        hs.setAttribute("p", pswd);*/

    }


