package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.*;
import com.tallerweb.model.Producto;
import com.tallerweb.model.Usuario;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 20/6/2017.
 */
@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value="CarritoAction", results = {
        @Result(name = SUCCESS,  location = "/jsp/miCarrito.jsp"),
        @Result(name = LOGIN,location = "/jsp/login.jsp")
})
public class CarritoAction extends ActionSupport{

    private ProductoServicios pServ = new ProductosServiciosImple();
    private UsuarioServicios uServ = new UsuarioServiciosImple();
    private Long id;
    private Integer cant;
    private Producto producto;
    private List<Producto> productoList ;
    private Map session = ActionContext.getContext().getSession();
    private float total;

    @Override
    public String execute(){
        if(session.get("loggin") == null) {
            return LOGIN;
        }
        else {

            Long idU = (Long) session.get("idUsuario");

            Producto p= pServ.buscarProducto(id);
            pServ.agregarProducto(p,idU);
            Usuario u = uServ.getUsuarioId(idU);
            productoList = u.getProductos();

            for (Producto pr: productoList) {

                if(pr.getIdProducto().equals(id)) {
                    total += pr.getPrecio() * cant;
                }
                total += pr.getPrecio();
            }
            return SUCCESS;
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getTotal() {
        return total;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public void setTotal(float total) {
        this.total = total;

    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }
}
