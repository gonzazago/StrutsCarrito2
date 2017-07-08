package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 1/7/2017.
 */
@Namespace(value ="/")
@Action(value = "Logout",results ={
        @Result(name = SUCCESS, type = "redirect", location = "Home")})
public class logoutAction extends ActionSupport{

    private Map session = ActionContext.getContext().getSession();
    @Override
    public String execute() {
            session.put("loggin","false");
        return SUCCESS;
    }
}
