/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.controller;

import com.oracle.ozark.core.Models;
import com.shree.model.Register;
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
@Path("register")
@Controller
public class RegisterController {
    
    @Inject
    private Models model;
    
    @GET
    public Response showRegisterPage() {
        return Response.ok()
                .entity("/WEB-INF/jsp/register.jsp")
                .build();

    }
    
    @POST
    public Response RegisterUser(@FormParam("firstname") String firstName,
                               @FormParam("lastname") String lastName,
                               @FormParam("username") String userName,
                               @FormParam("email") String email,
                               @FormParam("password") String password) {
        
        Register.addUser(firstName, lastName, userName, email, password);
        return Response.ok()
                .entity("redirect:/login")
                .build();
    }
}