package repository.occupation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.occupation.Occupation;

@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Integer>{

}
