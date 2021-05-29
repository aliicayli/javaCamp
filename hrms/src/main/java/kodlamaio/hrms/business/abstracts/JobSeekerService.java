package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeekers>> getAll();
    Result add(JobSeekers jobSeekers);
    DataResult<JobSeekers> getByIdentificationNumber(String identificationNumber);
    DataResult<JobSeekers> getByEpostaAddress(String epostaAddress);
}
