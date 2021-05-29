package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeekers,Integer> {
    JobSeekers getByEpostaAddress(String epostaAddress);
    JobSeekers getByIdentificationNumber(String identificationNumber);
}
