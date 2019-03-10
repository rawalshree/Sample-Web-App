/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.controller;

import com.oracle.ozark.core.Models;
import com.shree.model.Login;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author shree
 */
@Path("login")
@Controller
public class LoginController {
    
    
    @Inject
    private Models model;
    
    @Inject
    private Login profile;
    
    @GET
    public Response showLoginPage() {
        return Response.ok()
                .entity("/WEB-INF/jsp/login.jsp")
                .build();

    }
    
    @POST
    public Response checkLoginCreds(@FormParam("username") String username, 
                                  @FormParam("password") String password) {
        
        if(profile.validateUser(username, password)) {
            profile.setUserValidation(Boolean.TRUE);
            return Response.ok()
                .entity("redirect:/dashboard")
                .build();
        }
        model.put("message", "Incorrect username or password");
        return Response.ok()
                .entity("/WEB-INF/jsp/login.jsp")
                .build();
    }
    
}