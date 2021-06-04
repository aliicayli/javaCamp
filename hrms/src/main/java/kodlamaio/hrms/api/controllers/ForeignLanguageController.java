package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguageController {

    private ForeignLanguageService foreignLanguageService;

    @Autowired
    public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
        this.foreignLanguageService = foreignLanguageService;
    }

    @GetMapping("/getall")
    public DataResult<List<ForeignLanguage>> getAll(){
        return this.foreignLanguageService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ForeignLanguage foreignLanguage){
        return this.foreignLanguageService.add(foreignLanguage);
    }
}
