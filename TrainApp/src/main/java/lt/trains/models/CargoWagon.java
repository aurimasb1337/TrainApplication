package lt.trains.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class CargoWagon extends Wagon implements WagonInterface {


	private int max_load=0;
	
	@ManyToOne
	@JsonIgnore
	private Train train;
	
	
	public int getMax_load() {
		return max_load;
	}
	public void setMax_load(int max_load) {
		this.max_load = max_load;
	}

	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
}
