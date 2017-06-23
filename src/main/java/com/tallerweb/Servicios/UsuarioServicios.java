package com.tallerweb.Servicios;

import com.tallerweb.model.User;
import com.tallerweb.model.Usuario;

/**
 * Created by gonza on 15/6/2017.
 */
public interface UsuarioServicios {

    public boolean verificarUSuario(Usuario u);
    public boolean validarUsuario(User u);
    public Usuario traerUsuario(User u);
    Usuario traerUsuarioNombre(String n);
    public void guardarUsuario(Usuario u);
    Usuario getUsuarioId(Long idU);
}
