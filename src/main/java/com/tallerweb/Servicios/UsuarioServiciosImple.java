package com.tallerweb.Servicios;

import com.tallerweb.Dao.UsuarioDao;
import com.tallerweb.Dao.UsuarioDaoImple;
import com.tallerweb.model.Usuario;

import javax.inject.Inject;

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
        System.out.println("Voy a guadar usuario");
        usuarioDao.agregarUsuario(u);
    }
}
