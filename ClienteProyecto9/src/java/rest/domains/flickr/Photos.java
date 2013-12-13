
package rest.domains.flickr;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Photos {

    private Integer page;
    private Integer pages;
    private Integer perpage;
    private String total;
    private List<Photo> photo;

    public Integer getPage() {
        return page;
    }

    @XmlAttribute(name = "page")
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    @XmlAttribute(name = "pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPerpage() {
        return perpage;
    }

    @XmlAttribute(name = "perpage")
    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    @XmlAttribute(name = "total")
    public void setTotal(String total) {
        this.total = total;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    @XmlElement(name="photo")
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

}
