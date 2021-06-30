package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SystemPersonalService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systempersonals")

@CrossOrigin
public class SystemPersonalController {

    private SystemPersonalService systemPersonalService;

    @Autowired
    public SystemPersonalController(SystemPersonalService systemPersonalService){
        this.systemPersonalService=systemPersonalService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonal>> getAll(){
        return this.systemPersonalService.getAll();
    }

    @PostMapping("/add")
    public Result add(SystemPersonal systemPersonal){
        return this.systemPersonalService.add(systemPersonal);
    }

    @PutMapping("/confirm")
    public Result confirm(int id, boolean active){
        return this.systemPersonalService.confirmJobPosting(id,active);
    }
}
