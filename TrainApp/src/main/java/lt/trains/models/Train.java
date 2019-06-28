package lt.trains.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Train {

	private @Id @GeneratedValue(strategy=GenerationType.AUTO) long id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String manufacturer, city, date;
	
	@OneToMany(mappedBy="train", cascade=CascadeType.ALL)
	private List<Wagon> wagons;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Wagon> getWagons() {
		return wagons;
	}

	public void setWagons(List<Wagon> wagons) {
		this.wagons = wagons;
	}
	
	public int getTotalPrice() {
		int sum = 0;
		for(Wagon w : wagons) {
			sum+=w.getPrice();
		}
		return sum;
	}
	public int getTotalVolume() {
		int volume = 0;
		for(Wagon w : wagons) {
			volume+=w.getVolume();
		}
		return volume;
	}


	
	
}
