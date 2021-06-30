package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {

    private CurriculumVitaeDao curriculumVitaeDao;

    @Autowired
    public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao){
        this.curriculumVitaeDao=curriculumVitaeDao;
    }

    @Override
    public DataResult<List<CurriculumVitae>> getAll() {
        return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(),"CVs were listed");
    }

    @Override
    public Result add(CurriculumVitae curriculumVitae) {
        this.curriculumVitaeDao.save(curriculumVitae);
        return new SuccessResult("CV was added");
    }

    @Override
    public Result update(CurriculumVitae curriculumVitae) {
        this.curriculumVitaeDao.save(curriculumVitae);
        return new SuccessResult("Cv was updated");
    }

    @Override
    public DataResult<List<CurriculumVitae>> getByJobSeekerId_Id(int jobSeekerId) {
        return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.getByJobSeekerId_Id(jobSeekerId));
    }


}
