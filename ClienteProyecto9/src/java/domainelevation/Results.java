
package domainelevation;

import java.math.BigDecimal;
import java.util.List;

public class Results{
   	private BigDecimal elevation;
   	private Location location;
   	private BigDecimal resolution;

 	public BigDecimal getElevation(){
		return this.elevation;
	}
	public void setElevation(BigDecimal elevation){
		this.elevation = elevation;
	}
 	public Location getLocation(){
		return this.location;
	}
	public void setLocation(Location location){
		this.location = location;
	}
 	public BigDecimal getResolution(){
		return this.resolution;
	}
	public void setResolution(BigDecimal resolution){
		this.resolution = resolution;
	}
}
