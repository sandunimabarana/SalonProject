/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.DAO;

import java.util.List;
import yala.pojo.Resources;


/**
 *
 * @author Sachithre
 */
public interface ResourcesDao {
     public void saveResource (Resources resource);
    public List<Resources> showAllResources();
    public List<Resources> showAllBridal();
     public List<Resources> showAllHairCutting();
    public void updateResource (int reso_No, String description, String authPerson, String type, int maxCount, float charges);
    public void deleteResource (Resources resource);
}
