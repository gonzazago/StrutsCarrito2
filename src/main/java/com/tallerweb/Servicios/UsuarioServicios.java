package com.tallerweb.Servicios;

import com.tallerweb.model.Usuario;

/**
 * Created by gonza on 15/6/2017.
 */
public interface UsuarioServicios {

    public boolean verificarUSuario(Usuario u);
    public void guardarUsuario(Usuario u);
}
