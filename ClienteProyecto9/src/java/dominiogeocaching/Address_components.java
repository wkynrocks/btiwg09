
package dominiogeocaching;

import java.util.List;

public class Address_components{
   	private String long_name;
   	private String short_name;
   	private List types;

 	public String getLong_name(){
		return this.long_name;
	}
	public void setLong_name(String long_name){
		this.long_name = long_name;
	}
 	public String getShort_name(){
		return this.short_name;
	}
	public void setShort_name(String short_name){
		this.short_name = short_name;
	}
 	public List getTypes(){
		return this.types;
	}
	public void setTypes(List types){
		this.types = types;
	}
}
