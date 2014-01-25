
package rest.domain.geoFlickr;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rsp")
public class GeoPhoto {

    private Photo photo;
    private String stat;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    
    public String getStat() {
        return stat;
    }
    @XmlAttribute(name = "stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperties(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
