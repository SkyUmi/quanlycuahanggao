package Servlet;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBUtils {
    public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {
        String sql = "Select  a.Username,User, a.Password,a.Sdt, a.Email, a.Gender, a.Address from UserAccount a  where a.UserName = ? and a.password= ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            String user = rs.getString("User");
            String sdt = rs.getString("Sdt");
            String email = rs.getString("Email");
            String gender = rs.getString("Gender");
            String address = rs.getString("Address");
            
            UserAccount usr = new UserAccount();

            usr.setUserName(userName);
            usr.setPassword(password);
            usr.setUser(user);
            usr.setSdt(sdt);
            usr.setEmail(email);
            usr.setGender(gender);
            usr.setAddress(address);
            return usr;
        }
    return null;
    }
    
    public static UserAccount findUser(Connection conn, String userName) throws SQLException {
        String sql = "Select  a.Username,User, a.Password,a.Sdt, a.Email, a.Gender, a.Address from UserAccount a where a.UserName = ? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            String password = rs.getString("Password");
            String user = rs.getString("User");
            String sdt = rs.getString("Sdt");
            String email = rs.getString("Email");
            String gender = rs.getString("Gender");
            String address = rs.getString("Address");


            UserAccount usr = new UserAccount();
            usr.setUserName(userName);
            usr.setPassword(password);
            usr.setUser(user);
            usr.setSdt(sdt);
            usr.setEmail(email);
            usr.setGender(gender);
            usr.setAddress(address);
            return usr;
    }
    return null;
    }
    
    public static List<Product> queryProduct(Connection conn) throws SQLException {
        String sql = "Select  a.ID,a.User, a.Name,a.Loaisp,  a.Type, a.Price, a.Description, a.Image from product a ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String user = rs.getString("User");
            String name = rs.getString("Name");
            String loaisp= rs.getString("Loaisp");
            String type= rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image= rs.getString("Image");
            Product product = new Product();
            
            product.setID(ID);
            product.setUser(user);
            product.setName(name);
            product.setLoaisp(loaisp);
            product.setType(type);
            product.setPrice(price);
            product.setDescription(description);
            product.setImage(image);
            list.add(product);
        }
    return list;
    }
    
     public static List<Product> querygaoProduct(Connection conn, String name) throws SQLException {
        String sql = "Select  a.ID,a.User, a.Name,a.Loaisp,  a.Type, a.Price, a.Description, a.Image from product a where loaisp = '"+name+"'  ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String user = rs.getString("User");
            String name_pr = rs.getString("Name");
            String loaisp= rs.getString("Loaisp");
            String type= rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image= rs.getString("Image");
            Product product = new Product();
            
            product.setID(ID);
            product.setUser(user);
            product.setName(name_pr);
            product.setLoaisp(loaisp);
            product.setType(type);
            product.setPrice(price);
            product.setDescription(description);
            product.setImage(image);
            list.add(product);
        }
    return list;
    }
     
     public static List<Product> querynepProduct(Connection conn, String name) throws SQLException {
        String sql = "Select  a.ID,a.User, a.Name,a.Loaisp,  a.Type, a.Price, a.Description, a.Image from product a where loaisp = '"+name+"'  ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String user = rs.getString("User");
            String name_pr = rs.getString("Name");
            String loaisp= rs.getString("Loaisp");
            String type= rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image= rs.getString("Image");
            Product product = new Product();
            
            product.setID(ID);
            product.setUser(user);
            product.setName(name_pr);
            product.setLoaisp(loaisp);
            product.setType(type);
            product.setPrice(price);
            product.setDescription(description);
            product.setImage(image);
            list.add(product);
        }
    return list;
    }
     
     public static List<Product> querycamProduct(Connection conn, String name) throws SQLException {
        String sql = "Select  a.ID,a.User, a.Name,a.Loaisp,  a.Type, a.Price, a.Description, a.Image from product a where loaisp = '"+name+"'  ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String user = rs.getString("User");
            String name_pr = rs.getString("Name");
            String loaisp= rs.getString("Loaisp");
            String type= rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image= rs.getString("Image");
            Product product = new Product();
            
            product.setID(ID);
            product.setUser(user);
            product.setName(name_pr);
            product.setLoaisp(loaisp);
            product.setType(type);
            product.setPrice(price);
            product.setDescription(description);
            product.setImage(image);
            list.add(product);
        }
    return list;
    }
    
    public static List<Product> searchproduct(Connection conn, String name) throws SQLException {
          String name_temp = "%"+name+"%";
        String sql = "Select  a.ID, a.User, a.Name,a.Loaisp,  a.Type, a.Price,a.Description, a.Image from product a where Name like '"+name_temp+"' ";
     //    PreparedStatement pstm = conn.prepareStatement(sql);
       PreparedStatement pstm = conn.prepareStatement(sql);
	    //    pstm.setString(1, ID);
	       // ResultSet rs=pstm;
     //   pstm.setString(1, name_temp);
       ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            String ID = rs.getString("ID");
            String user = rs.getString("User");
            String name_pr = rs.getString("Name");
            String loaisp= rs.getString("Loaisp");
            String type= rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image= rs.getString("Image");
            Product product = new Product();
            product.setID(ID);
            product.setUser(user);
            product.setName(name_pr);
            product.setType(loaisp);
            product.setType(type);
            product.setPrice(price);
            product.setDescription(description);
            product.setImage(image);
            list.add(product);
        }
    return list;
    }
    
    
    
    public static Product findProduct(Connection conn, String ID) throws SQLException {
        String sql = "Select  a.User, a.Name,a.Loaisp, a.Type, a.Price,a.Description, a.Image from product a where a.ID =?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            
            String user = rs.getString("User");
            String name = rs.getString("Name");
            String loaisp = rs.getString("Loaisp");
            String type = rs.getString("Type");
            String price = rs.getString("Price");
            String description = rs.getString("Description");
            String image = rs.getString("Image");
            Product product = new Product(ID,user, name,loaisp, type, price,description, image);
            return product;
        }
    return null;
    }
    
    public static Product getProduct(Connection conn,String ID) throws SQLException{
	        String sql="select * from product where ID =?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, ID);
	        ResultSet rs=pstm.executeQuery();
	        while(rs.next()){
	            Product pro=new Product();
                    
	            pro.setID(rs.getString("ID"));
                    pro.setUser(rs.getString("User"));
	            pro.setName(rs.getString("Name"));
                    pro.setLoaisp(rs.getString("Loaisp"));
	            pro.setType(rs.getString("Type"));
	            pro.setPrice (rs.getString("Price"));
                    pro.setDescription(rs.getString("Description"));
	            pro.setImage(rs.getString("Image"));
	            return pro;
	        }
	        return null;
	    }
    
    
    public static void updateProduct(Connection conn, Product product) throws SQLException {
        String sql = "Update product set User=?, Name =?,Loaisp =?, Type =?, Price=?,Description=?, Image=? where ID =? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1,product.getUser());
        pstm.setString(2, product.getName());
        pstm.setString(3, product.getLoaisp());
        pstm.setString(4, product.getType());
        pstm.setString(5, product.getPrice());
        pstm.setString(6, product.getDescription());
        pstm.setString(7, product.getImage());
        pstm.setString(8, product.getID());
        pstm.executeUpdate();
    }
    
    public static void insertProduct(Connection conn, Product product) throws SQLException {
        String sql = "Insert into product( ID,User, Name,Loaisp, Type, Price,Description, Image) values (?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
       
        pstm.setString(1, product.getID());
        pstm.setString(2, product.getUser());
        pstm.setString(3, product.getName());
        pstm.setString(4, product.getLoaisp());
        pstm.setString(5, product.getType());
        pstm.setString(6, product.getPrice());
        pstm.setString(7, product.getDescription());
        pstm.setString(8, product.getImage());
        pstm.executeUpdate();
    }
    
    public static void deleteProduct(Connection conn, String ID) throws SQLException {
        String sql = "Delete From product where ID= ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        pstm.executeUpdate();
    }

    
    
    public static List<KH> queryKH(Connection conn) throws SQLException {
        String sql = "Select  a.ID, a.NameKH ,  a.Typebus,a.Buypro, a.Address, a.Email, a.Sdt from KH a ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<KH> listKH = new ArrayList<KH>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String nameKH = rs.getString("NameKH");
            String typebus= rs.getString("Typebus");
            String buypro= rs.getString("Buypro");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt= rs.getString("Sdt");
            KH k = new KH();
            
            k.setID(ID);
            k.setNameKH(nameKH);
            k.setTypebus(typebus);
            k.setBuypro(buypro);
            k.setAddress(address);
            k.setEmail(email);
            k.setSdt(sdt);
            listKH.add(k);
        }
    return listKH;
    }
    
     
    
    public static List<KH> searchKH(Connection conn, String name) throws SQLException {
        String name_temp = "%"+name+"%";
        String sql = "Select  a.ID, a.NameKH ,  a.Typebus,a.Buypro, a.Address, a.Email, a.Sdt from KH a where NameKH like '"+name_temp+"' ";
     //    PreparedStatement pstm = conn.prepareStatement(sql);
        PreparedStatement pstm = conn.prepareStatement(sql);
	    //    pstm.setString(1, ID);
	       // ResultSet rs=pstm;
     //   pstm.setString(1, name_temp);
       ResultSet rs = pstm.executeQuery();
        List<KH> listKH = new ArrayList<KH>();
        while (rs.next()) {
            String ID = rs.getString("ID");
            String name_k = rs.getString("NameKH");
            String typebus= rs.getString("Typebus");
            String buypro= rs.getString("Buypro");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt= rs.getString("Sdt");
            KH k = new KH();

            k.setID(ID);
            k.setNameKH(name_k);
            k.setTypebus(typebus);
            k.setBuypro(buypro);
            k.setAddress(address);
            k.setEmail(email);
            k.setSdt(sdt);
            listKH.add(k);
        }
    return listKH;
    }
    
    
    
    public static KH findKH(Connection conn, String ID) throws SQLException {
        String sql = "Select   a.NameKH ,  a.Typebus,a.Buypro, a.Address, a.Email, a.Sdt from KH a where a.ID =?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            
            String nameKH = rs.getString("NameKH");
            String typebus = rs.getString("Typebus");
            String buypro = rs.getString("Buypro");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt = rs.getString("Sdt");
            KH k = new KH(ID,nameKH, typebus,buypro, address,email, sdt);
            return k;
        }
    return null;
    }
    
    public static KH getKH(Connection conn,String ID) throws SQLException{
	        String sql="select * from KH where ID =?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, ID);
	        ResultSet rs=pstm.executeQuery();
	        while(rs.next()){
	            KH k=new KH();
                    
	            k.setID(rs.getString("ID"));
	            k.setNameKH(rs.getString("NameKH"));
	            k.setTypebus(rs.getString("Typebus"));
                    k.setBuypro(rs.getString("Buypro"));
	            k.setAddress (rs.getString("Address"));
                    k.setEmail(rs.getString("Email"));
	            k.setSdt(rs.getString("Sdt"));
	            return k;
	        }
	        return null;
	    }
    
    
    public static void updateKH(Connection conn, KH k) throws SQLException {
        String sql = "Update KH set  NameKH =?,Typebus =?,Buypro=?, Address=?,Email=?, Sdt=? where ID =? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, k.getNameKH());
        pstm.setString(2, k.getTypebus());
        pstm.setString(3, k.getBuypro());
        pstm.setString(4, k.getAddress());
        pstm.setString(5, k.getEmail());
        pstm.setString(6, k.getSdt());
        pstm.setString(7, k.getID());
        pstm.executeUpdate();
    }
    
    public static void insertKH(Connection conn, KH k) throws SQLException {
        String sql = "Insert into KH( ID, NameKH, Typebus,Buypro, Address,Email, Sdt) values (?,?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
       
        pstm.setString(1, k.getID());
        pstm.setString(2, k.getNameKH());
        pstm.setString(3, k.getTypebus());
        pstm.setString(4, k.getBuypro());
        pstm.setString(5, k.getAddress());
        pstm.setString(6, k.getEmail());
        pstm.setString(7, k.getSdt());
        pstm.executeUpdate();
    }
    
    public static void deleteKH(Connection conn, String ID) throws SQLException {
        String sql = "Delete From KH where ID= ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        pstm.executeUpdate();
    }
    
    
    //nha cc
    public static List<NCC> queryNCC(Connection conn) throws SQLException {
        String sql = "Select  a.ID, a.NameNCC,  a.Type, a.Address, a.Email, a.Sdt from NCC a ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<NCC> listNCC = new ArrayList<NCC>();
        while (rs.next()) {
            
            String ID = rs.getString("ID");
            String nameNCC = rs.getString("NameNCC");
            String type= rs.getString("Type");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt= rs.getString("Sdt");
            NCC n = new NCC();
            
            n.setID(ID);
            n.setNameNCC(nameNCC);
            n.setType(type);
            n.setAddress(address);
            n.setEmail(email);
            n.setSdt(sdt);
            listNCC.add(n);
        }
    return listNCC;
    }
    
     
    
    public static List<NCC> searchNCC(Connection conn, String name) throws SQLException {
          String name_temp = "%"+name+"%";
        String sql = "Select  a.ID,  a.NameNCC,  a.Type, a.Address,a.Email, a.Sdt from NCC a where NameNCC like '"+name_temp+"' ";
     //    PreparedStatement pstm = conn.prepareStatement(sql);
       PreparedStatement pstm = conn.prepareStatement(sql);
	    //    pstm.setString(1, ID);
	       // ResultSet rs=pstm;
     //   pstm.setString(1, name_temp);
       ResultSet rs = pstm.executeQuery();
        List<NCC> listNCC = new ArrayList<NCC>();
        while (rs.next()) {
            String ID = rs.getString("ID");
            String name_n = rs.getString("NameNCC");
            String type= rs.getString("Type");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt= rs.getString("Sdt");
            NCC n = new NCC();
            n.setID(ID);
            n.setNameNCC(name_n);
            n.setType(type);
            n.setAddress(address);
            n.setEmail(email);
            n.setSdt(sdt);
            listNCC.add(n);
        }
    return listNCC;
    }
    
    
    
    public static NCC findNCC(Connection conn, String ID) throws SQLException {
        String sql = "Select  a.NameNCC, a.Type, a.Address,a.Email, a.Sdt from product a where a.ID =?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            
            String nameNCC = rs.getString("NameNCC");
            String type = rs.getString("Type");
            String address = rs.getString("Address");
            String email = rs.getString("Email");
            String sdt = rs.getString("Sdt");
            NCC n = new NCC(ID, nameNCC, type, address,email, sdt);
            return n;
        }
    return null;
    }
    
    public static NCC getNCC(Connection conn,String ID) throws SQLException{
	        String sql="select * from NCC where ID =?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, ID);
	        ResultSet rs=pstm.executeQuery();
	        while(rs.next()){
	            NCC n=new NCC();
                    
	            n.setID(rs.getString("ID"));
	            n.setNameNCC(rs.getString("NameNCC"));
	            n.setType(rs.getString("Type"));
	            n.setAddress (rs.getString("Address"));
                    n.setEmail(rs.getString("Email"));
	            n.setSdt(rs.getString("Sdt"));
	            return n;
	        }
	        return null;
	    }
    
    
    public static void updateNCC(Connection conn, NCC n) throws SQLException {
        String sql = "Update NCC set  NameNCC =?, Type =?, Address=?,Email=?, Sdt=? where ID =? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, n.getNameNCC());
        pstm.setString(2, n.getType());
        pstm.setString(3, n.getAddress());
        pstm.setString(4, n.getEmail());
        pstm.setString(5, n.getSdt());
        pstm.setString(6, n.getID());
        pstm.executeUpdate();
    }
    
    public static void insertNCC(Connection conn, NCC product) throws SQLException {
        String sql = "Insert into NCC( ID, NameNCC, Type, Address,Email, Sdt) values (?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
       
        pstm.setString(1, product.getID());
        pstm.setString(2, product.getNameNCC());
        pstm.setString(3, product.getType());
        pstm.setString(4, product.getAddress());
        pstm.setString(5, product.getEmail());
        pstm.setString(6, product.getSdt());
        pstm.executeUpdate();
    }
    
    public static void deleteNCC(Connection conn, String ID) throws SQLException {
        String sql = "Delete From NCC where ID= ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ID);
        pstm.executeUpdate();
    }
    
    public static void insertUserAccount(Connection conn, UserAccount user) throws SQLException {
        String sql = "Insert into UserAccount(Username,User, Sdt , Email, Gender, Address, Password) values (?,?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, user.getUserName());
        pstm.setString(2, user.getUser());
        pstm.setString(3, user.getSdt());
        pstm.setString(4, user.getEmail());
        pstm.setString(5, user.getGender());
        pstm.setString(6, user.getAddress());
        pstm.setString(7, user.getPassword());
        pstm.executeUpdate();
    }

  
}
