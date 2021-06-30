package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolNameService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schoolnames")

@CrossOrigin
public class SchoolNameController {

    private SchoolNameService schoolNameService;

    @Autowired
    public SchoolNameController(SchoolNameService schoolNameService){
        this.schoolNameService=schoolNameService;
    }

    @GetMapping("/getall")
    public DataResult<List<SchoolName>> getAll(){
        return this.schoolNameService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SchoolName schoolName){
        return this.schoolNameService.add(schoolName);
    }

}
