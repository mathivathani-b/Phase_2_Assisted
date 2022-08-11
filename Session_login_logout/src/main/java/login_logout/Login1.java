package login_logout;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
* Servlet implementation class LoginServlet
*/
public class Login1 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public Login1() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 String userId = request.getParameter("userid");
                 HttpSession session=request.getSession();  
             session.setAttribute("userid",  userId);
                          
             response.sendRedirect("Dashboard");  
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}


