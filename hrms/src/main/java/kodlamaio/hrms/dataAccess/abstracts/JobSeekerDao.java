package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobsSeekers;

public interface JobSeekerDao extends JpaRepository<JobsSeekers, Integer>{

}
