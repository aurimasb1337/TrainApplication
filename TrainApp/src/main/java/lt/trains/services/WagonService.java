package lt.trains.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.trains.models.CargoWagon;
import lt.trains.models.CreateWagonCommand;
import lt.trains.models.LocomotiveWagon;
import lt.trains.models.PassengerWagon;
import lt.trains.models.Train;
import lt.trains.models.Wagon;
import lt.trains.repositories.TrainRepository;
import lt.trains.repositories.WagonRepository;

@Service
public class WagonService {
	@Autowired TrainRepository trainRepository;
	@Autowired WagonRepository wagonRepository;
	
	
		public List getAllWagons() {
			List wagons = new ArrayList<>();
			wagonRepository.findAll().forEach(wagons::add);
			return wagons;
		}
		
		public void addWagon(Long id, CreateWagonCommand w) {
			
			if(w.getType()!=null) {
		
			
			LocomotiveWagon a = new LocomotiveWagon();
			a.setType(w.getType());
			a.setManufacturer(w.getManufacturer());
			a.setId(w.getId());
			a.setPrice(w.getPrice());
			a.setVolume(w.getVolume());
			
			Train t = trainRepository.findById(id).get();
			a.setTrain(t);
			wagonRepository.save(a);
			
			
			}
			
			if(w.getMax_load()>0) {
				CargoWagon a = new CargoWagon();
				a.setMax_load(w.getMax_load());
				a.setManufacturer(w.getManufacturer());
				a.setId(w.getId());
				a.setPrice(w.getPrice());
				a.setVolume(w.getVolume());
				
				Train t = trainRepository.findById(id).get();
				a.setTrain(t);
				wagonRepository.save(a);
			}
			
			if(w.getWagon_class()!=0) {
				PassengerWagon a = new PassengerWagon();
				a.setWagon_class(w.getWagon_class());
				a.setManufacturer(w.getManufacturer());
				a.setId(w.getId());
				a.setPrice(w.getPrice());
				a.setVolume(w.getVolume());
				
				Train t = trainRepository.findById(id).get();
				a.setTrain(t);
				wagonRepository.save(a);
			}
			
			
			
		}
		
		public void deleteWagonById(Long id) {
			wagonRepository.deleteById(id);
		}
		public Optional<Wagon> getWagonById(Long id) {
			return wagonRepository.findById(id);
		}
}
