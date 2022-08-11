package generic_servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class Generic_servlet
*/
public class Generic_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
    */
    public Generic_servlet()
    {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
	 response.getWriter();
	 String fname = request.getParameter("fname");
     String lname = request.getParameter("lname");    
     PrintWriter out = response.getWriter();
     out.println("Your full name is " +fname+" " +lname);
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}