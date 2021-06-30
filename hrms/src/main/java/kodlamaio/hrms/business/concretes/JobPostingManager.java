package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(), "Job posting were listed");
    }

    @Override
    public Result add(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult("Job posting was added");
    }

    @Override
    public Result update(JobPosting jobPosting) {
       // JobPosting Result= this.jobPostingDao.getOne(id);
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
        Sort sort = Sort.by(Sort.Direction.ASC, "applicationDeadline");
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(sort));
    }

    /*
        @Override
        public DataResult<List<JobPosting>> getByIsActive() {
          / return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActive());
           return this.jobPostingDao.getByIsActive();
      //  }
    */
    @Override
    public DataResult<List<JobPostingDto>> getByIsActive() {
        return new SuccessDataResult<List<JobPostingDto>>(this.jobPostingDao.getByIsActive());
    }


    @Override
    public DataResult<List<JobPosting>> getByIsActiveTrue() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActiveTrue(), "Active job postings were listed");
    }

    @Override
    public DataResult<List<JobPosting>> findByIsActiveFalse() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findByIsActiveFalse());
    }


    @Override
    public DataResult<JobPosting>findById(int id) {
       return new SuccessDataResult<JobPosting>(this.jobPostingDao.findById(id).get(),"Job posting ids were listed");
   }

    @Override
    public Result confirmJobPosting(int id, boolean active) {
        JobPosting value= this.jobPostingDao.findById(id).orElse(null);
        value.setActive(active);
        this.jobPostingDao.save(value);
        return new SuccessResult("Approved");

    }


//    @Override
//    public DataResult<List<JobPosting>> getByIsActiveTrueAndEmployerId(int id) {
//        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActiveTrueAndEmployerId(id), "Sorted by company");
//    }
}
