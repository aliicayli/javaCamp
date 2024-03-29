package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkType;

import java.util.List;

public interface WorkTypeService {
    public DataResult<List<WorkType>> getAll();
}
