/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxyRestClient.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author tolkirlaptop
 */
@Stateless
@Path("proxy")
public class ResultadoGoogleFacadeREST {

    public ResultadoGoogleFacadeREST() {
        
    }

    @GET
    @Path("latlong")
    @Produces({"application/json"})
    public String g() {
        return "{nombre:Pepe}";
    }
    
}
