

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Yalashi Salon</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }
            .navbar h2{

                color: white ;
                margin-left: 35% ;
                margin-top: 10px;

            }

            .reg{

                width:350px ;
                margin-top: 30px;
                margin-left: 150px ;
                display:block;
                text-align: left ;
                border: 2px ;

            }

            input {

                display: block ;
                width: 100% ;
                padding: 5px ;
                -webkit-box-sizing: border-box ;
                -moz-box-sizing :border-box ;
                box-sizing:border-box ;


            }

            div.reg fieldset{

                border: black ;

            }

            .button {

                width: 150px;
                padding: 5px ;
                color: white;
                font-size: 17px ;
                background-color:#ff4d4d;
                border-radius: 5px ;
                margin-top: 10px ;
                margin-left: 25px ;
            }

             .button:hover{

                background-color: #732626 ;
            }
            div.reg a {

                font-style: normal ;
                float: left ;
                margin-right: 40px ;
                margin-top: 20px ;
                margin-left: 15px ;


            }

            div.reg a:hover {

                color: black ;


            }

            .details{

                background-color: #b9b979 ;
                color: black ;
                border-radius: 3px ;
                height: 550px ;
                margin-left: 20px ;

            }

            .data{

                margin-top: 30px ;
                margin-left:20px ;
            }

            .active{

                background-color: #66ff99 ;

            }
           .container-fluid li:hover{

                background-color: #66ff99 ;

            }
            /* Add a gray background color and some padding to the footer */
            footer {
                background-color: #b3b3b3;
                padding: 25px;
            }


            .foot1{

                border-right: 2px solid grey ;
                height: 110px ;
            }

            .foot2{

                margin-left: 30px ; 
            }

            .foot3{

                margin-left: 50px;
                margin-bottom: 25px ;
            }

            .carousel-inner img {
                width: 100%; /* Set width to 100% */
                margin: auto;
                min-height:200px;
            }
            
            .item{
                height: 650px;
            }
            
            .item active{
                height: 650px;
            }

            /* Hide the carousel text when the screen is less than 600 pixels wide */
            @media (max-width: 600px) {
                .carousel-caption {
                    display: none; 
                }
            }
        </style>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <li class="navbar-brand">Yalashi Beauty Salon</li>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="index.html"  >Home</a></li>

                </ul>
              <ul class="nav navbar-nav navbar-right">
                    <li><a href="login.jsp" class="active"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
              
                </ul>
            </div>
        </nav> 
        <br>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
                <li data-target="#myCarousel" data-slide-to="4"></li>
                <li data-target="#myCarousel" data-slide-to="5"></li>
                <li data-target="#myCarousel" data-slide-to="6"></li>


            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="images/main10.jpg" alt="Image">
                    <div class="carousel-caption">        
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main2.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main4.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>
                </div>

                <div class="item">
                    <img src="images/main8.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>

                <div class="item">
                    <img src="images/main9.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>

                <div class="item">
                    <img src="images/main6.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>


                <div class="item">
                    <img src="images/main7.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>



            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <div class="row">

            <div class="col-sm-6">                      
                <div id="reg"  class="reg">
                    <h1>Register Here</h1>
                    <form action="UserController" method="GET">
                        <p>
                            <label for="">Name:</label>
                            <input type="text" name="name" id="name" placeholder="Enter Your Name" required="">
                        </p>

                        <p>
                            <label for="">Address:</label>
                            <input type="text" name="address" id="address" placeholder="Enter Address" required="">
                        </p>

                        <p>
                            <label for="">Telephone:</label>
                            <input type="tel" name="tel" id="tel" placeholder="Enter Phone Number" required="">
                        </p>

                        <p>
                            <label for="">Email:</label>
                            <input type="email" name="email" id="email" placeholder="Enter e-mail Address" required="">
                        </p>

                        <p>
                            <label for="">Title:</label>
                            <input type="text" name="title" id="title" placeholder="Enter Title" required="">
                        </p>

                        <p>
                            <label for="">NIC No:</label>
                            <input type="text" name="nic" id="nic" placeholder="Enter Your NIC No" required="">
                        </p>

                        <p>
                            <label for="">Password :</label>
                            <input type="password" name="password" id="password" placeholder="Enter Your Password" required="">
                        </p> 
                        <p>
                            <label for="">Confirm Password :</label>
                            <input type="c_password" name="c_password" id="c_password_field" placeholder="Retype Password" required="">
                        </p> 

                        <p>
                            <a href="login.jsp">Back to login</a><input class="button" type="submit" name="register" value="Register">
                        </p>

                    </form>

                </div>
            </div>

            <div class="col-sm-4">
                <div class="details"><div class="data">

                        <h3><br>About Yalashi Salon </h3>         
                       <p>
                           Yalashi Salon is one of the leading and the best salons in Bangalore. With multiple outlets at convenient and upmarket locations, we are the go-to destination for all your hair and beauty requirements that involve style, expertise and pampering. Apart from having highly skilled and experienced staff as part of our team, we only use world-class quality of products for your treatment within all of our salons. This means the products you see on our salon shelves are the same we use to pamper your looks during each of your visits. We are proud purveyors of pure style and panache in our salons, and we work together as a team towards a singular objective – a beautiful, confident You !
                           </p>
               <p>The Play Salon for Hair and Skincare at Bangalore, takes pride in giving you the latest and the best in hairstyles and beauty treatments, creating the highest levels in style, sensibility and sophistication. The Play Experience is the new-age interpretation of Neerus – the definitive word for style and skin care for celebrities and the fashionistas of Bangalore, since the past two decades.</p>
                    </div></div>
            </div>

        </div>
 <hr>
        <footer class="container-fluid">

            <div class="foot1 col-sm-4"> <div class="col-sm-2"><br></div>
                <div class="col-sm-10 text-center">Connect with us<br><br><img src="images/others.png">  </div> 
            </div>

            <div class="foot2 col-sm-3"> 
                Yalashi Beauty Salon (Pvt) Ltd,<br>
                295/1,<br>
                Passara Road,<br>
                Badulla,<br>
                Sri Lanka.<br> 
            </div>

            <div class="foot3 col-sm-4"> 
                Hotline : +94 55 4558726 <img src="images/viber.png">&nbsp;<img src="images/whatsapp.png"><br> 
                <br>Telephone     : +94 71 8541297 <br>
                &emsp;&emsp;&emsp;&emsp;&emsp;&ensp;+94 71 47582146 <br>                             
                <br>e-mail   : yalashisalon@gmail.com<br>                           
            </div>

            <div class="text-center"></div>
        </footer>  

    </body>

</html>
