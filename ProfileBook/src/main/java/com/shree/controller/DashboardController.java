/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.controller;

import com.oracle.ozark.core.Models;
import com.shree.model.Login;
import com.shree.model.Query;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
/**
 *
 * @author shree
 */
@Controller
@Path("dashboard")
public class DashboardController {
    
    @Inject
    private Models model;
    
    @Inject
    private Login profile;
    
    @GET
    public Response showDashboard() {
        return Response.ok()
                .entity("/WEB-INF/jsp/dashboard.jsp")
                .build();
    }
    
    @GET
    @Path("images")
    public Response showImageUpload() {
        return Response.ok()
                .entity("/WEB-INF/jsp/images.jsp")
                .build();
    }
    
    @POST
    @Path("images")
    public Response showUploadedResponse() {
        model.put("message", "Image uploaded Successfully");
        return Response.ok()
                .entity("/WEB-INF/jsp/images.jsp")
                .build();
    }
    
    
    @GET
    @Path("query")
    public Response showQueryResponse(@QueryParam("id") String id) {
        if (id != null) {
            model.put("message", "Response for ID : " + id + " = " + Query.executeQuery(id));
            return Response.ok()
                .entity("/WEB-INF/jsp/query.jsp")
                .build();
        }
        else {
            return Response.ok()
                .entity("/WEB-INF/jsp/query.jsp")
                .build();
        }
    }
    
    @GET
    @Path("search")
    public Response showSearchResponse(@QueryParam("search") String search) {
        if (search.length() == 0) {
            model.put("message", "No search for Empty String");
            return Response.ok()
                    .entity("/WEB-INF/jsp/search.jsp")
                    .build();
        }
        else {
            model.put("message", "Search Results for " + search);
            return Response.ok()
                    .entity("/WEB-INF/jsp/search.jsp")
                    .build();
        }
        
    }
    
    @GET
    @Path("videos")
    public Response showVideosPage() {
        return Response.ok()
                .entity("/WEB-INF/jsp/videos.jsp")
                .build();
    }
    
    @GET
    @Path("settings")
    public Response showSettingsPage() {
        return Response.ok()
                .entity("/WEB-INF/jsp/settings.jsp")
                .build();
    }
    
    @GET
    @Path("help")
    public Response showHelpPage() {
        return Response.ok()
                .entity("/WEB-INF/jsp/help.jsp")
                .build();
    }
    
    @GET
    @Path("logout")
    public Response logoutUSer() {
        profile.setUserValidation(false);
        model.put("message", "Logged Out Successfully");
        return Response.ok()
                .entity("redirect:/login")
                .build();
    }
    
}
