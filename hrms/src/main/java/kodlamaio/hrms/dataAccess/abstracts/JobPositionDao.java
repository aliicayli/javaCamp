package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    List<JobPosition> getByJobPosition(String jobPosition);
}
