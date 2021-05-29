package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;

    public JobSeekerManager(JobSeekerDao jobSeekerDao){
        this.jobSeekerDao=jobSeekerDao;
    }


    @Override
    public DataResult<List<JobSeekers>> getAll() {
        return new SuccessDataResult<List<JobSeekers>>(this.jobSeekerDao.findAll(),"Job seekers was listed");
    }


    @Override
    public DataResult<JobSeekers> getByIdentificationNumber(String identificationNumber) {
        return new SuccessDataResult<>(this.jobSeekerDao.getByIdentificationNumber(identificationNumber));
    }

    @Override
    public DataResult<JobSeekers> getByEpostaAddress(String epostaAddress) {
        return new SuccessDataResult<>(this.jobSeekerDao.getByEpostaAddress(epostaAddress));
    }

    @Override
    public Result add(JobSeekers jobSeekers) {
        if(getByIdentificationNumber(jobSeekers.getIdentificationNumber()).getData()!=null){
            return new ErrorResult("This id already exists.");
        }else if(getByEpostaAddress(jobSeekers.getEpostaAddress()).getData()!=null){
            return new ErrorResult("This eposta address already exists.");
        }
        this.jobSeekerDao.save(jobSeekers);
            return new SuccessResult("Job seeker was added");
    }

}
