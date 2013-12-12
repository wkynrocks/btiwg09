
package rest.domains.geocaching;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GeocodeResponse")
public class GeocodeResponse{
        
   	private List<Results> results;
   	private String status;

 	public List<Results> getResults(){
		return this.results;
	}
        
        @XmlElement(name="result")
	public void setResults(List<Results> results){
		this.results = results;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
