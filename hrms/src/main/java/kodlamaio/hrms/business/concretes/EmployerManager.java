package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao=employerDao;
    }


    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<List<Employers>>(this.employerDao.findAll(),"Employer was listed");
    }

    @Override
    public DataResult<List<Employers>> getByEpostaAddress(String epostaAddress) {
        return new SuccessDataResult<List<Employers>>(this.employerDao.getByEpostaAddress(epostaAddress));
    }


    @Override
    public Result add(Employers employers) {
        if(!getByEpostaAddress(employers.getEpostaAddress()).getData().isEmpty()){
           return new ErrorResult("This eposta address already exists.");
       }
       this.employerDao.save(employers);
       return new SuccessResult("Employer was added");

    }

}
