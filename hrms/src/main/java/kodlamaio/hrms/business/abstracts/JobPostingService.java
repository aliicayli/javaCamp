package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;

import java.util.List;

public interface JobPostingService {
    DataResult<List<JobPosting>> getAll();
    DataResult<List<JobPosting>> getByIsActive();
    Result add(JobPosting jobPosting);
    Result update(JobPosting jobPosting);
    Result delete(JobPosting jobPosting);
    DataResult<List<JobPosting>> getAllSortedByDate();

}
