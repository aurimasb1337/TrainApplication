package lt.trains.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.trains.models.Train;
import lt.trains.models.Wagon;
import lt.trains.repositories.TrainRepository;
import lt.trains.repositories.WagonRepository;

@Service
public class TrainService {
	@Autowired TrainRepository trainRepository;
	@Autowired WagonRepository wagonRepository;
	
	public List getAllTrains() {
		List trains = new ArrayList<>();
		trainRepository.findAll().forEach(trains::add);
		return trains;
	}
public void addTrain(Train t) {
	trainRepository.save(t);
}

	public void deleteTrain(Long id) {
		trainRepository.deleteById(id);
	}
	
	public Optional<Train> getTrainById(Long id) {
		return trainRepository.findById(id);
	}
}
