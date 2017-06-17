package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tallerweb.Servicios.UsuarioServicios;
import com.tallerweb.Servicios.UsuarioServiciosImple;
import com.tallerweb.model.Usuario;
import org.apache.struts2.convention.annotation.*;

import javax.inject.Inject;



import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 17/6/2017.
 */
@Namespace(value = "/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value="VerificarUsuario", results = {
        @Result(name = SUCCESS, type="redirect", location = "Home"),
        @Result(name = ERROR, type = "redirect",location = "registro")
})
public class RegistroActionPost extends ActionSupport{

    private static final long serialVersionUID = 1L;
    private int id;
    private String eMail;
    private String nombreYapellido;
    private Integer dni;
    private String domicilio;
    private Integer telefono;
    private String fechaNacimiento;
    private String clave;
    private String clave2;

    private UsuarioServicios uMng = new UsuarioServiciosImple();
    @Override
    public String execute() throws Exception{
        Usuario usuario= new Usuario(id,eMail,nombreYapellido,dni,domicilio,telefono,fechaNacimiento,clave,clave2);
        System.out.println("Usuario: " + usuario.getNombreYapellido());
        System.out.println("Usuario: " + usuario.geteMail());
            uMng.guardarUsuario(usuario);
            return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave2() {
        return clave2;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public UsuarioServicios getuMng() {
        return uMng;
    }

    public void setuMng(UsuarioServicios uMng) {
        this.uMng = uMng;
    }
}
