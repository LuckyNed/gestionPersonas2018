package cl.web;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cl.model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author alumnossur
 */
@WebListener()
public class ContextoPersonas implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<Persona> list = new ArrayList<>();
        list.add(new Persona("2-5","Santi","Administrador","santi@hotmail.com","123",true));
        list.add(new Persona("1-0","Paty","Administrador","paty@hotmail.com","123",true));
        list.add(new Persona("1-6","Eme","Persona","eme@hotmail.com","123",true));
        list.add(new Persona("2-0","Titi","Administrador","titi@hotmail.com","123",false));
        list.add(new Persona("5-2","Api","Administrador","api@hotmail.com","123",true));
        list.add(new Persona("2-4","Atin","Persona","atin@hotmail.com","123",true));
        sce.getServletContext().setAttribute("data", list);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
