package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by gonza on 5/6/2017.
 */
@Namespace(value="/")
@Action(value = "Home",results = @Result(name ="success",location = "/jsp/Home.jsp"))
public class HomeAction extends ActionSupport {

    private String Mensaje;
    @Override
    public String execute(){
        Mensaje ="Hola soy un mensaje";

        return SUCCESS;
    }

    public String getMensaje() {
        return Mensaje;
    }


}
