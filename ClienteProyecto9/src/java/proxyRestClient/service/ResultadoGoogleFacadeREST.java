/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxyRestClient.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Path("{lat}/{long}")
    @Produces({"application/json"})
    public String direccionDesdeLatLong(@PathParam("lat")String lat, @PathParam("long")String longitud) {
        byte json = 0;
        rest.clients.GoogleGeoClient cliente = new rest.clients.GoogleGeoClient(json);
        return cliente.geocodeInversoJSON(String.class, lat+","+longitud, "true", "");
    }
    
}
