
package rest.googlegeo.domain;

import java.util.List;

public class Geocode{
   	private List results;
   	private String status;

 	public List getResults(){
		return this.results;
	}
	public void setResults(List results){
		this.results = results;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
