package Servlet;

import static Servlet.DBUtils.insertUserAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Servlet.DBUtils;
import Servlet.MySQLConntUtils;


@WebServlet("/findServlet")
public class findServlet extends HttpServlet
{
	//private int dn=0;
	private static final long serialVersionUID = 1L;
	public findServlet()
	{
		super();
		
	}
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection conn;
		try
		{
			request.setCharacterEncoding("utf-8");
			 response.setCharacterEncoding("utf-8");
			conn = MySQLConntUtils.getMySQLConnection();
			
			
			//String ID = request.getParameter("ID");
			String name = request.getParameter("name");
			//String type = request.getParameter("type");
                      //  String price = request.getParameter("price");

			
			List<Product> list = new ArrayList<Product>();
			
                        list = DBUtils.searchproduct(conn,name);
                      

                        
			////List<Product> list1 = new ArrayList<Product>();
			//list1 = DBUtils.queryProduct(conn);
			
				
				
				
				
				request.setAttribute("productList", list);
				
				
				
				//request.setAttribute("Product", list1);
				request.getRequestDispatcher("/Productlist.jsp").forward(request, response);
			
		}
		catch (ClassNotFoundException ex)
		{
			Logger.getLogger(findServlet.class.getName()).log(Level.SEVERE, null, ex);
			
		}
		catch (SQLException ex)
		{
			Logger.getLogger(findServlet.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
}