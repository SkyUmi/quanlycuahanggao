package Servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static Servlet.DBUtils.updateNCC;
import javax.servlet.http.HttpSession;
/**
* Servlet implementation class editProductServlet
*/
@MultipartConfig(
 fileSizeThreshold = 1024 * 1024 * 10,
 maxFileSize = 1024 * 1024 * 50,
 maxRequestSize = 1024 * 1024 * 100
)
@WebServlet("/editNCCServlet")
public class editNCCServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 /**
 * @see HttpServlet#HttpServlet()
 */
 public editNCCServlet() {
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
        String errorString = null;
         HttpSession session= request.getSession();
       // String user=session.getAttribute("user").toString();
        String ID=request.getParameter("ID");
        NCC n= new NCC();
        try {
            Connection conn = MySQLConntUtils.getMySQLConnection();
            n = DBUtils.getNCC(conn,ID);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }
        request.setAttribute("errorString",errorString);
        request.setAttribute("n", n);
        request.getRequestDispatcher("/editNCC.jsp").forward(request, response);
        }
        /**
        * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
        response)
        */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Connection conn = null; //connect SQL
        try {
        request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
            conn = MySQLConntUtils.getMySQLConnection();
            //HttpSession session= request.getSession();
            String ID=request.getParameter("ID");
            //String user=session.getAttribute("User").toString();
            String NameNCC=request.getParameter("NameNCC");
            String Type=request.getParameter("Type"); 
            String Address=request.getParameter("Address");
            String Email=request.getParameter("Email");
            String Sdt=request.getParameter("Sdt");
            
            NCC n = new NCC();
                   
            n=new NCC(ID,  NameNCC, Type, Address,Email, Sdt); //tạo đối tượng product
            
//thêm đối tượng vào CSDL
            DBUtils.updateNCC(conn, n); 
             List<NCC> listNCC = new ArrayList<NCC>();
           
                listNCC = DBUtils.queryNCC(conn);
            request.setAttribute("nCCList", listNCC);
           
            request.getRequestDispatcher("/NCClist.jsp").forward(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            } 
        //doGet(request, response);
        }
    /*private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
                }
            }
            return "";
        }*/
    private void updateNCC(Connection conn, NCC n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
