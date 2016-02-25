/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.butterfaces;
import com.mycompany.webql.*;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudItem;
import org.primefaces.model.tagcloud.TagCloudModel;
 
@ManagedBean
public class ButterTag {
     
    private String tagString;
     
    @PostConstruct
    public void init() {
      
    }

    public void saveTags(){
        System.out.println("Tags saved "+ tagString);
    }
    
    
    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }
 
    
     
  
}
