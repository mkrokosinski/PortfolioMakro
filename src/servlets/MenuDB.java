package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mapsFiles.Menu;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/MenuDB")
public class MenuDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Menu> menuList;
	private Query query;
	private Session session = null;
	private SessionFactory sessionFactory;
	
	public MenuDB() {
		super();

	}
	
	public void init(ServletConfig config) throws ServletException {
	    super.init(config); 
	    sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		query = session.createQuery("from Menu");
		System.out.println("Database contents delivered...");
		
		}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		
		menuList = query.list();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("listMenu", menuList);
		request.setAttribute("menu", menuList);
		RequestDispatcher view = request.getRequestDispatcher("/template/menu.jsp");  
        view.forward(request,response);  
	}

}
