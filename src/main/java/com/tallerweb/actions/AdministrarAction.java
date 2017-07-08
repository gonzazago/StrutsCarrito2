package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.Producto;
import org.apache.struts2.convention.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gonza on 1/7/2017.
 */
@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value = "Administrar",results = @Result(name ="success",location = "/jsp/administrar.jsp"))
public class AdministrarAction extends ActionSupport{

    private ProductoServicios pServ = new ProductosServiciosImple();
    private List<Producto> productosL;
    @Override
    public String execute(){
        productosL = new ArrayList<Producto>();
        productosL = pServ.listarTodosProductos();

        return SUCCESS;
    }


    public List<Producto> getProductosL() {
        return productosL;
    }

    public void setProductosL(List<Producto> productosL) {
        this.productosL = productosL;
    }
}


