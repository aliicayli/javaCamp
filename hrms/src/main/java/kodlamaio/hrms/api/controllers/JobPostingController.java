package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobpostings")
public class JobPostingController {
    private JobPostingService jobPostingService;

    @Autowired
    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPosting>> getAll() {
        return this.jobPostingService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosting jobPosting) {
        return this.jobPostingService.add(jobPosting);
    }

    @PostMapping("/update")
    public Result update(@RequestBody JobPosting jobPosting){
        return this.jobPostingService.update(jobPosting);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JobPosting jobPosting){
        return this.jobPostingService.delete(jobPosting);
    }


    @GetMapping("/getactive")
    public DataResult<List<JobPosting>> getByIsActive() {
        return this.jobPostingService.getByIsActive();
    }

    @GetMapping("/getalladate")
    public DataResult<List<JobPosting>> getAllSortedByDate(){
        return this.jobPostingService.getAllSortedByDate();
    }
}

