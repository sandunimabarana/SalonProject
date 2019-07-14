

<%@page import="yala.pojo.Reservation"%>
<%@page import="java.util.List"%>
<%@page import="yala.UserDAOImplement.ReservationDAOImplement"%>
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
                margin-left: 100px ;

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
            
            .table th{
                
                margin-left: 40px ;
           
            }
            
            
            .button {

                width: 70px;
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
                    <li><a href="AddResources.jsp">Facilities</a></li>
                    <li><a href="ShowReservations.jsp"  class="active">Show Reservation</a></li>
                    
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

            <div class="col-sm-4">
                <div class="details"><div class="data">

                        <h3><br>Wedding Booking </h3>         
                        <p>
                            People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again
                        </p>

                        <h3>Cancellation Policy</h3>         
                        <ul>
                            <li> Before 21 days - 100% will be refunded. Less bank transition fees.</li>
                            <li>Within 15 to 20 days - 50% will be refunded.</li>
                            <li>Within 8 to 14 days - 25% will be refunded.</li>
                            <li>Less than 7 days - 100% cancellation charges.</li>                           
                        </ul>

                        

                    </div></div>
            </div>

            <div class="col-sm-5">                      
                <div id="reg"  class="reg">
                    <h1>Reservations</h1>

                    <table class="table">

                        <tr>
                            <th>Reservation Number</th>
                            <th>Date</th>
                            <th>Time</th>
                            <th>Reserved Resource</th>
                            <th>Reserved By</th>
                        </tr>

                        <%
                            ReservationDAOImplement reservationDaoImpl = new ReservationDAOImplement();
                            List<Reservation> list = reservationDaoImpl.showAllReservations();

                            for (int i = 0; i < list.size(); i++) {
                                Reservation reservation = new Reservation();
                                reservation = list.get(i);
                        %>

                        <tr>
                            <td><%out.print(reservation.getResev_No());%></td>
                            <td><%out.print(reservation.getDate());%></td>
                            <td><%out.print(reservation.getTime());%></td>
                            <td><%out.print(reservation.getRes_No());%></td>
                            <td><%out.print(reservation.getReg_No());%></td>

                            <td><form action="ReservationController" method="POST">
                                    <input type="hidden" name="reso_No" id = "reso_No" value="<%out.print(reservation.getResev_No());%>">
                                    <input class="button" type="submit" name="deleteReservation" value="Delete">
                                </form></td>
                        </tr>
                        <%
                }%>


                    </table>
                </div>
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
