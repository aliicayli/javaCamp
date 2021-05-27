package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobsSeekers;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao=jobSeekerDao;
	}

	@Override
	public DataResult<List<JobsSeekers>> getAll() {
		return new SuccessDataResult<List<JobsSeekers>>(this.jobSeekerDao.findAll(),"Data was listed (jobseeker)");
	}

	@Override
	public Result add(JobsSeekers jobsSeekers) {
		this.jobSeekerDao.save(jobsSeekers);
		return new SuccessResult("Data was added (jobseeker)");
	}

}
