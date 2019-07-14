package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Akeera Salon</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar h2{\n");
      out.write("\n");
      out.write("                color: white ;\n");
      out.write("                text-align: center ;\n");
      out.write("                margin-top:5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .nav{\n");
      out.write("                margin-left: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            li{\n");
      out.write("\n");
      out.write("                border-right: 1px solid #bbb;\n");
      out.write("                float:left ;\n");
      out.write("                color: white;\n");
      out.write("               padding-right: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li:last-child {\n");
      out.write("                border-right: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active{\n");
      out.write("\n");
      out.write("                background-color: #66ff99 ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li:hover{\n");
      out.write("\n");
      out.write("                background-color: #66ff99 ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel-indicators {\n");
      out.write("\n");
      out.write("                margin-left: -40px ;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .row a:hover{\n");
      out.write("\n");
      out.write("                color: #006600 ;\n");
      out.write("                text-decoration: none ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add a gray background color and some padding to the footer */\n");
      out.write("            footer {\n");
      out.write("                background-color: #b3b3b3;\n");
      out.write("                padding: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel-inner img {\n");
      out.write("                width: 100%; /* Set width to 100% */\n");
      out.write("                margin: auto;\n");
      out.write("                min-height:200px;\n");
      out.write("            }\n");
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
      out.write("            \n");
      out.write("            .item{\n");
      out.write("                height: 650px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item active{\n");
      out.write("                height: 650px;\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <li class=\"navbar-brand\">Akira Beauty Salon</li>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\"  class=\"active\">Home</a></li>\n");
      out.write("                    <li><a href=\"ShowResources.jsp\">Show Facilities</a></li>\n");
      out.write("                    \n");
      out.write("                     ");
 if (request.getSession().getAttribute("type").equals("admin")) { 
      out.write("\n");
      out.write("                    <li><a href=\"AddResources.jsp\">Facilities</a></li>\n");
      out.write("                    <li><a href=\"ShowReservations.jsp\">Hair Cutting</a></li>\n");
      out.write("                    <li><a href=\"ShowReservations.jsp\">Facial</a></li>\n");
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
      out.write("\n");
      out.write("\n");
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
      out.write("                    <img src=\"images/main1.jpg\" alt=\"Image\">\n");
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
      out.write("                    <img src=\"images/main3.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main4.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"images/main5.jpg\" alt=\"Image\">\n");
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
      out.write("        <div class=\"container text-center\">    \n");
      out.write("            <h3>Discover Your True Beauty</h3><p>Akira Beauty Salon for more than a decade, has been on the forefront \n");
      out.write("                of unveiling the feminine elegance providing excellent service in hair care, beauty care and bridal dressing. Our \n");
      out.write("                sophisticated yet herbal spa treatments has been able to maintain a steady flow of clients throughout, hoping\n");
      out.write("                to get themselves pampered in our professional hands. We also offer full time and part time courses in hair and\n");
      out.write("                beauty care for the enthusiastic youth seeking a career in the current beauty industry.</p>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <a href=\"BangloReservation.jsp\"><img src=\"images/bride.jpg\" class=\"img-responsive\" style=\"width:100%;height: 200px\" alt=\"Image\"></a>\n");
      out.write("                    <br><a href=\"BangloReservation.jsp\"><h4>Bridal Dressing</h4></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"> \n");
      out.write("                    <a href=\"SafariReservation.jsp\"><img src=\"images/hair.jpg\" class=\"img-responsive\" style=\"width:100%;height: 200px\" alt=\"Image\"></a>\n");
      out.write("                    <br><a href=\"SafariReservation.jsp\"><h4>Hair Cutting</h4> </a>   \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4\"> \n");
      out.write("                    <a href=\"CampingReservation.jsp\"><img src=\"images/camp.jpg\" class=\"img-responsive\" style=\"width:100%;height: 200px\" alt=\"Image\"></a>\n");
      out.write("                    <br><a href=\"CampingReservation.jsp\"><h4>Facial Treatments</h4></a>    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <div class=\"foot1 col-sm-4\"> <div class=\"col-sm-2\"><br><img src=\"images/logo.png\"></div>\n");
      out.write("                <div class=\"col-sm-10 text-center\">Connect with us<br><br><img src=\"images/others.png\">  </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"foot2 col-sm-3\"> \n");
      out.write("                Yalashi Beauty Salon (Pvt) Ltd,<br>\n");
      out.write("                295/1,<br>\n");
      out.write("                Passara Road,<br>\n");
      out.write("                Badulla,<br>\n");
      out.write("                Sri Lanka.<br> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"foot3 col-sm-4\"> \n");
      out.write("                Hotline : +94 55 4558726 <img src=\"images/viber.png\">&nbsp;<img src=\"images/whatsapp.png\"><br> \n");
      out.write("                <br>Telephone     : +94 71 8541297 <br>\n");
      out.write("                &emsp;&emsp;&emsp;&emsp;&emsp;&ensp;+94 71 47582146 <br>                             \n");
      out.write("                <br>e-mail   : yalashisalon@gmail.com<br>                           \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"text-center\"></div>\n");
      out.write("        </footer>  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
