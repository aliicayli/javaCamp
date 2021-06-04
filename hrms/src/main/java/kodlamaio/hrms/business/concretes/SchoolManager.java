package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {

    private SchoolDao schoolDao;

    @Autowired
    public SchoolManager(SchoolDao schoolDao){
        this.schoolDao=schoolDao;
    }

    @Override
    public DataResult<List<School>> getAll() {
        return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Schools were listed");
    }

    @Override
    public Result add(School school) {
        this.schoolDao.save(school);
        return new SuccessResult("School was added");
    }
}
