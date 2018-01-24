/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import cl.model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author alumnossur
 */
@Singleton
public class PersonaBean implements PersonaBeanLocal {

    private List<Persona> list = new ArrayList<>();

    public PersonaBean() {
        list.add(new Persona("2-5","Santi","Administrador","santi@hotmail.com","123",true));
        list.add(new Persona("1-0","Paty","Administrador","paty@hotmail.com","123",true));
        list.add(new Persona("1-6","Eme","Persona","eme@hotmail.com","123",true));
        list.add(new Persona("2-0","Titi","Administrador","titi@hotmail.com","123",false));
        list.add(new Persona("5-2","Api","Administrador","api@hotmail.com","123",true));
        list.add(new Persona("2-4","Atin","Persona","atin@hotmail.com","123",true));
        
    }
    
    @Override
    public Persona buscar(String rut) {
          for(Persona p : list){
            if(p.getRut().equals(rut)){
                return p;
            }                
        }
        return null;
    }

    @Override
    public Persona loguear(String rut, String clave) {
         for(Persona p : list){
            if(p.getRut().equals(rut) && p.getClave().equals(clave) && p.isActivo()){
                return p;
            }                
        }
        return null;
    }

    @Override
    public void editar(String rut, boolean activo) {
        Persona p = buscar(rut);
        p.setActivo(activo);
    }

    @Override
    public List<Persona> getPersonaList() {
        return list;
    }

    @Override
    public String add(Persona person) {
        Persona p = buscar(person.getRut());
        if(p == null){
            list.add(person);
            return "persona creada con exito";
        }
        return "Rut ya se encuentra registrado";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
