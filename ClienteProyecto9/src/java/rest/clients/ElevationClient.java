/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rest.clients;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MultivaluedMap;
/**
 *
 * @author tolkirlaptop
 */
public class ElevationClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://maps.google.com/maps/api";
    
    public ElevationClient() {
//        ClientConfig config = new ClientConfig(JacksonFeature.class);
//        client = javax.ws.rs.client.ClientBuilder.newClient(config);
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("elevation/xml");
    }

    /**
     * @param <T>
     * @param responseType Class representing the response
     * @param sensor addressuery parameter[REQUIRED]
     * @param locations
     * @param optionalQueryParams List of optional addressuery parameters in the form of "param_name=param_value",...<br>
 List of optional addressuery parameters:
 <LI>output [OPTIONAL, DEFAULT VALUE: "xml"]
     * @return response object (instance of responseType class)
     */
    public <T> T elevation(Class<T> responseType, String sensor, String locations, String... optionalQueryParams) throws ClientErrorException {
        String[] queryParamNames = new String[]{"sensor","locations"};
        String[] queryParamValues = new String[]{sensor,locations};
       
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
       
        T s = webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
        System.out.println("Devuelto ok");
        return s;
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

    public void close() {
        client.close();
    }
}
