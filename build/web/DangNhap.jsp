<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
                
                
                
                <!--<link rel="stylesheet" href="css/dangnhap.css">-->
                
                <title>Đăng nhập</title>
	</head>
	<body >
            <style>
                body{
                    background: url('./Images/bg.jpg');
                    background-size: cover; 
                    font-size: 20px;
                }
                #wrapper{
                    min-height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
                #form-login{
                    max-width: 400px;
                    background: url('./hinh4.jpg');
                    background-size: cover;
                    flex-grow: 1;
                    padding: 30px 30px 40px;
                    box-shadow: 0px 0px 17px 2px rgba(0,0,0,0.8);
                }
                .form-heading{
                    font-size: 25px;
                    color: #2f3542;
                    text-align: center;
                    margin-bottom: 10px;
                }
                .form-group{
                    border-bottom: 1px solid #2f3542;
                    margin-top: 15px;
                    margin-left: 10px;
                    margin-right: 10px;
                    margin-bottom: 20px;
                    display: flex;

                }
                .form-input{
                    background: transparent;
                    border: 0;
                    outline: 0;
                    color: #2f3542;
                    flex-grow: 1;
                }
                .form-input:placeholder{
                    color: background;
                }
                .form-submit{
                    background: aliceblue;
                    border: 1px solid black ;
                    color: #2f3542;
                    width: 100%;
                    text-transform: uppercase;
                    margin-top: 10px;
                    margin-bottom: 10px;
                    padding: 6px 10px;
                    transition: 0.25s ease-in-out;
                }
                .form-submit:hover{
                    filter:  opacity(80%);
                    color: green;
                }
                .signin{
                    
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
                .signin  li {
                    position: relative;
                }
                .signin li a{
                    text-align: center;
                    font-size: 14px;
                    color: #2f3542;
                    display: block;
                    margin-top: 0px;
                    margin-bottom: 0px;
                    padding: 6px 10px;
                    text-decoration: none;
                }
                .signin li:hover a{
                    color: orange;
                    filter:  opacity(80%);
                    
                }
                
                .return{
                    
                    list-style: none;
                    margin-top: 10px ;
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
            
		<!--<center>
                    <div class="DangNhap">
			<h1>ĐĂNG NHẬP</h1>
			<form method="POST" action="LogInServlet">
			<table>
                            <center><tr>
					<td>Tên đăng nhập</td>
                                        <td><input type="text" placeholder="username" name="username"/></td>
				</tr>
				<tr>
					<td>Mật khẩu</td>
					<td><input type="password" placeholder="password" name="password"/></td>
				</tr>
				<tr>
                                    <td colspan="2"><center><button>Đăng nhập</button>
                                    <input type="reset" value="reset"/></center></td>
                                </tr></center>
			</table>
			</form>
                      </div>

		</center>-->
                
                
                
                
                <div id="wrapper">
                    
                    <form method="POST" action="LogInServlet" id="form-login" >
                        <h1 class="form-heading">Đăng nhập tài khoản</h1>
                        <td>Tài khoản: </td>
                        <div class="form-group">
                            <td><input type="text" class="form-input" 
                                       placeholder="nhập tài khoản" name="username"/></td> 
                        </div> 
                        
                        <td>Mật khẩu: </td>
                        <div class="form-group">
                            <td><input type="password" class="form-input" 
                                       placeholder="nhập mật khẩu" name="password"/></td> 
                        </div> 
                        <input type="Submit" value="Đăng nhập" class="form-submit"/> 
                        <ul class="signin">
                            <li>
                                <a href="DangKy.jsp" >Đăng ký</a>
                            </li>
                        </ul>
                        <ul class="return">
                            <li>
                                <a href="index.jsp" >Trang chủ</a>
                            </li>
                        </ul>
                    </form>
                </div>
                
	</body>
</html>
