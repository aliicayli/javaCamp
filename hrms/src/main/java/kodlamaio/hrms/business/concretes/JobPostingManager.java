package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDao){
        this.jobPostingDao=jobPostingDao;
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Job posting were listed");
    }

    @Override
    public Result add(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult("Job posting was added");
    }

    @Override
    public Result update(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult("Job posting was updated");
    }

    @Override
    public Result delete(JobPosting jobPosting) {
        this.jobPostingDao.delete(jobPosting);
        return new SuccessResult("Job posting was deleted");
    }

    @Override
    public DataResult<List<JobPosting>> getAllSortedByDate() {
        Sort sort=Sort.by(Sort.Direction.ASC,"applicationDeadline");
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(sort));
    }


    @Override
    public DataResult<List<JobPosting>> getByIsActive() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActive());
       // return this.jobPostingDao.getByIsActive();
    }

}
