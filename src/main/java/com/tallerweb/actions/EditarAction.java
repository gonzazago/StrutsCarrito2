package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.*;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gonza on 2/7/2017.
 */
@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value = "EditarAction",results = @Result(name ="success",location = "/jsp/editar.jsp"))
public class EditarAction extends ActionSupport{

    private ProductoServicios pServ = new ProductosServiciosImple();
    private Long id;
    private List<Categoria> categoria;
    private List<Color> color;
    private List<Talle> talle;
    private Producto p;
    private Map session = ActionContext.getContext().getSession();

    @Override
    public String execute(){
        System.out.println("Producto" + id);

        if(session.get("loggin") == null) {
            return LOGIN;
        }
        else {
            categoria = new ArrayList<Categoria>();
            color = new ArrayList<Color>();
            talle = new ArrayList<Talle>();
            categoria = pServ.recuperarCategorias();
            color = pServ.recuperarColores();
            talle = pServ.recuperarTalles();
            HttpServletRequest request = ServletActionContext.getRequest();
            String idS = request.getParameter("idProducto");
            id = Long.parseLong(idS);
            p= pServ.buscarProducto(id);
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

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
}
