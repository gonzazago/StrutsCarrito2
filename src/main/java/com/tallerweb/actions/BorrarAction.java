package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.Categoria;
import com.tallerweb.model.Color;
import com.tallerweb.model.Producto;
import com.tallerweb.model.Talle;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 3/7/2017.
 */
@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value = "BorrarAction",results = @Result(name = SUCCESS, type = "redirect", location = "Administrar"))
public class BorrarAction extends ActionSupport {

    private ProductoServicios pServ = new ProductosServiciosImple();
    private Long id;
    private Map session = ActionContext.getContext().getSession();

    @Override
    public String execute(){
        System.out.println("Producto" + id);

        if(session.get("loggin") == null) {
            return LOGIN;
        }
        else {
            HttpServletRequest request = ServletActionContext.getRequest();
            String idS = request.getParameter("idProducto");
            id = Long.parseLong(idS);
            Producto p= pServ.buscarProducto(id);
            pServ.borrarProducto(p);
            System.out.println("Nombre Producto: " + p.getNombreProducto());

            return SUCCESS;
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }
}
