/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.UserDAOImplement;




import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import yala.DAO.ResourcesDao;
import yala.pojo.Resources;

/**
 *
 * @author Sachithre
 */
public class ResourcesDaoImplement implements ResourcesDao{

    @Override
    public void saveResource(Resources resource) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(resource);
        transaction.commit();
        session.close();
    }

    @Override
    @OneToMany(mappedBy="res")
    public List<Resources> showAllResources() {
        List<Resources> resourceList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Resources");
        resourceList = query.list();
        return resourceList;
    }

    @Override
    public void updateResource(int reso_No, String description, String authPerson, String type, int maxCount, float charges) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Resources resources = (Resources)session.load(Resources.class, reso_No);
        resources.setAuthPerson(authPerson);
        resources.setType(type);
        resources.setCharges(charges);
        resources.setDescription(description);
        resources.setMaxCount(maxCount);
        session.update(resources);
        transaction.commit();
        session.close(); 
    }

    @Override
    public void deleteResource(Resources resource) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(resource);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Resources> showAllBridal() {
        List<Resources> resourceList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Resources WHERE type = 'BridalDressing'");
        resourceList = query.list();
        return resourceList;
    }
    
    @Override
    public List<Resources> showAllHairCutting() {
        List<Resources> resourceList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Resources WHERE type = 'HairCutting'");
        resourceList = query.list();
        return resourceList;
    }
    
}
