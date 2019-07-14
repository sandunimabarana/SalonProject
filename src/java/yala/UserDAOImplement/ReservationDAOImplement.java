/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.UserDAOImplement;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import yala.DAO.ReservationDao;
import yala.pojo.Reservation;


/**
 *
 * @author Sachithre
 */
public class ReservationDAOImplement implements ReservationDao{

    @Override
    public void saveReservation(Reservation reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(reservation);
        transaction.commit();
        session.close();
    }

    @Override
    @OneToMany(mappedBy="reservation")
    public List<Reservation> showAllReservations() {
         List<Reservation> reservationList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Reservation");
        reservationList = query.list();
        return reservationList;
    }

    @Override
    public void updateReservation(int resev_No, int reg_No, int res_No, String date, String time) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Reservation reservation = (Reservation)session.load(Reservation.class, resev_No);
       
        reservation.setDate(date);
        reservation.setReg_No(reg_No);
        reservation.setRes_No(res_No);
        reservation.setResev_No(resev_No);
        reservation.setTime(time);
        session.update(reservation);
        transaction.commit();
        session.close(); 
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(reservation);
        transaction.commit();
        session.close();
    }
    
}
