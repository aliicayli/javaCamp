package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/getall")
    public DataResult<List<Department>> getAll() {
        return this.departmentService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Department department) {
        return this.departmentService.add(department);
    }

}
