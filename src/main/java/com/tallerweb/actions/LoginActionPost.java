package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tallerweb.Servicios.UsuarioServicios;
import com.tallerweb.Servicios.UsuarioServiciosImple;
import com.tallerweb.model.User;
import com.tallerweb.model.Usuario;
import org.apache.struts2.convention.annotation.*;

import java.util.Map;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 21/6/2017.
 */
@Namespace(value = "/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value="VerificarLogin", results = {
        @Result(name = SUCCESS, type="redirect", location = "Home"),
        @Result(name = ERROR, type = "redirect",location = "login")
})
public class LoginActionPost extends ActionSupport{
    private String nombre;
    private String password;
    private Map session = ActionContext.getContext().getSession();
    private UsuarioServicios uMng = new UsuarioServiciosImple();

    @Override
    public String execute(){
        System.out.println("Usuario: " +nombre);
        System.out.println("Password:" + password);
        User u = new User(nombre,password);

        if(uMng.validarUsuario(u)){
            session.put("loggin","true");
            Usuario us = uMng.traerUsuario(u);
            session.put("user",us.getNombreYapellido());
            session.put("idUsuario",us.getIdUsuario());
            session.put("tipo",us.getTipo());
            return SUCCESS;
        }

        return ERROR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

