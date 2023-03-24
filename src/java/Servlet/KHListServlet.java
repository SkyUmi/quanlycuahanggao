




package Servlet;
import static Servlet.DBUtils.deleteKH;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class ProductListServlet
*/
@WebServlet("/KHListServlet")
public class KHListServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 /**
 * @see HttpServlet#HttpServlet()
 */
 public KHListServlet() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
response)
*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            // TODO Auto-generated method stub
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
            response.getWriter().append("Served at: ").append(request.getContextPath());
            //Connection conn = MyUtils.getStoredConnection(request);
            String errorString = null;
            List<KH> listKH = new ArrayList<KH>();
            try {
                Connection conn = MySQLConntUtils.getMySQLConnection();
                listKH = DBUtils.queryKH(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
                e.printStackTrace();
            }

            request.setAttribute("errorString",errorString);
            request.setAttribute("kHList", listKH);
            // Forward sang /WEB-INF/views/productListView.jsp
            request.getRequestDispatcher("/KHlist.jsp").forward(request, response);
            }
            /**
            * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
            response)
            */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        doGet(request, response);
    }
}
