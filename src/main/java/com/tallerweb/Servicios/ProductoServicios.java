package com.tallerweb.Servicios;

import com.tallerweb.model.*;

import java.util.List;

/**
 * Created by gonza on 18/6/2017.
 */
public interface ProductoServicios {

    void guardarProducto(Producto p);
    void modificarProducto(Long id, Producto pAnt);
    void borrarProducto(Producto p);
    List<Talle> recuperarTalles();
    List<Categoria>recuperarCategorias();
    List<Color>recuperarColores();
    Color buscarColor(Integer id);
    Talle buscarTalle(Integer id);
    Categoria buscarCategoria(Integer id);
    Producto buscarProducto(Long id);
    List<Producto>listarProductos();
    List<Producto>listarProductosM();
    List<Producto>listarProductosH();
    void agregarProducto(Producto P, Long idU);

    List<Producto> listarTodosProductos();
}
