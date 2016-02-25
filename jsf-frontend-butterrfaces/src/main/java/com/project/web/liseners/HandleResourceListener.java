/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.web.liseners;

/**
 *
 * @author IEUser
 */
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class HandleResourceListener implements SystemEventListener {

    @Override
    public boolean isListenerForSource(Object source) {
        return source instanceof UIViewRoot;
    }

    @Override
    public void processEvent(SystemEvent event) throws AbortProcessingException {
        final UIViewRoot source = (UIViewRoot) event.getSource();
        final FacesContext context = FacesContext.getCurrentInstance();

        try {
            for (UIComponent resource : source.getComponentResources(context, "head")) {
                final String resourceLibrary = (String) resource.getAttributes().get("library");
                final String resourceName = (String) resource.getAttributes().get("name");
                if ("primefaces".equals(resourceLibrary) && "jquery/jquery.js".equals(resourceName)) {
                    source.removeComponentResource(context, resource);
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
