/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author tolkirlaptop
 */
public class FlickrClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://api.flickr.com/";

    public FlickrClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("services/rest");
    }
    
    public <T> T photos_ownsearch(Class<T> responseType, String api_key, String lat, String lng, String... optionalQueryParams)  {
        String lat1 = String.valueOf(Double.parseDouble(lat)-1);
        String lng1 = String.valueOf(Double.parseDouble(lng)-1);
        String lat2 = String.valueOf(Double.parseDouble(lat)+1);
        String lng2 = String.valueOf(Double.parseDouble(lng)+1);
        String bbox = lat1+","+lng1+","+lat2+","+lng2;
        String[] queryParamNames = new String[]{"method", "api_key", "bbox"};
        String[] queryParamValues = new String[]{"flickr.photos.search", api_key, bbox};
        
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }        
        
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
     }
    
    public <T> T photos_latlong(Class<T> responseType, String api_key, String id){
        String[] queryParamNames = new String[]{"method", "api_key", "photo_id"};
         String[] queryParamValues = new String[]{"flickr.photos.geo.getLocation", api_key, id};
         javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }        
        
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
         
    }
    
        private Form getQueryOrFormParams(String[] paramNames, String[] paramValues) {
        Form form = new javax.ws.rs.core.Form();
        for (int i = 0; i < paramNames.length; i++) {
            if (paramValues[i] != null) {
                form = form.param(paramNames[i], paramValues[i]);
            }
        }
        return form;
    }
        
       private MultivaluedMap getQParams(String... optionalParams) {
        MultivaluedMap<String, String> qParams = new javax.ws.rs.core.MultivaluedHashMap<String, String>();
        for (String qParam : optionalParams) {
            String[] qPar = qParam.split("=");
            if (qPar.length > 1) {
                qParams.add(qPar[0], qPar[1]);
            }
        }
        return qParams;
    }
}
