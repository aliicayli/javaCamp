package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SchoolName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolNameDao extends JpaRepository<SchoolName,Integer> {
}
