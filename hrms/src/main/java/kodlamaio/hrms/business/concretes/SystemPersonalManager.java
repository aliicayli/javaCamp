package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.business.abstracts.SystemPersonalService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonalDao;
import kodlamaio.hrms.entities.concretes.SystemPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonalManager implements SystemPersonalService {

    private SystemPersonalDao systemPersonalDao;

    private JobPostingService jobPostingService;

    @Autowired
    public SystemPersonalManager(SystemPersonalDao systemPersonalDao, JobPostingService jobPostingService){
        this.systemPersonalDao=systemPersonalDao;

        this.jobPostingService=jobPostingService;

    }

    @Override
    public DataResult<List<SystemPersonal>> getAll() {
        return new SuccessDataResult<List<SystemPersonal>>(this.systemPersonalDao.findAll(),"System personals were listed");
    }

    @Override
    public Result add(SystemPersonal systemPersonal) {
        this.systemPersonalDao.save(systemPersonal);
        return new SuccessResult("System personal was added");
    }

    @Override
    public Result confirmJobPosting(int id, boolean active) {
        this.jobPostingService.confirmJobPosting(id,active);
        return new SuccessResult("Onaylandi");
    }
}
