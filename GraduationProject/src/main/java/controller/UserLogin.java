package controller;

import impl.UserServiceImpl;
import service.UserService;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by tqy on 15-11-28.
 */
public class UserLogin extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse response){
        PrintWriter out = null;
        try {
            req.setCharacterEncoding("UTF-8");
            out = response.getWriter();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        String name = req.getParameter("userName");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        if (userService.userCheckLogin(name, password) == true){
            out.println("<html>");
            out.println("<head>");
            out.println("<tilte>Ok</title>");
            out.println("</head>");
            out.println("</html>");
        }else{
            out.println("<html>");
            out.println("<head>");
            out.println("<tilte>Error</title>");
            out.println("</head>");
            out.println("</html>");
        }
    }
}
