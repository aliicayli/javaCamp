package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.WorkTimeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/worktimes")

@CrossOrigin
public class WorkTimeController {

    private WorkTimeService workTimeService;

    @Autowired
    public  WorkTimeController(WorkTimeService workTimeService){
        this.workTimeService=workTimeService;
    }

    @GetMapping("/getall")
    DataResult<List<WorkTime>> getAll(){
        return this.workTimeService.getAll();
    }

}
