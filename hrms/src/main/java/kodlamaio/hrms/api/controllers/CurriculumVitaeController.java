package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculumvitaes")

@CrossOrigin
public class CurriculumVitaeController {

    private CurriculumVitaeService curriculumVitaeService;

    @Autowired
    public CurriculumVitaeController(CurriculumVitaeService curriculumVitaeService){
        this.curriculumVitaeService=curriculumVitaeService;
    }

    @GetMapping("/getall")
    public DataResult<List<CurriculumVitae>> getAll(){
        return this.curriculumVitaeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CurriculumVitae curriculumVitae){
       return this.curriculumVitaeService.add(curriculumVitae);
    }

    @PutMapping("/update")
    public Result update(@RequestBody CurriculumVitae curriculumVitae){
        return this.curriculumVitaeService.update(curriculumVitae);
    }

    @GetMapping("/getbyjobseekerid")
    public DataResult<List<CurriculumVitae>> getByJobSeekerId_Id(@RequestParam int jobSeekerId){
        return this.curriculumVitaeService.getByJobSeekerId_Id(jobSeekerId);
    }

}
