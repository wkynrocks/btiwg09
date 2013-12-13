/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.io.IOException;
import java.util.List;
import rest.domains.elevation.Elevation;
import rest.domains.geocaching.GeocodeResponse;
import rest.domains.geocaching.Results;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import rest.domains.flickr.Flickr;

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
        rest.clients.GoogleGeoClient client = new rest.clients.GoogleGeoClient();
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
        
        rest.clients.ElevationClient eleclient = new rest.clients.ElevationClient();
        Elevation ele = eleclient.elevation(Elevation.class, "true", "40.714728,-73.998672","");
        System.out.println(ele.getResults().get(0).getElevation());
        return "";
    }
    
    public String flickr() {
        rest.clients.FlickrClient flickclient = new rest.clients.FlickrClient();
        Flickr flickr = flickclient.photos_ownsearch(Flickr.class, "4bb4a7f3590b07606fc71d4e4e34c656", "36","-4","");
        System.out.println(flickr.getPhotos().getPhoto().size());
        System.out.println(flickr.getPhotos().getPhoto().get(20).getFarm());
        return "";
    }
}
