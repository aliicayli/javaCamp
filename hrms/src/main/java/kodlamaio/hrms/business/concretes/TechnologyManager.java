package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologyDao;
import kodlamaio.hrms.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    private TechnologyDao technologyDao;

    @Autowired
    public TechnologyManager(TechnologyDao technologyDao){
        this.technologyDao=technologyDao;
    }

    @Override
    public DataResult<List<Technology>> getAll() {
        return new SuccessDataResult<List<Technology>>(this.technologyDao.findAll(),"Technologies were listed");
    }

    @Override
    public Result add(Technology technology) {
        this.technologyDao.save(technology);
        return new SuccessResult("Technology was added");
    }

    @Override
    public DataResult<List<Technology>> getByCurriculumVitae_Id(int curriculumVitae) {
        return new SuccessDataResult<List<Technology>>(this.technologyDao.getByCurriculumVitae_Id(curriculumVitae));
    }
}
