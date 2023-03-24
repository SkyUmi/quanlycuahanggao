<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                
		<title>Đăng ký</title>
               
	</head>
	<body>
            <style>
                body{
                    background: url('./Images/bg.jpg');
                    background-size: cover; 
                    font-size: 20px;
                    font-family: arial;
                }
                h1{
                    margin-top: 5px;
                    margin-bottom: 5px;
                    font-size: 20px;
                    color: #2f3542;
                    text-align: center;
                }
                label{
                    
                    padding-bottom: 5px;
                }
                #wrapper1{
                    min-height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
                #form-signin{
                    max-width: 400px;
                    background: url('./hinh4.jpg');
                    background-size: cover;
                    flex-grow: 1;
                    padding: 30px 30px 30px;
                    box-shadow: 0px 0px 17px 2px rgba(0,0,0,0.8);
                }
                
                
                .form-heading1{
                    font-size: 25px;
                    color: #2f3542;
                    text-align: center;
                    margin-bottom: 10px;
                }
                
                .form-group1{
                    border-bottom: 1px solid #2f3542;
                    margin-top: 15px;
                    margin-left: 10px;
                    margin-right: 10px;
                    margin-bottom: 10px;
                    display: flex;

                }

                .form-input1{
                    background: transparent;
                    border: 0;
                    outline: 0;
                    color: #2f3542;
                    flex-grow: 1;
                }
                .form-input1:placeholder{
                    color: background;
                }
                
                
                .form-submit1{
                    font-size: 14px;
                    background: aliceblue;
                    border: 1px solid black ;
                    color: #2f3542;
                    width: 100%;
                    text-transform: uppercase;
                    margin-top: 10px;
                    margin-bottom: 5px;
                    padding: 6px 10px;
                    transition: 0.25s ease-in-out;
                }
                .form-submit1:hover{
                    filter:  opacity(80%);                  
                    color: green;
                }
                
                .login{
                    
                    list-style: none;
                    margin: 0;
                    padding: 0;
                    width: 100%;
                    height: 28px;
                    background: aliceblue;
                    border: 1px solid black ;
                    color: #2f3542;
                    text-transform: uppercase;
                    transition: 0.25s ease-in-out;
                }
                .login li {
                    position: relative;
                }
                .login li a{
                    text-align: center;
                    font-size: 14px;
                    color: #2f3542;
                    display: block;
                    margin-top: 0px;
                    margin-bottom: 0px;
                    padding: 6px 10px;
                    text-decoration: none;
                }
                .login li:hover a{
                    
                    color: orange;
                    filter:  opacity(80%);
                    
                }
                
                .return{
                    
                    list-style: none;
                    margin-top: 5px ;
                    padding: 0;
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
                

            </style>
		
            <!-- <center><h1>ĐĂNG KÝ</h1></center>
			<form method="POST" action="SignInServlet">
				<table>
					<tr>
						<td>Tên đăng nhập</td>
						<td><input type="text" name="username"/></td>
					</tr>
					<tr>
						<td>Giới tính</td>
						<td><input type="text" name="gender"/></td>
					</tr>
					<tr>
						<td>Mật khẩu</td>
						<td><input type="password" name="password"/></td>
					</tr>
					<tr>
						<td colspan="2" ><button>Đăng ký</button><input type="reset" /></td>
					</tr>
				</table>
			</form>
			<div>
                            <center><h3>Thông tin đăng ký của bạn</h3>
                                    <h1>${username}</h1></center>
			</div>comment -->
            
            
            
		<div id="wrapper1">
                    
                    <form method="POST" action="SignInServlet" id="form-signin" >
                        <h1 class="form-heading1">Đăng ký tài khoản</h1>
                        <td>Tài khoản: </td>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập tài khoản" name="username"/></td> 
                        </div> 
                        
                        <td>User: </td>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập user" name="user"/></td> 
                        </div>
                        
                        <td>Số điện thoại: </td>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập sđt" name="sdt"/></td>
                        </div>
                        
                        <td>Email: </td>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập email" name="email"/></td>
                        </div>
                        
                        <!--<td>Giới tính: </td>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập giới tính" name="gender"/></td> 
                        </div>-->
                        <div class="gender">Giới tính: </div> 
                        
                            <input type="radio"  name="gender" required value="Nam">
                            <span for="gender">Nam</span>
                            <input class="female" type="radio"  name="gender" required value="Nữ">
                            <span for="female">Nữ</span>
                           
                            <br><td >Địa chỉ: </td></br>
                        <div class="form-group1">
                            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập địa chỉ" name="address"/></td> 
                        </div>
                        
                        <td>Mật khẩu: </td>
                        <div class="form-group1">
                            <td><input type="password" class="form-input1" 
                                       placeholder="Nhập mật khẩu" name="password"/></td> 
                        </div> 
                         
                        <input type="Submit" value="Đăng ký" class="form-submit1"/>
                        <ul class="login">
                            <li>
                                <a href="DangNhap.jsp" class="dangnhap">Đăng nhập</a>
                            </li>
                        </ul>
                        <ul class="return">
                            <li>
                                <a href="index.jsp" class="quaylai">Trang chủ</a>
                            </li>
                        </ul>
                        
                        <div>
                            <h3 class="form-heading1">Tài khoản đăng ký của bạn là:</h3>
                                    <h1>${username}</h1>
                        </div>
                    </form>
                    
                </div>
	</body>
</html>