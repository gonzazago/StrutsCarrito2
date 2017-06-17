package com.tallerweb.Dao;


import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.tallerweb.model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.inject.Inject;

/**
 * Created by gonza on 15/6/2017.
 */

public class UsuarioDaoImple implements UsuarioDao {

     @SessionTarget
        private Session session;

    @TransactionTarget
        private Transaction transaction;

     /*
     public boolean verificarUsuario(){

          return true;
     }*/
     @Override
     public void agregarUsuario(Usuario u){
         session.save(u);




     }




}
