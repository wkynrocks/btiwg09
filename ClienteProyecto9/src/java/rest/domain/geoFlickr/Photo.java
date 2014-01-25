
package rest.domain.geoFlickr;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;


public class Photo {

    private String id;
    private Location location;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperties(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
