package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolNameService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolNameDao;
import kodlamaio.hrms.entities.concretes.SchoolName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolNameManager implements SchoolNameService {

    private SchoolNameDao schoolNameDao;

    @Autowired
    public SchoolNameManager(SchoolNameDao schoolNameDao){
        this.schoolNameDao=schoolNameDao;
    }

    @Override
    public DataResult<List<SchoolName>> getAll() {
        return new SuccessDataResult<List<SchoolName>>(this.schoolNameDao.findAll(),"School names were listed");
    }

    @Override
    public Result add(SchoolName schoolName) {
        this.schoolNameDao.save(schoolName);
        return new SuccessResult("School name was added");
    }
}
