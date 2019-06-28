package lt.trains.models;

import javax.persistence.Entity;

@Entity
public class CreateWagonCommand extends Wagon implements WagonInterface 
{
	private int max_load;
	private String type;
	private int  wagon_class;
	
	public int getMax_load() {
		return max_load;
	}
	public void setMax_load(int max_load) {
		this.max_load = max_load;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWagon_class() {
		return wagon_class;
	}
	public void setWagon_class(int wagon_class) {
		this.wagon_class = wagon_class;
	}
}
