package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.ForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage,Integer> {
    List<ForeignLanguage> getByCurriculumVitae_Id(int curriculumVitae);
}
