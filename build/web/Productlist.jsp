<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Product List</title>
        </head>
    <body>
        <style>
                .form-heading1{
                    font-size: 25px;
                    color: #2f3542;
                    text-align: center;
                    margin-bottom: 10px;
                }
                
                button:hover{
                    color: red;
                    filter:  opacity(80%);
                }
                
                .return{
                    
                    list-style: none;
                    margin-top: 5px ;
                    padding:0;
                    width: 100%;
                    height: 28px;
                    background: aliceblue;
                    border: 1px solid black ;
                    color: #2f3542;
                    text-transform: uppercase;
                    transition: 0.25s ease-in-out;
                }
                .return li {
                    position: relative;
                }
                .return li a{
                    text-align: center;
                    font-size: 14px;
                    color: #2f3542;
                    display: block;
                    margin-top: 0px;
                    margin-bottom: 0px;
                    padding: 6px 10px;
                    text-decoration: none;
                }
                .return li:hover a{
                    color: yellow;
                    filter:  opacity(80%);
                    
                }
                table{
                    width: 100%;
                    height: auto;
                    border: 2px solid blue;
                    text-align: center;
                }
                
        </style>
        <h1 class="form-heading1">Danh sách mặt hàng</h1>
        
                 
    <center><form id="form" method="POST" action="findServlet">
	 				<div  sclass="div">
		 				<input  type="text" name="name">
                                                <button>Tìm Kiếm</button>
                                                
	 				</div>
        </form></center>
    
             <ul class="return">
                            <li>
                                <a href="index.jsp" >Trang chủ</a>
                            </li>
            </ul>  
            <p style="color: red;">${errorString}</p>
            <table border="1" cellpadding="5" cellspacing="1" >
                    <tr>
                        <th>ID</th>
                        <th>User</th>
                        <th>Tên</th>
                        <th>Loại sp:</th>
                        <th>Loại</th>
                        <th>Giá</th>
                        <th>Mô tả</th>
                        <th>Ảnh minh họa</th>
                        <th>Sửa</th>
                        <th>Xóa</th>
                    </tr>
                <c:forEach items="${productList}" var="product" >
                    <tr>
                        <td>${product.getID()}</td>
                        <td>${product.getUser()}</td>
                        <td>${product.getName()}</td>
                        <td>${product.getLoaisp()}</td>
                        <td>${product.getType()}</td>
                        <td>${product.getPrice()}</td>
                        <td>${product.getDescription()}</td>
                        <td><img src=./${product.getImage()} width=150  height=150 /></td>
                        <td>
                            <a href="editProductServlet?ID=${product.getID()}">Sửa</a>
                        </td>
                       
                        <td>
                            <a href="deleteProductServlet?ID=${product.getID()}" onclick="showMess(product.getID())">Xóa</a>
                        </td>
                       
                    </tr>
                </c:forEach>
            </table>
            <ul class="return">
                            <li><a href="NewProduct.jsp" >Thêm sản phẩm</a></li>
            </ul>
            
    </body>
    <script>
        function showMess(product.getID()){
            var option = confirm('Are you want to delete?');
            if (option ===true){
                window.location.href= 'deleteProductServlet?ID='+product.getID();
            }
        }
    </script>
</html>
