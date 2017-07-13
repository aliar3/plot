/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dexdevs.views;

import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Moieen
 */
public class DashBoard extends CustomComponent{
    private HorizontalSplitPanel layout;
    private VerticalLayout vl;
    private Accordion accordion;

    public DashBoard(){
        layout=new HorizontalSplitPanel();
        vl=new VerticalLayout();
        vl.setSizeFull();
        vl.setMargin(true);
        vl.setSpacing(true);
        accordion=new Accordion();
        layout.addComponents(accordion,vl);
        
        layout.setSizeFull();
        layout.setSplitPosition(250, Unit.PIXELS);
       
        ///////End of login in form code
        
        ////accordion////////
        Button first = new Button("view 1"); first.setStyleName(ValoTheme.BUTTON_LINK);
        accordion.addTab(first,"Tab1");
         first.addClickListener(e ->{
             
             vl.removeAllComponents();
             vl.addComponent(new Button("New Button"));
         });
        Button second = new Button("view2"); second.setStyleName(ValoTheme.BUTTON_LINK);
        accordion.addTab(second,"Tab2");
         second.addClickListener(e ->{
             vl.removeAllComponents();
             vl.addComponent(new Label("View 2 Demo Label"));
             
         });

         setCompositionRoot(layout);
        
    }
    
    
    
}
