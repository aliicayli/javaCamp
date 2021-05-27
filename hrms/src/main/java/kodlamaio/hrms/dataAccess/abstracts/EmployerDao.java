package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer>{

}
