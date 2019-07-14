<%
session.setAttribute("id", null);
session.setAttribute("type", null);
session.setAttribute("email", null);
out.print("<script>alert('Successfully Logged Out!');window.location='index.html';</script>");
%>