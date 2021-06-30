package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

import java.util.List;

public interface ForeignLanguageService {

    DataResult<List<ForeignLanguage>> getAll();

    Result add(ForeignLanguage foreignLanguage);

    DataResult<List<ForeignLanguage>> getByCurriculumVitae_Id(int curriculumVitae);
}
