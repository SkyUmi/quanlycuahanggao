<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>NCC List</title>
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
        <h1 class="form-heading1">Danh sách nhà cung cấp</h1>
        
                 
    <center><form id="form" method="POST" action="findNCCServlet">
	 				<div  sclass="div">
		 				<input  type="text" name="nameNCC">
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
                        <th>Tên nhà cung cấp</th>
                        <th>Sản phẩm cung cấp</th>
                        <th>Địa chỉ</th>
                        <th>Email</th>
                        <th>Sdt</th>
                        <th>Sửa</th>
                        <th>Xóa</th>
                    </tr>
                <c:forEach items="${nCCList}" var="n" >
                    <tr>
                        <td>${n.getID()}</td>
                        <td>${n.getNameNCC()}</td>
                        <td>${n.getType()}</td>
                        <td>${n.getAddress()}</td>
                        <td>${n.getEmail()}</td>
                        <td>${n.getSdt()}</td>

                        
                        <td>
                            <a href="editNCCServlet?ID=${n.getID()}">Sửa</a>
                        </td>
                       
                        <td>
                            <a href="deleteNCCServlet?ID=${n.getID()}">Xóa</a>
                        </td>
                       
                    </tr>
                </c:forEach>
            </table>
            <ul class="return">
                            <li><a href="NewNCC.jsp" >Thêm nhà cung cấp</a></li>
            </ul>
            
    </body>
    
</html>
