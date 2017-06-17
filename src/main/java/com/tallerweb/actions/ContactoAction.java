package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by gonza on 17/6/2017.
 */
@Namespace(value="/")
@Action(value = "Contacto",results = @Result(name ="success",location = "/jsp/Contacto.jsp"))
public class ContactoAction extends ActionSupport{
    @Override
    public String execute(){

        return SUCCESS;
    }
}
