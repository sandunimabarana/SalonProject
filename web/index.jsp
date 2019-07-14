
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Akeera Salon</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css" type="text/css"/>

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
                text-align: center ;
                margin-top:5px;

            }
            .nav{
                margin-left: 50px;

            }


            li{

                border-right: 1px solid #bbb;
                float:left ;
                color: white;
               padding-right: 20px;

            }

            li:last-child {
                border-right: none;
            }

            .active{

                background-color: #66ff99 ;

            }

            li:hover{

                background-color: #66ff99 ;

            }

            .carousel-indicators {

                margin-left: -40px ;

            }

            .row a:hover{

                color: #006600 ;
                text-decoration: none ;
            }

            /* Add a gray background color and some padding to the footer */
            footer {
                background-color: #b3b3b3;
                padding: 25px;
            }

            .carousel-inner img {
                width: 100%; /* Set width to 100% */
                margin: auto;
                min-height:200px;
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
                    <li class="navbar-brand">Akira Beauty Salon</li>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp"  class="active">Home</a></li>
                    <li><a href="ShowResources.jsp">Show Facilities</a></li>
                    
                     <% if (request.getSession().getAttribute("type").equals("admin")) { %>
                    <li><a href="AddResources.jsp">Facilities</a></li>
                    <li><a href="ShowReservations.jsp">Hair Cutting</a></li>
                    <li><a href="ShowReservations.jsp">Facial</a></li>
                    
                    <%}else if (request.getSession().getAttribute("type").equals("user")) {%>
                    <li><a href="WeddingBooking.jsp">Bridal Booking</a></li>
                    <li><a href="HairCuttingBooking.jsp">Hair Cutting</a></li>
                    <li><a href="FacialBooking.jsp">Facial</a></li>
                    <%}%>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <% if (request.getSession().getAttribute("email").equals(null)) {
                    %><li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                        <%
                        } else {
                        %><li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Log Out</a></li> <%
                    }
                        %>                 


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
                    <img src="images/main1.jpg" alt="Image">
                    <div class="carousel-caption">        
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main2.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>      
                </div>

                <div class="item">
                    <img src="images/main3.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div>
                </div>

                <div class="item">
                    <img src="images/main4.jpg" alt="Image">
                    <div class="carousel-caption">
                    </div> 
                </div>

                <div class="item">
                    <img src="images/main5.jpg" alt="Image">
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

        <div class="container text-center">    
            <h3>Discover Your True Beauty</h3><p>Akira Beauty Salon for more than a decade, has been on the forefront 
                of unveiling the feminine elegance providing excellent service in hair care, beauty care and bridal dressing. Our 
                sophisticated yet herbal spa treatments has been able to maintain a steady flow of clients throughout, hoping
                to get themselves pampered in our professional hands. We also offer full time and part time courses in hair and
                beauty care for the enthusiastic youth seeking a career in the current beauty industry.</p>

            <hr>
            <div class="row">
                <div class="col-sm-4">
                    <a href="BangloReservation.jsp"><img src="images/bride.jpg" class="img-responsive" style="width:100%;height: 300px" alt="Image"></a>
                    <br><a href="BangloReservation.jsp"><h4>Bridal Dressing</h4></a>
                </div>
                <div class="col-sm-4"> 
                    <a href="SafariReservation.jsp"><img src="images/hair.jpg" class="img-responsive" style="width:100%;height: 300px" alt="Image"></a>
                    <br><a href="SafariReservation.jsp"><h4>Hair Cutting</h4> </a>   
                </div>

                <div class="col-sm-4"> 
                    <a href="CampingReservation.jsp"><img src="images/camp.jpg" class="img-responsive" style="width:100%;height: 300px" alt="Image"></a>
                    <br><a href="CampingReservation.jsp"><h4>Facial Treatments</h4></a>    
                </div>

            </div>
        </div><br>

        <hr>
        <footer class="container-fluid">

            <div class="foot1 col-sm-4"> <div class="col-sm-2"><br><img src="images/logo.png"></div>
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