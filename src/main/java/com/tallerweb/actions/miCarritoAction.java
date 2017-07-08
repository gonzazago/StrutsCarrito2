package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.Servicios.UsuarioServicios;
import com.tallerweb.Servicios.UsuarioServiciosImple;
import com.tallerweb.model.Producto;
import com.tallerweb.model.Usuario;
import org.apache.struts2.convention.annotation.*;

import java.util.List;
import java.util.Map;

import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 3/7/2017.
 */

@Namespace(value="/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value="miCarritoAction", results = {
           @Result(name = SUCCESS,  location = "/jsp/miCarrito.jsp"),
            @Result(name = LOGIN,location = "/jsp/login.jsp")
 })
public class miCarritoAction  extends ActionSupport {
        private UsuarioServicios uServ = new UsuarioServiciosImple();
        private Long id;
        private List<Producto> productoList ;
        private Map session = ActionContext.getContext().getSession();

        @Override
        public String execute(){
            System.out.println("Producto" + id);

            if(session.get("loggin") == null) {
                return LOGIN;
            }
            else {

                Long idU = (Long) session.get("idUsuario");
                Usuario u = uServ.getUsuarioId(idU);
                productoList = u.getProductos();
                return SUCCESS;
            }

        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }
}
