<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert NCC</title>
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
                #wrapper1{
                    min-height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
                #insertproduct{
                    max-width: 400px;
                    background-color: #fff; 
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
                    color: blue;
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
            
    <!--<form method="POST" action="newProductServlet" enctype ="multipart/form-data">
        <center><h1>Thêm mặt hàng</h1>
    <table>
        <tr>
            <td>ID mặt hàng:</td>
            <td><input type="text" class="form-input1" 
                                       placeholder="MH0XX" name="ID"/></td>
        </tr>

        <tr>
            <td>Tên mặt hàng:</td>
            <td><input type="text" class="form-input1" 
                                       placeholder="Nhập tên mặt hàng" name="Name"/></td>
        </tr>

        <tr>
            <td>Loại:</td>
            <td><input type="text" class="form-input1" 
                                       placeholder="bao 25kg/50kg" name="Type"/></td>
        </tr>

        <tr>
            <td>Giá:</td>
            <td><input type="text" class="form-input1" 
                                       placeholder="500000" name="Price"/></td>
        </tr>

        <tr>
            <td>Ảnh minh họa:</td>
            <td><input type="file" name="Image"  value=""></td>
        </tr>

        <tr>
            <td clospan="2"><button>Thêm</button><input type="reset"></td>
            <td><button href="Productlist.jsp">Quay lại</button></td>
        </tr>
    </table></center>
        </form>
        <div>
        <h5>${thongbao}</h5>
        </div>-->

         <div id="wrapper1">

            <form method="POST" action="newNCCServlet" id="insertproduct">
                            <h1 class="form-heading1">Thêm nhà cung cấp</h1>
                            <td>ID nhà cung cấp:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="NCC0XX" name="ID"/></td>
                            </div> 
                             

                            <td>Tên nhà cung cấp:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="Nhập tên nhà cung cấp" name="NameNCC"/></td>
                            </div>

                            <td>Cung cấp loại:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="Nàng hương" name="Type"/></td>
                            </div>
                            
                            <td>Địa chỉ:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="4/200 Phạm Ngũ Lão" name="Address"/></td>
                            </div>

                            <td>Email:</td>
                            <div class="form-group1">
                                    <td><input type="text" class="form-input1" 
                                           placeholder="abc@gamil.com" name="Email"/></td>
                            </div>
                            
                            <td>Sdt:</td></br>
                            <div class="form-group1">
                                    <td><input type="text" class="form-input1" 
                                           placeholder="0364879512" name="Sdt"/></td>
                            </div>

                            
                            <input type="Submit" value="Thêm" class="form-submit1"/> 
                            <input type="Reset" value="Làm mới" class="form-submit1"/> 
                                <ul class="return">
                                    <li>
                                        <a href="NCCListServlet" >Quay lại</a>
                                    </li>
                                </ul>
            </form>
         </div>
    </body>
</html>
