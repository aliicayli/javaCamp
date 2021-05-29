package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService){
        this.jobSeekerService=jobSeekerService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeekers>> getAll(){
        return this.jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeekers jobSeekers){
        return this.jobSeekerService.add(jobSeekers);
    }
}
