package kodlamaio.hrms.core.adapters.abstracts;

public interface FakeMernisService {
    boolean validate(String identificationId, String firstName, String lastName, String birthDay);
}
