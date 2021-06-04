package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolName;

import java.util.List;

public interface SchoolNameService {
    DataResult<List<SchoolName>> getAll();

    Result add(SchoolName schoolName);
}
