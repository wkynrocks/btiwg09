/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import domainelevation.Elevation;
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

    public String prueba() {
        System.out.println("HOLA");
        rest.googlegeo.GoogleGeoClient client = new rest.googlegeo.GoogleGeoClient();
        System.out.println(client.geocode(String.class, "Blvd Louis Pasteur, Málaga", "true", ""));
        GeocodeResponse google = client.geocode(GeocodeResponse.class, "Blvd Louis Pasteur, Málaga", "true", "");
        System.out.println(google.getStatus());
        Results result = google.getResults().get(0);
        System.out.println(result.getFormatted_address());
        System.out.println(result.getTypes());

        System.out.println(result.getGeometry().getLocation().getLat().toString() + result.getGeometry().getLocation().getLng().toString()+": ");

        GeocodeResponse googleInverso = client.geocodeInverso(GeocodeResponse.class, result.getGeometry().getLocation().getLat().toString() + "," + result.getGeometry().getLocation().getLng().toString(), "true", "");
        Results resultInverso = googleInverso.getResults().get(0);
        System.out.println(resultInverso.getFormatted_address());
        
        rest.googlegeo.ElevationClient eleclient = new rest.googlegeo.ElevationClient();
        Elevation ele = eleclient.elevation(Elevation.class, "true", "40.714728,-73.998672","");
        System.out.println(ele.getResults().get(0).getElevation());
        return "";
    }

}
