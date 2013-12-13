
package rest.domains.flickr;

import javax.xml.bind.annotation.XmlAttribute;

public class Photo {

    private String id;
    private String owner;
    private String secret;
    private String server;
    private Integer farm;
    private String title;
    private Integer ispublic;
    private Integer isfriend;
    private Integer isfamily;
    private Integer safe;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    @XmlAttribute(name = "owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    @XmlAttribute(name = "secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    @XmlAttribute(name = "server")
    public void setServer(String server) {
        this.server = server;
    }

    public Integer getFarm() {
        return farm;
    }

    @XmlAttribute(name = "farm")
    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    @XmlAttribute(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    @XmlAttribute(name = "ispublic")
    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getIsfriend() {
        return isfriend;
    }

    @XmlAttribute(name = "isfriend")
    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    public Integer getIsfamily() {
        return isfamily;
    }

    @XmlAttribute(name = "isfamily")
    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    public Integer getSafe() {
        return safe;
    }

    @XmlAttribute(name = "safe")
    public void setSafe(Integer safe) {
        this.safe = safe;
    }

}
