package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.Producto;
import org.apache.struts2.convention.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gonza on 5/6/2017.
 */
@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value = "Home",results = @Result(name ="success",location = "/jsp/Home.jsp"))
public class HomeAction extends ActionSupport {

    private ProductoServicios pServ = new ProductosServiciosImple();

    List<Producto> productosL;
    @Override
    public String execute(){
        productosL = new ArrayList<Producto>();
        productosL = pServ.listarProductos();

        return SUCCESS;
    }


    public List<Producto> getProductosL() {
        return productosL;
    }

    public void setProductosL(List<Producto> productosL) {
        this.productosL = productosL;
    }
}
