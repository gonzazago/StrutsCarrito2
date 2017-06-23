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
    private Producto producto;
    private List<Producto> productoList ;
    private Map session = ActionContext.getContext().getSession();
    private float total;

    @Override
    public String execute(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String idS = request.getParameter("idProducto");
        id = Long.parseLong(idS);
        System.out.println("Producto" + id);

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

                System.out.println(p.getDescripcion());
                System.out.println(p.getPrecio());
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
}
