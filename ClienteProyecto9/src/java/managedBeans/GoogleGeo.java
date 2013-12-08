/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import dominiogeocaching.GeocodeResponse;
import dominiogeocaching.Results;
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
     * Creates a new instance of GeocodeResponseGeo
     */
    public GoogleGeo() {
    }
    
    public String prueba(){
        System.out.println("HOLA");
        rest.googlegeo.GoogleGeoClient client = new rest.googlegeo.GoogleGeoClient();
        System.out.println("SGG");
        System.out.println(client.geocode(String.class, "Blvd Louis Pasteur, Málaga", "true", ""));
        GeocodeResponse google = client.geocode(GeocodeResponse.class, "Blvd Louis Pasteur, Málaga", "true", "");
        System.out.println(google.getStatus());
        Results result = google.getResults().get(0);
        System.out.println(result.getFormatted_address());
        System.out.println(result.getTypes());
        System.out.println("SGG");
        return "";
    }
    
}
