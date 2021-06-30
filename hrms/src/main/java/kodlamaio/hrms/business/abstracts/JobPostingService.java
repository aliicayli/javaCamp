package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

import javax.xml.crypto.Data;
import java.util.List;

public interface JobPostingService {
    DataResult<List<JobPosting>> getAll();
    //DataResult<List<JobPosting>> getByIsActive();
    Result add(JobPosting jobPosting);
    Result update(JobPosting jobPosting);
    Result delete(JobPosting jobPosting);
    DataResult<List<JobPosting>> getAllSortedByDate();

    DataResult<List<JobPostingDto>> getByIsActive();

    DataResult<List<JobPosting>> getByIsActiveTrue();

    DataResult<List<JobPosting>> findByIsActiveFalse();


    DataResult<JobPosting> findById(int id);

    Result confirmJobPosting(int id, boolean active);
   // DataResult<List<JobPosting>> getByIsActiveTrueAndEmployerId(int id);
}
