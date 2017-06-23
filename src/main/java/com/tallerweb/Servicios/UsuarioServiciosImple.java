package com.tallerweb.Servicios;

import com.tallerweb.Dao.UsuarioDao;
import com.tallerweb.Dao.UsuarioDaoImple;
import com.tallerweb.model.User;
import com.tallerweb.model.Usuario;

/**
 * Created by gonza on 15/6/2017.
 */
public class UsuarioServiciosImple implements UsuarioServicios {

    private UsuarioDao usuarioDao = new UsuarioDaoImple();

    @Override
    public boolean verificarUSuario(Usuario u) {

        if(u.getClave2().equals( u.getClave())){
            System.out.println("Las claves son distintas");
            return false;
        }
        return true;
    }

    @Override
    public void guardarUsuario(Usuario u){
        usuarioDao.agregarUsuario(u);

    }

    @Override
    public boolean validarUsuario(User u){

        return true;
    }

    @Override
    public Usuario traerUsuario(User u){

        return usuarioDao.buscarUsuario(u);
    }

    @Override
    public  Usuario getUsuarioId(Long idU){

        return usuarioDao.getUserID(idU);
    }

    @Override
    public Usuario traerUsuarioNombre(String n){

        User u = new User(n,n);

        return usuarioDao.buscarUsuario(u);
    }
}
