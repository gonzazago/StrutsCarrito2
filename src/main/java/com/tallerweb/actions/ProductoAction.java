package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.Categoria;
import com.tallerweb.model.Color;
import com.tallerweb.model.Talle;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gonza on 18/6/2017.
 */
@Namespace(value ="/")
@Action(value = "Producto",results = @Result(name = "success", location = "/jsp/ProductoAlta.jsp"))
public class ProductoAction extends ActionSupport {
    private ProductoServicios pServ = new ProductosServiciosImple();

    private List<Categoria> categoria;
    private List<Color> color;
    private List<Talle> talle;
    private String genero;
    @Override
    public String execute(){

        categoria = new ArrayList<Categoria>();
        color = new ArrayList<Color>();
        talle = new ArrayList<Talle>();
        categoria = pServ.recuperarCategorias();
        color = pServ.recuperarColores();
        talle = pServ.recuperarTalles();

        System.out.println("estoy aca");

        return SUCCESS;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    public List<Talle> getTalle() {
        return talle;
    }

    public void setTalle(List<Talle> talle) {
        this.talle = talle;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
