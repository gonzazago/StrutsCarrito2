package com.tallerweb.Dao;

import com.tallerweb.model.*;

import java.util.List;

/**
 * Created by gonza on 18/6/2017.
 */
public interface ProductoDao {
    void addProducto(Producto p);
    void editProducto(Integer id,Producto pAnt);
    List<Categoria> getCategorias();
    List<Talle>getTalle();
    List<Color>getColor();
    List<Producto>getProductos();
    List<Producto>getProductosM();
    List<Producto>getProductosH();
    Color color(Integer id);
    Categoria categoria(Integer id);
    Talle talle(Integer id);
    void agregarProductoCarrito(Producto p);

    Producto prodcuto(Long id);

}
