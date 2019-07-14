/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yala.DAO.ResourcesDao;
import yala.UserDAOImplement.ResourcesDaoImplement;
import yala.pojo.Resources;



/**
 *
 * @author Sachithre
 */
public class ResourceController extends HttpServlet{
    
    Resources resources = new Resources();
    ResourcesDaoImplement resourceDaoImpl = new ResourcesDaoImplement();
    ResourcesDao rdao;
    
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("addResource")!=null){//from addResource submit button
            
            
            String description = request.getParameter("description");
            String authPerson = request.getParameter("authPerson");
            String type = request.getParameter("type");
            int maxCount = Integer.parseInt(request.getParameter("maxCount"));//////////////////////////////////////////////////////////////
            float charges = Float.parseFloat(request.getParameter("charges"));/////////////////////////////////////////
            
            
            resources.setAuthPerson(authPerson);
            resources.setCharges(charges);
            resources.setDescription(description);
            resources.setMaxCount(maxCount);
            resources.setType(type);
            
            resourceDaoImpl.saveResource(resources);
            
            RequestDispatcher rd = request.getRequestDispatcher("ShowResources.jsp");////////////////////////////////////// show resorces
            rd.forward(request, response);
           
        }
        
        
      
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         if(request.getParameter("showResources")!=null){
            List<Resources> resourceList = new ArrayList();
            resourceList = resourceDaoImpl.showAllResources();
            request.setAttribute("resourceList", resourceList);
            RequestDispatcher rd = request.getRequestDispatcher("ShowResources.jsp");///////////////////////////////////////////////////////
            rd.forward(request, response);
        }
         
        
         
          if(request.getParameter("updateResource")!=null){
             int id1 = Integer.parseInt(request.getParameter("reso_No"));
             
             String description = request.getParameter("description");
            String authPerson = request.getParameter("authPerson");
            String type = request.getParameter("type");
            int maxCount = Integer.parseInt(request.getParameter("maxCount"));//////////////////////////////////////////////////////////////
            float charges = Float.parseFloat(request.getParameter("charges"));
            resourceDaoImpl.updateResource(id1, description, authPerson, type, maxCount, charges);
             
             RequestDispatcher rd = request.getRequestDispatcher("ShowResources.jsp");
             rd.forward(request, response);
             
         }
          
         if(request.getParameter("deleteResource")!=null){
             int id2 = Integer.parseInt(request.getParameter("reso_No"));
             resources.setReso_No(id2);
             resourceDaoImpl.deleteResource(resources);
              RequestDispatcher rd = request.getRequestDispatcher("ShowResources.jsp");
             rd.forward(request, response);
         }
         
      
      
    }
}
