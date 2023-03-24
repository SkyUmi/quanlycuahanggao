package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author THANH HAI
 */
@WebServlet(urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogInServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogInServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
        

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*HttpSession session=request.getSession;
    session.setAttribute("username",username);
    String user=session.getAttribute("user").toString();*/
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn;
        try {
            conn = MySQLConntUtils.getMySQLConnection();
            //xu ly tham so tu form
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            UserAccount usr=new UserAccount(username,password);//tao doi tuong user voi username va password
            //them doi tuong bao CSDL
            
            UserAccount u=DBUtils.findUser(conn, usr.getUserName(), usr.getPassword());
            
            /*if(usr.getUserName() == "admin" && usr.getPassword() == "123456")
            {
                UserAccount user=new UserAccount(u);
                request.setAttribute("username", "Bạn đã đăng nhập thành công. Chào bạn: "+ user.getUserName());
                
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }*/
            if(u != null)
            {
                UserAccount user=new UserAccount(u);
                request.setAttribute("username", "Bạn đã đăng nhập thành công. Chào bạn: "+ user.getUserName());
                
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
            else
            {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()){
                    out.print("<!DOCTYPE html>");
                    out.print("<html>");
                    out.print("<head>");
                    out.print("<title>Thông báo</title>");
                    out.print("</head>");
                    out.print("<body>");
                    out.print("<center><h1>Thông tin đăng nhập không chính xác <a href=DangNhap.jsp>Nhập lại</a></h1></center>");
                    out.print("<center><h1>Bạn có muốn đăng ký tài khoản mới? <a href=DangKy.jsp>Đăng Ký</a></h1></center>");
                    out.print("</body>");
                    out.print("</html>");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
                
        } catch (SQLException ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
