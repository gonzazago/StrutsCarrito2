package com.tallerweb.Dao;

import com.tallerweb.model.Producto;
import com.tallerweb.model.User;
import com.tallerweb.model.Usuario;

import java.util.List;


/**
 * Created by gonza on 15/6/2017.
 */
public interface UsuarioDao {

    public boolean verificarUsuario(User u);
    public void agregarUsuario(Usuario u);
    Usuario buscarUsuario(User u);
    Usuario buscarUsuarioNombre(Usuario u);
    Usuario getUserID(Long idU);
    List<Producto> getProductos();
}
