package com.tallerweb.Servicios;

import com.tallerweb.Dao.ProductoDao;
import com.tallerweb.Dao.ProductoDaoImple;
import com.tallerweb.Dao.UsuarioDao;
import com.tallerweb.Dao.UsuarioDaoImple;
import com.tallerweb.model.*;

import java.util.List;

/**
 * Created by gonza on 18/6/2017.
 */
public class ProductosServiciosImple implements  ProductoServicios {

    private ProductoDao pMng = new ProductoDaoImple();
    private UsuarioServicios uServ = new UsuarioServiciosImple();

    @Override
    public void guardarProducto(Producto p){

        pMng.addProducto(p);
    }
    @Override
    public void modificarProducto(Long id, Producto pAnt){

        pMng.editProducto(id,pAnt);

    }

    @Override
    public void borrarProducto(Producto p){
        pMng.deleteProducto(p);
    }

    @Override
    public List<Producto> listarTodosProductos(){
        return pMng.getAllProductos();
    }

    @Override
    public List<Talle> recuperarTalles(){
        return pMng.getTalle();
    }
    @Override
    public List<Categoria>recuperarCategorias(){
        return pMng.getCategorias();
    }
    @Override
    public List<Color>recuperarColores(){
        return  pMng.getColor();
    }
    @Override
    public List<Producto>listarProductos(){
        return pMng.getProductos();
    }
    @Override
    public List<Producto>listarProductosM(){return pMng.getProductosM();
    }
    @Override
    public List<Producto>listarProductosH(){
        return pMng.getProductosH();
    }

    @Override
    public Color buscarColor(Integer id){

        return pMng.color(id);
    }
    @Override
    public Talle buscarTalle(Integer id){return pMng.talle(id);}
    @Override
    public Categoria buscarCategoria(Integer id){return pMng.categoria(id);}



    @Override
    public Producto buscarProducto(Long id){return pMng.prodcuto(id);}

    @Override
    public void agregarProducto(Producto p, Long idU){
        Usuario u = uServ.getUsuarioId(idU);
        u.getProductos().add(p);
        p.getUsuario().add(u);
        pMng.agregarProductoCarrito(p);

    }


}
