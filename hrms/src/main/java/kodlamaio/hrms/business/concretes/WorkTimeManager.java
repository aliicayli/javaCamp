package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkTimeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkTimeDao;
import kodlamaio.hrms.entities.concretes.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTimeManager implements WorkTimeService {

    private WorkTimeDao workTimeDao;

    @Autowired
    public WorkTimeManager(WorkTimeDao workTimeDao){
        this.workTimeDao=workTimeDao;
    }

    @Override
    public DataResult<List<WorkTime>> getAll() {
        return new SuccessDataResult<List<WorkTime>>(this.workTimeDao.findAll(),"Work times were listed");
    }
}
