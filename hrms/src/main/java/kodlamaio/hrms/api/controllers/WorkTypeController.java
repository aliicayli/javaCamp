package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.WorkTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/worktypes")

@CrossOrigin
public class WorkTypeController {

    private WorkTypeService workTypeService;

    @Autowired
    public WorkTypeController(WorkTypeService workTypeService){
        this.workTypeService=workTypeService;
    }

    @GetMapping("/getall")
    DataResult<List<WorkType>> getAll(){
        return this.workTypeService.getAll();
    }
}
