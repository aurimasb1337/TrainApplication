package lt.trains.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class PassengerWagon extends Wagon implements WagonInterface  {


	private int  wagon_class;
	
	@ManyToOne
	@JsonIgnore
	private Train train;
	
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public int getWagon_class() {
		return wagon_class;
	}
	public void setWagon_class(int wagon_class) {
		this.wagon_class = wagon_class;
	}
	
	
}
