/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yala.DAO.ReservationDao;
import yala.pojo.Reservation;
import yala.UserDAOImplement.ReservationDAOImplement;


/**
 *
 * @author Sachithre
 */
public class ReservationController extends HttpServlet {

    Reservation reservation = new Reservation();
    ReservationDAOImplement reservationDaoImpl = new ReservationDAOImplement();
    ReservationDao rdao;

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("addReservation")!=null){//from addRervation submit button
            
            
            Integer reg_No = (Integer) request.getSession().getAttribute("reg_No");
            int res_No =  (Integer) Integer.parseInt(request.getParameter("type"));
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            
           reservation.setDate(date);
           reservation.setReg_No(reg_No);
           reservation.setRes_No(res_No);
           reservation.setTime(time);
      
           reservationDaoImpl.saveReservation(reservation);
          
            
            RequestDispatcher rd = request.getRequestDispatcher("ReservationRederect.jsp");
            rd.forward(request, response);
           
        }
    }
         
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         if(request.getParameter("showRservations")!=null){
            List<Reservation> reservationList = new ArrayList();
            reservationList = reservationDaoImpl.showAllReservations();
            request.setAttribute("reservationList", reservationList);
            RequestDispatcher rd = request.getRequestDispatcher("ShowReservations.jsp");
            rd.forward(request, response);
        }
         
          if(request.getParameter("updateReservation")!=null){
             int resev_No = Integer.parseInt(request.getParameter("resev_No"));
             
             int reg_No = Integer.parseInt(request.getParameter("reg_No"));
            int res_No = Integer.parseInt(request.getParameter("res_No"));
            String date = request.getParameter("date");
            String time = request.getParameter("time");
        
            reservationDaoImpl.updateReservation(resev_No, reg_No, res_No, date, time);
             
             RequestDispatcher rd = request.getRequestDispatcher("ShowReservations.jsp");
             rd.forward(request, response);
             
         }
          
         if(request.getParameter("deleteReservation")!=null){
             int id2 = Integer.parseInt(request.getParameter("reso_No"));
             reservation.setResev_No(id2);
             reservationDaoImpl.deleteReservation(reservation);
              RequestDispatcher rd = request.getRequestDispatcher("ShowReservations.jsp");
             rd.forward(request, response);
         }
         
      
      
    }
        
        
      

}