package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
    List<JobPosting> getByIsActiveTrue();

   // List<JobPosting> findById(int id);

   // List<JobPosting> getByIsActiveTrueAndEmployerId(int employers);  //employers id olarak.

    //@Query("From JobPosting where isActive=true ")
    //List<JobPosting> getByIsActive();

      // j=jobposting
      // jp=jobposition

    List<JobPosting> findByIsActiveFalse();



    @Query("SELECT new kodlamaio.hrms.entities.dtos.JobPostingDto(e.companyName,jp.jobPosition,j.numberOfOpenPositions,j.releaseDate,j.applicationDeadline) from JobPosting j inner JOIN j.employers e inner join j.jobPosition jp where j.isActive=true")
    List<JobPostingDto> getByIsActive();

}
