package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Job positions were listed");
    }


    @Override
    public DataResult<List<JobPosition>> getByJobPosition(String jobPosition) {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.getByJobPosition(jobPosition));
    }


    @Override
    public Result add(JobPosition jobPosition) {
        if(!getByJobPosition(jobPosition.getJobPosition()).getData().isEmpty()){
            return new ErrorResult("This job position address already exists.");
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("Job position was added");
    }


}
