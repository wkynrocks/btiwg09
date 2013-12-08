/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class GoogleGeo {

    /**
     * Creates a new instance of GoogleGeo
     */
    public GoogleGeo() {
    }
    
    public String prueba(){
        System.out.println("HOLA");
        rest.googlegeo.GoogleGeoClient client = new rest.googlegeo.GoogleGeoClient();
        System.out.println("SGG");
        System.out.println(client.geocode(String.class, "Blvd Louis Pasteur, Málaga", "true", ""));
//        javax.ws.rs.core.Response response = customerFacade.findAll_XML(Response.class);
////if (response.getStatus() == 200) {
////   System.out.println("Respuesta con éxito");
////   GenericType<List<Customer>> genericType = new GenericType<List<Customer>>() {
////   };
////   List<Customer> lc = response.readEntity(genericType);
////}else{
////   System.out.println("Error al recibir el recurso, estado= " + response.getStatus()); 
////}
        System.out.println("SGG");
        return "";
    }
    
}
