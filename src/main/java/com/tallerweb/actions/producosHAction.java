package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.Producto;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gonza on 22/6/2017.
 */
@Namespace(value="/")
@Action(value = "productosHO",results = @Result(name ="success",location = "/jsp/productosHo.jsp"))
public class producosHAction extends ActionSupport {

    private ProductoServicios pServ = new ProductosServiciosImple();

    List<Producto> productosL;
    @Override
    public String execute(){
        productosL = new ArrayList<Producto>();
        productosL = pServ.listarProductosH();

        return SUCCESS;
    }

    public List<Producto> getProductosL() {
        return productosL;
    }

    public void setProductosL(List<Producto> productosL) {
        this.productosL = productosL;
    }
}
