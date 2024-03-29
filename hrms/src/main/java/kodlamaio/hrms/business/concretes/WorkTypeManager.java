package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkTypeDao;
import kodlamaio.hrms.entities.concretes.WorkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTypeManager implements WorkTypeService {

    private WorkTypeDao workTypeDao;

    @Autowired
    public WorkTypeManager(WorkTypeDao workTypeDao){
        this.workTypeDao=workTypeDao;
    }

    @Override
    public DataResult<List<WorkType>> getAll() {
        return new SuccessDataResult<List<WorkType>>(this.workTypeDao.findAll(),"Work types were listed");
    }
}
