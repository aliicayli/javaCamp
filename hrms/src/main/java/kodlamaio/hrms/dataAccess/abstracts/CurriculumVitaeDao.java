package kodlamaio.hrms.dataAccess.abstracts;


import kodlamaio.hrms.entities.concretes.CurriculumVitae;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae,Integer> {

 List<CurriculumVitae> getByJobSeekerId_Id(int jobSeekerId);
}
