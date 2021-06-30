package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
@NoArgsConstructor


public class Employers extends Users {


    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_name")
    private String websiteName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employers")
    private List<JobPosting> jobPostings;




}
