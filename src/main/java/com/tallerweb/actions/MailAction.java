package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.tallerweb.model.Mail;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import static com.opensymphony.xwork2.Action.SUCCESS;


/**
 * Created by gonza on 6/6/2017.
 */
@Namespace(value="/")
@Action(value="VerificarMail", results={
        @Result(name = SUCCESS,type = "redirect", location="Home"),
        @Result(name = "input",location = "jsp/Contacto.jsp")
        })
public class MailAction extends ActionSupport{

    private String asunto;
    private String contacto;
    private String cuerpoMail;

    @Override
    public String execute(){

        System.out.println("asunto" + asunto);
        System.out.println("contacto" + contacto);
        System.out.println("comentarios" + cuerpoMail);
        return SUCCESS;
    }

    @RequiredFieldValidator(message = "Debe inngresar el asunto del mail")
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @RequiredFieldValidator(message = "Debre ingresar el Mensaje")
    public void setCuerpoMail(String cuerpoMail) {
        this.cuerpoMail = cuerpoMail;
    }

    @RequiredFieldValidator(message = "Debre ingresar el nombre de contacto")
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpoMail() {
        return cuerpoMail;
    }

    public String getContacto() {
        return contacto;
    }
}


