

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
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="ShowResources.jsp">Show Facilities</a></li>
                    
                     <% if (request.getSession().getAttribute("type").equals("admin")) { %>
                    <li><a href="AddResources.jsp"  class="active">Facilities</a></li>
                    <li><a href="ShowReservations.jsp">Show Reservation</a></li>
                    
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
                    <h1>Facilities</h1>
                   <form action="ResourceController" method="GET">
                        <p>
                            <label for="">Description:</label>
                            <input type="text" name="description" id="description" placeholder="Description" required="">
                        </p>

                        <p>
                            <label for="">Time Taken:</label>
                            <input type="text" name="authPerson" id="authPerson" placeholder="Time Taken" required="">
                        </p>

                        <p>
                            <label for="">Service Type:</label>
                            
                            <select name = "type">
                                <option value ="BridalDressing">Bridal Dressing</option>
                                <option value="HairCutting">Hair Cutting</option>
                                
                            </select>
                        </p>
                        
                        <p>
                            <label for="">Min Charges:</label>
                            <input type="text" name="maxCount" id="maxCount" placeholder="Min Charge" required="">
                        </p>

                        <p>
                            <label for="">Max Charges:</label>
                            <input type="text" name="charges" id="charges" placeholder="Max Charges" required="">
                        </p>

                        <p>
                            <input class="button" type="submit" name="addResource" value="Add Details">
                        </p>

                    </form>
                </div>
            </div>

            <div class="col-sm-4">
                <div class="details"><div class="data">

                        <h3><br>Facial Treatments </h3>         
                       <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again.</p>

                        <h3>wedding </h3>         
                        <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again</p>

                        <h3>Hair Cutting</h3>         
                       <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again</p> 

                        

                    </div></div>
            </div>

        </div>
 <hr>
        <footer class="container-fluid">

            <div class="foot1 col-sm-4"> <div class="col-sm-2"><br><img src="images/logo.png"></div>
                <div class="col-sm-10 text-center">Connect with us<br><br><img src="images/others.png">  </div> 
            </div>

            <div class="foot2 col-sm-3"> 
                Best of Lanka (Pvt) Ltd,<br>
                295/1,<br>
                Thilakarathne Mawatha,<br>
                Wilpathu ,<br>
                Sri Lanka.<br>  
            </div>

            <div class="foot3 col-sm-4"> 
                Hotline : +94 71 9538268 <img src="images/viber.png">&nbsp;<img src="images/whatsapp.png"><br> 
                <br>Telephone     : +94 71 2902834 , +94 70 2130370<br>
                &emsp;&emsp;&emsp;&emsp;&emsp;&ensp;+94 71 1595521 , +94 71 4795834<br>                             
                <br>e-mail   : uwucst@gmail.com<br>                          
            </div>

            <div class="text-center"></div>   </footer>  

    </body>

</html>
