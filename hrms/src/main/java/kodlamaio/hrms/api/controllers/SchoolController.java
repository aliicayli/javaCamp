package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")

@CrossOrigin
public class SchoolController {
    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService=schoolService;
    }

    @GetMapping("/getall")
    public DataResult<List<School>> getAll(){
        return this.schoolService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody School school){
        return this.schoolService.add(school);
    }

    @GetMapping("/getbycurriculumvitaeid")
    public DataResult<List<School>> getByCurriculumVitae_Id(int curriculumVitae){
        return this.schoolService.getByCurriculumVitae_Id(curriculumVitae);
    }
}
