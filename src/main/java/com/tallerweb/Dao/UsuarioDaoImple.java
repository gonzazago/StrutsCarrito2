package com.tallerweb.Dao;


import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.googlecode.s2hibernate.struts2.plugin.util.HibernatePluginUtils;
import com.tallerweb.model.Producto;
import com.tallerweb.model.User;
import com.tallerweb.model.Usuario;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import javax.inject.Inject;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by gonza on 15/6/2017.
 */

public class UsuarioDaoImple implements UsuarioDao {

     @SessionTarget
        private Session session;

     @Inject
     private SessionFactory sessionFactory;

    @TransactionTarget
        private Transaction transaction;


    @Override
    public boolean verificarUsuario(User u) {
        Criteria u1 = session.createCriteria(Usuario.class);
        u1.add(Restrictions.eq("clave", u.getPassword()));
        u1.add(Restrictions.eq("nombreYapellido", u.getNombre()));

        List<Usuario> us = u1.list();

        if (us.size() == 1) {
            return true;
        }

        return false;
    }

     @Override
     public void agregarUsuario(Usuario u){
         session.save(u);
     }


     @Override
    public Usuario buscarUsuarioNombre(Usuario u){
         Criteria c1 = session.createCriteria(Usuario.class);
         c1.add(Restrictions.eq("nombreYapellido", u.getNombreYapellido()));
         c1.setMaxResults(1);
         return (Usuario)c1.uniqueResult();

     }

    public Usuario buscarUsuario(User u){
        Criteria u1 = session.createCriteria(Usuario.class);
        u1.add(Restrictions.eq("nombreYapellido", u.getNombre()));
        u1.setMaxResults(1);
        return (Usuario)u1.uniqueResult();

    }

    @Override
    public Usuario getUserID(Long idU){
        Criteria u1 = session.createCriteria(Usuario.class);
        u1.add(Restrictions.eq("idUsuario", idU));
        u1.setMaxResults(1);
        return (Usuario)u1.uniqueResult();
     }

    @Override
    public List<Producto> getProductos() {
        return null;
    }
}




