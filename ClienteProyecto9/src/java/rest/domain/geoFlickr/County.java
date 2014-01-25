
package rest.domain.geoFlickr;

import javax.xml.bind.annotation.XmlAttribute;

public class County {

    private String _content;
    private String place_id;
    private String woeid;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String get_content() {
        return _content;
    }

    @XmlAttribute(name = "_content")
    public void set_content(String _content) {
        this._content = _content;
    }

    public String getPlace_id() {
        return place_id;
    }

    @XmlAttribute(name = "place_id")
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getWoeid() {
        return woeid;
    }

 @XmlAttribute(name = "woeid")
    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperties(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
