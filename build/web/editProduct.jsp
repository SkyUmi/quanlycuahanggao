<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Product</title>
    </head>
    <body>
    <!--<center><h1>Edit Product</h1></center>
        <form method="POST" action="editProductServlet" enctype="multipart/form-data">
        <table>
        <tr>
            <td>Product ID</td>
            <td><input type="text" name="ID" value="${product.getID()}"/></td>
        </tr>
        <tr>
            <td>Product Name</td>
        <td><input type="text" name="Name" value="${product.getName()}"/></td> 
        </tr>
        <tr>
            <td>Product Type</td>
        <td><input type="text" name="Type" value="${product.getType()}"/></td>
        </tr>
        <tr>
            <td>Product Price</td>
        <td><input type="text" name="Price" value="${product.getPrice()}"/></td>
        </tr>
        <tr>
            <td>Product Image</td>
            <td><img src="${product.getImage()}" width=100 height=100 /></td>
        </tr>
        <tr>
            <td>Change Image</td>
            <td><input type="file" name="Image" value=""></td>
        </tr>
        <tr>
            <td colspan="2"><button>Update</button><input type="reset"></td>
        </tr>
        <tr>
            <td> 
                <a href="ProductListServlet">Return</a>
            </td>
        </tr>
        </table>
        </form>
        <div> 
        <h5>${thongbao}</h5> 

        </div>-->
    
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
                #editproduct{
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
                    text-align: center;
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
                .edit{
                    
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
                .edit li {
                    position: relative;
                }
                .edit li a{
                    text-align: center;
                    font-size: 14px;
                    color: #2f3542;
                    display: block;
                    margin-top: 0px;
                    margin-bottom: 0px;
                    padding-top: 6px;
                    padding-bottom: 0px;
                    padding-left: 10px;
                    padding-right: 10px;
                    text-decoration: none;
                }
                .edit li:hover a{
                    color: yellow;
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
                button{
                    width: 100%;
                    height: 30px;
                    text-align: center;
                    font-size: 14px;
                    background: aliceblue;
                    text-transform: uppercase;
                }
                button:hover{
                    color: red;
                    filter:  opacity(80%);
                }
                
                
        </style>
            <div id="wrapper1">

            <form method="POST" action="editProductServlet" enctype="multipart/form-data" id="editproduct">
                            <h1 class="form-heading1">Sửa mặt hàng</h1>
                            <td>ID gạo:</td>
                            <div class="form-group1">
                                <td ><input type="hidden" class="form-input1" 
                                       placeholder="MH0XX" name="ID" value="${product.getID()}"/></td>
                            </div> 
                            <td>User:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="hai" name="User" value="${product.getUser()}"/></td>
                            </div> 

                            <td>Tên gạo:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="Nhập tên mới" name="Name" value="${product.getName()}"/></td>
                            </div>
                            
                            <td>Loại sp:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="Nhập loại" name="Loaisp" value="${product.getLoaisp()}"/></td>
                            </div>

                            <td>Loại:</td>
                            <div class="form-group1">
                                <td><input type="text" class="form-input1" 
                                       placeholder="bao 25kg/50kg" name="Type" value="${product.getType()}"/></td>
                            </div>
                            
                            <!--<div class="type">Loại: </div> 

                                <input class="25kg" type="radio"  name="Type" required value="Bao 25kg">
                                <span for="25kg">Bao 25kg</span>
                                <input class="50kg" type="radio"  name="Type" required value="Bao 50kg">
                                <span for="50kg">Bao 50kg</span>
                                <input class="100kg" type="radio"  name="Type" required value="Bao 100kg">
                                <span for="100kg">Bao 100kg</span>-->

                            <td>Giá:</td>
                            <div class="form-group1">
                                    <td><input type="text" class="form-input1" 
                                           placeholder="500.000đ" name="Price" value="${product.getPrice()}"/></td>
                            </div>
                            
                            <td>Mô tả:</td></br>
                            <div class="form-group1">
                                    <td><input type="text" class="form-input1" 
                                           placeholder="Dẻo" name="Description" value="${product.getDescription()}"/></td>
                            </div>
                            <td><input type="hidden" name="Image_temp"  value="${product.getImage()}"></td>
                            <td>Ảnh minh họa:</td>
                            <div class="form-group1">
                                    <td><input type="file" name="Image"  value="${product.getImage()}"></td>
                            </div>
                            <div>
                                <center><td colspan="2"><button>Cập nhật</button></td></center>
                            </div>
                             
                                <ul class="return">
                                    <li>
                                        <a href="ProductListServlet" >Quay lại</a>
                                    </li>
                                </ul>
            </form>
         </div>
        </body>
</html>