
package rest.domain.geoFlickr;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;

public class Location {

    private Double latitude;
    private Double longitude;
    private Integer accuracy;
    private Integer context;
    private Neighbourhood neighbourhood;
    private Locality locality;
    private County county;
    private Region region;
    private Country country;
    private String place_id;
    private String woeid;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getLatitude() {
        return latitude;
    }

    @XmlAttribute(name = "latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @XmlAttribute(name = "longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    @XmlAttribute(name = "accuracy")
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getContext() {
        return context;
    }

   @XmlAttribute(name = "context")
    public void setContext(Integer context) {
        this.context = context;
    }

    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(Neighbourhood neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

//    @JsonAnySetter
//    public void setAdditionalProperties(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
