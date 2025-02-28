package service.occupation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.occupation.Occupation;
import repository.occupation.OccupationRepository;

@Service
public class OccupationService {
	@Autowired
	private OccupationRepository occupationRepository;
	
	public Occupation saveName(Occupation o) {
		return occupationRepository.save(o);
	}
}
