package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor

public class Employers extends Users{



    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_name")
    private String websiteName;

    @Column(name = "phone_number")
    private String phoneNumber;
}
