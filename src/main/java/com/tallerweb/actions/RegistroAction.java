package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by gonza on 5/6/2017.
 */
@Namespace(value="/")
@Action(value = "Registro",results = @Result(name ="success",location = "/jsp/registro.jsp"))
public class RegistroAction extends ActionSupport {

    @Override
    public String execute(){

        return SUCCESS;
    }

}
