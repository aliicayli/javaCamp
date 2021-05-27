package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobsSeekers;

public interface JobSeekerService {

	DataResult<List<JobsSeekers>> getAll();
	Result add(JobsSeekers jobsSeekers);
	
}
