package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Stack;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        this.userDao=userDao;
    }


    @Override
    public DataResult<List<Users>> getAll() {
        return new SuccessDataResult<>(this.userDao.findAll(),"Users were listed");
    }

    @Override
    public DataResult<Users> getByEpostaAddress(String epostaAddress) {
        return new SuccessDataResult<>(this.userDao.getByEpostaAddress(epostaAddress));
    }





}
