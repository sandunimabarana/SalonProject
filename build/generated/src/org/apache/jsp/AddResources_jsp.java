package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddResources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Yalashi Salon</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("            .navbar h2{\n");
      out.write("\n");
      out.write("                color: white ;\n");
      out.write("                margin-left: 35% ;\n");
      out.write("                margin-top: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .reg{\n");
      out.write("\n");
      out.write("                width:350px ;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                margin-left: 150px ;\n");
      out.write("                display:block;\n");
      out.write("                text-align: left ;\n");
      out.write("                border: 2px ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("\n");
      out.write("                display: block ;\n");
      out.write("                width: 100% ;\n");
      out.write("                padding: 5px ;\n");
      out.write("                -webkit-box-sizing: border-box ;\n");
      out.write("                -moz-box-sizing :border-box ;\n");
      out.write("                box-sizing:border-box ;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.reg fieldset{\n");
      out.write("\n");
      out.write("                border: black ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button {\n");
      out.write("\n");
      out.write("                width: 150px;\n");
      out.write("                padding: 5px ;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 17px ;\n");
      out.write("                background-color:#ff4d4d;\n");
      out.write("                border-radius: 5px ;\n");
      out.write("                margin-top: 10px ;\n");
      out.write("                margin-left: 25px ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("             .button:hover{\n");
      out.write("\n");
      out.write("                background-color: #732626 ;\n");
      out.write("            }\n");
      out.write("            div.reg a {\n");
      out.write("\n");
      out.write("                font-style: normal ;\n");
      out.write("                float: left ;\n");
      out.write("                margin-right: 40px ;\n");
      out.write("                margin-top: 20px ;\n");
      out.write("                margin-left: 15px ;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.reg a:hover {\n");
      out.write("\n");
      out.write("                color: black ;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .details{\n");
      out.write("\n");
      out.write("                background-color: #b9b979 ;\n");
      out.write("                color: black ;\n");
      out.write("                border-radius: 3px ;\n");
      out.write("                height: 550px ;\n");
      out.write("                margin-left: 20px ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .data{\n");
      out.write("\n");
      out.write("                margin-top: 30px ;\n");
      out.write("                margin-left:20px ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active{\n");
      out.write("\n");
      out.write("                background-color: #66ff99 ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("           .container-fluid li:hover{\n");
      out.write("\n");
      out.write("                background-color: #66ff99 ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            /* Add a gray background color and some padding to the footer */\n");
      out.write("            footer {\n");
      out.write("                background-color: #b3b3b3;\n");
      out.write("                padding: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .foot1{\n");
      out.write("\n");
      out.write("                border-right: 2px solid grey ;\n");
      out.write("                height: 110px ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .foot2{\n");
      out.write("\n");
      out.write("                margin-left: 30px ; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .foot3{\n");
      out.write("\n");
      out.write("                margin-left: 50px;\n");
      out.write("                margin-bottom: 25px ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel-inner img {\n");
      out.write("                width: 100%; /* Set width to 100% */\n");
      out.write("                margin: auto;\n");
      out.write("                min-height:200px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item{\n");
      out.write("                height: 400px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item active{\n");
      out.write("                height: 400px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Hide the carousel text when the screen is less than 600 pixels wide */\n");
      out.write("            @media (max-width: 600px) {\n");
      out.write("                .carousel-caption {\n");
      out.write("                    display: none; \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("         <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <li class=\"navbar-brand\">Yalashi Beauty Salon</li>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"ShowResources.jsp\">Show Facilities</a></li>\n");
      out.write("                    \n");
      out.write("                     ");
 if (request.getSession().getAttribute("type").equals("admin")) { 
      out.write("\n");
      out.write("                    <li><a href=\"AddResources.jsp\"  class=\"active\">Facilities</a></li>\n");
      out.write("                    <li><a href=\"ShowReservations.jsp\">Show Reservation</a></li>\n");
      out.write("                    \n");
      out.write("                    ");
}else if (request.getSession().getAttribute("type").equals("user")) {
      out.write("\n");
      out.write("                    <li><a href=\"WeddingBooking.jsp\">Bridal Booking</a></li>\n");
      out.write("                    <li><a href=\"HairCuttingBooking.jsp\">Hair Cutting</a></li>\n");
      out.write("                    <li><a href=\"FacialBooking.jsp\">Facial</a></li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    ");
 if (request.getSession().getAttribute("email").equals(null)) {
                    
      out.write("<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        ");

                        } else {
                        
      out.write("<li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Log Out</a></li> ");

                    }
                        
      out.write("                 \n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("        <br>\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("            <!-- Wrapper for slides -->\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <img src=\"images/main10.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">        \n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main2.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main4.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main8.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main9.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main6.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main7.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6\">                      \n");
      out.write("                <div id=\"reg\"  class=\"reg\">\n");
      out.write("                    <h1>Facilities</h1>\n");
      out.write("                   <form action=\"ResourceController\" method=\"GET\">\n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"\">Description:</label>\n");
      out.write("                            <input type=\"text\" name=\"description\" id=\"description\" placeholder=\"Description\" required=\"\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"\">Time Taken:</label>\n");
      out.write("                            <input type=\"text\" name=\"authPerson\" id=\"authPerson\" placeholder=\"Time Taken\" required=\"\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"\">Service Type:</label>\n");
      out.write("                            \n");
      out.write("                            <select name = \"type\">\n");
      out.write("                                <option value =\"BridalDressing\">Bridal Dressing</option>\n");
      out.write("                                <option value=\"HairCutting\">Hair Cutting</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"\">Min Charges:</label>\n");
      out.write("                            <input type=\"text\" name=\"maxCount\" id=\"maxCount\" placeholder=\"Min Charge\" required=\"\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            <label for=\"\">Max Charges:</label>\n");
      out.write("                            <input type=\"text\" name=\"charges\" id=\"charges\" placeholder=\"Max Charges\" required=\"\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            <input class=\"button\" type=\"submit\" name=\"addResource\" value=\"Add Details\">\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"details\"><div class=\"data\">\n");
      out.write("\n");
      out.write("                        <h3><br>Facial Treatments </h3>         \n");
      out.write("                       <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again.</p>\n");
      out.write("\n");
      out.write("                        <h3>wedding </h3>         \n");
      out.write("                        <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again</p>\n");
      out.write("\n");
      out.write("                        <h3>Hair Cutting</h3>         \n");
      out.write("                       <p>People get facials for different reasons: While some people want to remove those horrible blackheads, others want some help with an anti-again</p> \n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write(" <hr>\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <div class=\"foot1 col-sm-4\"> <div class=\"col-sm-2\"><br><img src=\"images/logo.png\"></div>\n");
      out.write("                <div class=\"col-sm-10 text-center\">Connect with us<br><br><img src=\"images/others.png\">  </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"foot2 col-sm-3\"> \n");
      out.write("                Best of Lanka (Pvt) Ltd,<br>\n");
      out.write("                295/1,<br>\n");
      out.write("                Thilakarathne Mawatha,<br>\n");
      out.write("                Wilpathu ,<br>\n");
      out.write("                Sri Lanka.<br>  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"foot3 col-sm-4\"> \n");
      out.write("                Hotline : +94 71 9538268 <img src=\"images/viber.png\">&nbsp;<img src=\"images/whatsapp.png\"><br> \n");
      out.write("                <br>Telephone     : +94 71 2902834 , +94 70 2130370<br>\n");
      out.write("                &emsp;&emsp;&emsp;&emsp;&emsp;&ensp;+94 71 1595521 , +94 71 4795834<br>                             \n");
      out.write("                <br>e-mail   : uwucst@gmail.com<br>                          \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"text-center\"></div>   </footer>  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
