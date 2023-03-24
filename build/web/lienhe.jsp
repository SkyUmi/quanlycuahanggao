<%-- 
    Document   : lienhe
    Created on : Jun 10, 2022, 8:04:57 PM
    Author     : THANH HAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liên Hệ</title>
    </head>
    <body>
        <style>
            body{
                background: url('./Images/bg.jpg');
                background-size: cover;
                font-family: arial;
            }
            #lienlac{
                    min-height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
            }
            .container{
                max-width: 800px;
                background-color: #fff;
                flex-grow: 1;
                padding: 30px 30px 40px;
                box-shadow: 0px 0px 17px 2px rgba(0,0,0,0.8);
            }
            .form-heading{
                font-size: 50px;
                color: #2f3542;
                text-align: center;
                margin-bottom: 10px;
            }
            h3{
                font-size: 30px;
                color: #2f3542;
                margin: 30px;
            }
            h5{
                font-family: times new roman;
                color: #446084;
                font-size: 20px;
                margin-left: 50px; 
            }
            
            .return{
                    
                    list-style: none;
                    margin-top: 5px ;
                    padding: 0;
                    width: 200px;
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
        <div id="lienlac">
            <div class="container">
            <h1 class="form-heading">Thông tin liên lạc</h1>
		<div class="lienlac-tp">
                    
                    <h3>Địa Chỉ liên hệ: </h3>
                    <h5>4/58E, ấp Nam Thới, xã Thới Tam Thôn, huyện Hóc Môn, tp.HCM</h5>
                </div>
                <div class="lienlac-tp">
                    
                    <h3>Hotline</h3>
                    <h5>Hotline: 0333795190</h5>
                </div>
                <div class="lienlac-tp">
                    
                    <h3>Email liên hệ: </h3>
                    <h5>phanthanhhaihn123456a@gmail.com</h5>
                </div>
            
                <ul class="return">
                            <li>
                                <a href="index.jsp" >Trang chủ</a>
                            </li>
                </ul>  
            
            </div>
        </div>
    </body>
</html>
