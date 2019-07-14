/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.DAO;

import java.util.List;
import yala.pojo.Reservation;

/**
 *
 * @author Sachithre
 */
public interface ReservationDao {
     public void saveReservation (Reservation reservation);
    public List<Reservation> showAllReservations();
    public void updateReservation (int resev_No, int reg_No, int res_No, String date, String time);
    public void deleteReservation (Reservation reservation);
}
