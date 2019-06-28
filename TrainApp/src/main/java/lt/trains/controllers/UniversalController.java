package lt.trains.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.trains.models.CreateWagonCommand;
import lt.trains.models.Train;
import lt.trains.models.Wagon;
import lt.trains.services.TrainService;
import lt.trains.services.WagonService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UniversalController {
	
	@Autowired WagonService wagonService;
	@Autowired TrainService trainService;

		@GetMapping("/trains")
		public List getAllTrains() {
			return trainService.getAllTrains();
		}
		
		@PostMapping("/trains")
			public void addTrain(@RequestBody Train train) {
				trainService.addTrain(train);
			}
		
		@GetMapping("/trains/{id}")
		public Optional<Train> getTrainById(@PathVariable Long id) {
			return trainService.getTrainById(id);
		}
		
		@DeleteMapping("/trains/{id}")
		public void deleteTrainById(@PathVariable Long id) {
			trainService.deleteTrain(id);
		}
		
		@GetMapping("/trains/{id}/wagons")
		public List getTrainWagons() {
			return wagonService.getAllWagons();
		}
		
		@PostMapping("/trains/{id}/wagons")
		public void addWagon(@PathVariable Long id, @RequestBody CreateWagonCommand w) {
			
			wagonService.addWagon(id, w);
		
}
		@DeleteMapping("/trains/{id}/wagons{id}")
		public void delWagonById(@PathVariable Long id) {
			wagonService.deleteWagonById(id);
		}
}
