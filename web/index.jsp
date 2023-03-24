<%-- 
    Document   : index
    Created on : Jun 7, 2022, 11:19:09 PM
    Author     : THANH HAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <style>
            
            body{
                background-image: url('./Images/bg.jpg');
                background-size: cover;
                font-family: arial;
                font-size: 30px;
            }
            .container{
                width: auto;
                margin: 0px auto;
            }
            
            ul li{
                list-style: none;
            }
            

            #header{
                
                background-color: #fff;
                
                padding-top: 10px;
                padding-bottom: 5px
                
            }
            nav{
                display: flex;
                justify-content: space-between;
                
            }
            #logo{
                padding-top: 5px ;
                padding-bottom: 0px;
            }
            #logo img{
                max-width: 60px;
                height: auto;
            }
            #main_menu{
                display: flex;
                list-style: none;
                margin: 0;
                padding: 0;
                
            }
            #main_menu li {
                position: relative;
            }
            #main_menu li a{
                color: black;
                display: block;
                padding: 20px;
                text-decoration: none;
            }
            #main_menu li:hover a{
                border-bottom: greenyellow;
                color: greenyellow;
            }
            #main_menu li:hover ul.sub-menu{
                /*làm xuất hiện bảng con của sản phẩm*/
                display: block;
            }
            #main_menu ul.sub-menu{
                position: absolute;
                background-color: darkgray;
                padding: 15px 0px;
                list-style: none;
                width: 180px;
                display: none;
            }
            #main_menu ul.sub-menu a{
                padding: 8px 15px;
                border: 1px solid black;
            }
            #main_menu ul.sub-menu li:hover a{
                border-bottom: 1px solid darkorange;
                color: darkorange;
            }
            #main_menu ul.sub-menu li:first-child a{
                border: none;
            }
            #main_menu ul.sub-menu li:last-child a{
                border: none;
            }
            #main_menu>li>a{
                position: relative;
            }
            #main_menu>li>a::before{
                /*tạo gạch dưới thẻ a*/
                content: "";
                height: 4px;
                width: 0px;
                background: lightskyblue;
                position: absolute;
                bottom: 0px;
                left: 0px;
                transition: 0.25s;
            }
            #main_menu>li:hover>a::before{
                width: 100%
            }
            #main_menu>li.has-child::after{
                content: "*";
                position: absolute;
                top: 0px;
                right: 0px;
                padding-top: 30px ;
                padding-right: 0px;
                padding-left: 0px;
            }
            

            *{
                padding: 0;
                margin: 0;
            } 
            #wp_content{
                max-width: 1170px;
                margin: 0px auto;
                padding-top: 0px;    
            }
            .headline{
                text-align: center;
                margin: 40px 0px;
            }
            h1{
                font-weight: 300;
                color: aqua;
            }
            h4{
                color: #fff;
                padding: 10px 20px;
            }
            h3{
                font-size: 18px;
                color: #fff;
                padding: 10px 20px;
                text-transform: uppercase; 
                border: 1px solid #fff;
                display: inline-block;
                font-weight: 600;
                
            }
            ul.products{
                display: flex;
                flex-wrap: wrap;
                justify-content: space-between;
                
            }
            ul.products li{
                flex-basis: 25%;
                padding-left: 15px;
                padding-right: 15px;
                padding-bottom: 30px;
                box-sizing: border-box;
            }
            ul.products li img{
                max-width: 100%;
                height: auto;
            }
            ul.products li .product-top {
                position: relative;
                overflow: hidden;
            }
            ul.products li .product-top .product-thumb {
                display: block;
            }
            ul.products li:hover .product-top .product-thumb img{ 
                filter:  opacity(80%);/*làm mờ ảnh khi hover*/
            }
            ul.products li .product-top .product-thumb img{
                display: block; /*xóa khoảng cách giữa ảnh và mua ngay*/
            }
            ul.products li .product-top a.buy-now{
                text-transform: uppercase;
                text-decoration: none;
                text-align: center;
                display: block;
                background-color: #446084;
                color: #fff;
                padding: 10px 0px;
                position: absolute;
                bottom: -55px;/*độ dài thanh mua ngay*/
                width: 100%;
                transition: 0.25s ease-in-out;
                opacity: 0.85; /*làm trong suốt mua ngay*/
            }
            ul.products li:hover a.buy-now{
                bottom: 0px;
            }
            ul.products li .product-info{
                padding: 10px 0px;
            }
            ul.products li .product-info a{
               display: block;
               text-decoration: none;
               
            }
            ul.products li .product-info a.product-cat{
                font-size: 11px;
                text-transform: uppercase;
                color: #fff;
                padding: 3px 0px;
            }
            ul.products li .product-info a.product-name{
                color: #fff;
                padding: 3px 0px;
            }
            ul.products li .product-info .product-price{
                color: orange;
                padding: 3px 0px;
                font-weight: 600;
            }
        </style>
        <div id="wrapper">
            <div id="header">
                <nav class="container">
                    <a href="" id="logo">
                        <img src="Images/cvg.jpg" alt="Quản lý phân phối gạo của cửa hàng CVG">
                    </a>
                
                <ul id="main_menu">
                    <li><a href="index.jsp">Trang chủ</a></li>
                    <li><a href="ProductListServlet">Sản phẩm</a>
                        <ul class="sub-menu">
                            <li><a href="ProductListServlet">Tất cả</a></li>
                            <li><a href="gaoProductServlet">Gạo</a></li>
                            <li><a href="nepProductServlet">Nếp</a></li> 
                            <li><a href="camProductServlet">Cám</a></li>
                        </ul>
                    </li> 
                    <li><a href="KHListServlet">Khách Hàng</a></li>
                    <li><a href="NCCListServlet">Nhà Cung Cấp</a></li> 
                    <li><a href="lienhe.jsp">Liên hệ</a></li> 
                    <li><a href="DangKy.jsp">Đăng ký</a></li> 
                    <li><a href="DangNhap.jsp">Đăng nhập</a></li> 
                </ul>
                </nav>
                
            </div>
            <div id="wp_content">
                <div class="headline">
                
                    
                    <h1>Chào mừng bạn đã đến với cửa hàng quản lý phân phối gạo CVG</h1>
                    <h4>${username}</h4>
                    <h3>Sản phẩm bán chạy</h3>
                </div>
                <ul class="products">
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/miensua.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo Lài sữa Miên</a>
                                <div class="product-price">Dẻo Mềm Thơm</div>
                                <div class="product-price">27.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/st25.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo ST25</a>
                                <div class="product-price">Dẻo Mềm Thơm</div>
                                <div class="product-price">35.000đ/kg</div>
                                
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/st24.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo ST24</a>
                                <div class="product-price">Dẻo Mềm Thơm</div>
                                <div class="product-price">30.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/lainhat.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo Lài sữa Nhật</a>
                                <div class="product-price">Dẻo Thơm</div>
                                <div class="product-price">18.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/hatngoctroi.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo Hạt Ngọc Trời</a>
                                <div class="product-price">Dẻo Thơm</div>
                                <div class="product-price">26.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/404.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 50kg</a>
                                <a href="" class="product-name">Gạo Nở 404</a>
                                <div class="product-price">Xốp Nở</div>
                                <div class="product-price">12.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/huyetrong.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo lứt Huyết Rồng</a>
                                <div class="product-price">Xốp Mềm</div>
                                <div class="product-price">23.000đ/kg</div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="product-item">
                            <div class="product-top">
                                <a href="" class="product-thumb">
                                    <img src="Images/tainguyencd.jpg" alt="alt"/>
                                </a>
                                <!--<a href="" class="buy-now">Thông tin</a>-->
                            </div>
                            <div class="product-info">
                                <a href="" class="product-cat">Bao 25kg</a>
                                <a href="" class="product-name">Gạo tài nguyên Chợ Đào</a>
                                <div class="product-price">Xốp Thơm Mềm</div>
                                <div class="product-price">16.500đ/kg</div>
                            </div>
                        </div>
                    </li>
                    
                </ul>
            </div>
            <div id="footer">
                
            </div>
            
        </div> 
       <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>
            $(document).ready(function(){
                //tìm li có submenu và thêm vào class has child 
            });$('.sub-menu').parent('li').addClass('has-child');
        </script>
    </body>
</html>
