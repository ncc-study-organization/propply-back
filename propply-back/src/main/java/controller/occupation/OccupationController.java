package controller.occupation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.occupation.Occupation;
import service.occupation.OccupationService;

@RestController
@RequestMapping("/api/occupation")
public class OccupationController {
	@Autowired
	private OccupationService occupationService;
	
	@PostMapping
	public ResponseEntity<Occupation> createOccupation(@RequestBody Occupation o) {
		Occupation savedO = occupationService.saveName(o);
		return new ResponseEntity<>(savedO, HttpStatus.CREATED);
	}
}
