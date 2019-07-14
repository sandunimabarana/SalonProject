

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Yalashi salon</title>
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

            .login {

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

            div.login fieldset{

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
            }

           .button:hover{

                background-color: #732626 ;
            }
            div.login a {

                font-style: normal ;
                float: left ;
                margin-right: 40px ;
                margin-top: 20px ;


            }

            div.login a:hover {

                color: black ;


            }

            .details{

                background-color: #ecc6d8 ;
                color: black ;
                border-radius: 3px ;
                height: 230px ;


            }

            .data{

                margin-top: 30px ;
                margin-left: 20px ;
            }

            /* Add a gray background color and some padding to the footer */
            .container-fluid li{

                border-right: 1px solid #bbb;
                float:left ;
                color: white;


            }

           .container-fluid li:last-child {
                border-right: none;
            }

            .active{

                background-color: #66ff99 ;

            }

           .container-fluid li:hover{

                background-color: #66ff99 ;

            }

            .carousel-indicators {

              text-align: center;

            }

            .row a:hover{

                color: #006600 ;
                text-decoration: none ;
            }

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
                    <img src="images/main9.jpg" alt="Image">
                    <div class="carousel-caption">        
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main12.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main6.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>
                </div>

                <div class="item">
                    <img src="images/main2.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>

                <div class="item">
                    <img src="images/main5.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>

                <div class="item">
                    <img src="images/main3.jpg" alt="Image">
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
                <div id="login"  class="login">
                    <h1>Login Here</h1>
                    <form action="UserController" method="GET"><br>
                        <p>
                            <label for="">E mail : </label>
                            <input type="text" id = "email" name = "email" placeholder="Enter Your E mail" required>
                        </p>

                        <p>
                            <label for="">Password :</label>
                            <input type="password" id ="password" name = "password" placeholder="Enter Your Password" required>
                        </p> 

                        <p>
                            <a href="registration.jsp">Create a New Account</a><input class="button" type="submit" name="login" value="Login">
                        </p>
                    </form>
                </div>
            </div>

            <div class="col-sm-4">
                <div class="details"><div class="data">
                        <h3><br>Facilities</h3>         
                        <ul>
                            <li>Hair Cutting</li>
                            <li>Bridal Dressing</li>
                            <li>Facial Services</li>
                            <li>Wedding Booking</li>
                            
                        </ul>
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
