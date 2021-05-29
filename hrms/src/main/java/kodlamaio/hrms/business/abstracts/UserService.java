package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Users;

import java.util.List;

public interface UserService {
     DataResult<List<Users>> getAll();
    DataResult<Users> getByEpostaAddress(String epostaAddress);
}
