
package domainelevation;

import java.math.BigDecimal;
import java.util.List;

public class Location{
   	private BigDecimal lat;
   	private BigDecimal lng;

 	public BigDecimal getLat(){
		return this.lat;
	}
	public void setLat(BigDecimal lat){
		this.lat = lat;
	}
 	public BigDecimal getLng(){
		return this.lng;
	}
	public void setLng(BigDecimal lng){
		this.lng = lng;
	}
}
