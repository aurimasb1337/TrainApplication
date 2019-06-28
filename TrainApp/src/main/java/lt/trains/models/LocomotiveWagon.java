package lt.trains.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class LocomotiveWagon extends Wagon implements WagonInterface {
	

	private String type;
	
	@ManyToOne
	@JsonIgnore
	private Train train;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}

	
	
	
}
