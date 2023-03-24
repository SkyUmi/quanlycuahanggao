package Servlet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
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
/**
* Servlet implementation class newProductServlet
*/
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 10,
    maxFileSize = 1024 * 1024 * 50,
    maxRequestSize = 1024 * 1024 * 100
)
@WebServlet("/newKHServlet")
public class newKHServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
    //private static final String UPLOAD_DIR = "Images";
 
 /**
 * @see HttpServlet#HttpServlet()
 */
    public newKHServlet() {
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
    response.getWriter().append("Served at: ").append(request.getContextPath());
    }
/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
response)
*/
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Connection conn = null; //connect SQL
    try {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        conn = MySQLConntUtils.getMySQLConnection();
        //xử lý tham số từ form
        String ID=request.getParameter("ID");
        String NameKH=request.getParameter("NameKH");
        String Typebus=request.getParameter("Typebus"); 
        String Buypro=request.getParameter("Buypro"); 
        String Address=request.getParameter("Address");
        String Email=request.getParameter("Email");
        String Sdt=request.getParameter("Sdt");

        /*String Image=""; 
        Part part= request.getPart("Image");
        String fileName=extractFileName(part);
        fileName=new File(fileName).getName();

        String path1=request.getContextPath();
        System.out.println(path1);
        part.write("C:/Users/THANH HAI/Documents/NetBeansProjects/CNJ/web/Images/"+fileName);
        Image="Images/"+fileName; */

        KH k=new KH(ID,  NameKH,Typebus,Buypro, Address,Email, Sdt); //tạo đối tượng product
    //thêm đối tượng vào CSDL
        DBUtils.insertKH(conn, k); 
        request.getRequestDispatcher("/NewKH.jsp").forward(request, response);
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(KHListServlet.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
    if(conn != null){
    try {
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(KHListServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    } 
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
}