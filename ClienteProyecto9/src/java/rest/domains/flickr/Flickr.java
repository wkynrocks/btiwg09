
package rest.domains.flickr;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rsp")
public class Flickr {
    private Photos photos;
    private String stat;

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    
    public String getStat() {
        return stat;
    }
    
    @XmlAttribute(name = "stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

}
