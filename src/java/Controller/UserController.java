/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yala.DAO.UserDao;
import yala.UserDAOImplement.UserDaoImplement;
import yala.pojo.UserDetails;

/**
 *
 * @author Sachithre
 */
public class UserController extends HttpServlet {

        UserDetails user = new UserDetails();
        UserDaoImplement userDaoImpl = new UserDaoImplement();
        UserDao udao;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("register")!=null){
            
            String nic = request.getParameter("nic");
            String title = request.getParameter("title");
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String type = "user";
            String password = request.getParameter("password");
            
            user.setAddress(address);
            user.setEmail(email);
            user.setName(name);
            user.setNic(nic);
            user.setPassword(password);
            user.setTel(tel);
            user.setTitle(title);
            user.setType(type);
            
            userDaoImpl.saveUser(user);
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
           
        }
        if(request.getParameter("login")!=null){
            
            
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            UserDetails user1 = new UserDetails(email, password);
            
             List<UserDetails> user = userDaoImpl.checkLogin(user1);
            if(!user.isEmpty()){
                UserDetails user_n = user.get(0);
                request.getSession().setAttribute("email", user_n.getEmail());
                request.getSession().setAttribute("type", user_n.getType());
                request.getSession().setAttribute("reg_No", user_n.getReg_No());
               
                
            
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            }else{
                
                response.sendRedirect("login.jsp");
                
            }

        }
        
      
    }
    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//         if(request.getParameter("lo")!=null){
//            List<EmployeeDetails> employeeList = new ArrayList();
//            employeeList = employeeDaoImpl.showAllEmployees();
//            request.setAttribute("employeeList", employeeList);
//            RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
//            rd.forward(request, response);
//        }
//    }
   
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
