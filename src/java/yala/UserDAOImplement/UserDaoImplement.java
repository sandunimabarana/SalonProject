/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.UserDAOImplement;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToOne;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import yala.DAO.UserDao;
import yala.pojo.UserDetails;

/**
 *
 * @author Sachithre
 */
public class UserDaoImplement implements UserDao{

    @Override
    public void saveUser(UserDetails user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    @OneToOne(mappedBy="userdetails")
    public List<UserDetails> showAllUsers() {
        List<UserDetails> userList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From UserDetails");
        userList = query.list();
        return userList;
    }
    
    public List<UserDetails> checkLogin(UserDetails user) {
        List<UserDetails> userList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("From UserDetails where email = '" + user.getEmail() + "' AND password = '"+ user.getPassword()+"'");
        userList = query.list();
        transaction.commit();
        session.close();
        return userList;
        
    }

    @Override
    public void updateUser(int reg_No, String nic, String title, String name, String address, String email, String tel, String type, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserDetails userdetails = (UserDetails)session.load(UserDetails.class, reg_No);
        userdetails.setNic(nic);
        userdetails.setTitle(title);
        userdetails.setName(name);
        userdetails.setAddress(address);
        userdetails.setEmail(email);
        userdetails.setTel(tel);
        userdetails.setTitle(title);
        userdetails.setPassword(password);
        session.update(userdetails);
        transaction.commit();
        session.close();  
    }

    @Override
    public void deleteUser(UserDetails user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
    
}
