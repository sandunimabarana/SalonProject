/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.DAO;

import java.util.List;
import yala.pojo.UserDetails;

/**
 *
 * @author Sachithre
 */
public interface UserDao {
     public void saveUser (UserDetails user);
    public List<UserDetails> showAllUsers();
    public void updateUser (int reg_No, String nic, String title, String name, String address, String email, String tel, String type, String password);
    public void deleteUser (UserDetails user);
}
