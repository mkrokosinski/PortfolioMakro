package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mapsFiles.Users;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet.do")
public class LoginServlet extends HttpServlet {
	private Query query;
	private Session session = null;
	private SessionFactory sessionFactory;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("login");
		String password = request.getParameter("password");
		
		
		HttpSession httpSession = request.getSession();
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String query = "from Users where name=? and password=?";
		Query queryObj = session.createQuery(query);
		queryObj.setParameter(0, userName);
		queryObj.setParameter(1, password);
		List<Users> records = queryObj.list();
		System.out.println(queryObj.toString());
		if(records.size()>0){
		request.setAttribute("loginstatus", "Login Successful.");
		httpSession.setAttribute("username", userName);
		RequestDispatcher view = request.getRequestDispatcher("/data/index.jsp");  
        view.forward(request,response); 
		}else{
		request.setAttribute("loginstatus", "Username/Password do not match.");
		RequestDispatcher view = request.getRequestDispatcher("/data/index.jsp");  
        view.forward(request,response); 
	}

}
}
