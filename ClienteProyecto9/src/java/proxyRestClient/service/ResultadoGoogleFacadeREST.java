/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxyRestClient.service;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

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
    @Produces({"application/json"})
    public String direccionDesdeLatLong(@QueryParam("lat")String lat, @QueryParam("long")String longitud) {
        byte json = 0;
        rest.clients.GoogleGeoClient cliente = new rest.clients.GoogleGeoClient(json);
        return cliente.geocodeInversoJSON(String.class, lat+","+longitud, "true", "");
    }
}