package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonal;

import java.util.List;

public interface SystemPersonalService {
    DataResult<List<SystemPersonal>> getAll();

    Result add(SystemPersonal systemPersonal);

    Result confirmJobPosting(int id, boolean active);
}
