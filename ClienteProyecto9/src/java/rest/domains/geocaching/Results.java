
package rest.domains.geocaching;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Results{
   	private List<Address_components> address_components;
   	private String formatted_address;
   	private Geometry geometry;
   	private List<String> types;

 	public List<Address_components> getAddress_components(){
		return this.address_components;
	}
        @XmlElement(name="address_component")
	public void setAddress_components(List<Address_components> address_components){
		this.address_components = address_components;
	}
        
 	public String getFormatted_address(){
		return this.formatted_address;
	}
	public void setFormatted_address(String formatted_address){
		this.formatted_address = formatted_address;
	}
 	public Geometry getGeometry(){
		return this.geometry;
	}
	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}
        
 	public List<String> getTypes(){
		return this.types;
	}
        
        @XmlElement(name="type")
	public void setTypes(List<String> types){
		this.types = types;
	}
}
