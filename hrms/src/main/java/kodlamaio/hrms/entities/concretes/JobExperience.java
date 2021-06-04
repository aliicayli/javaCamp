package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jobexperience")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "job_position")
    private String jobPosition;

    @Column(name = "starting_date")
    private Date startingDate;

    @Column(name = "end_date")
    private Date endDate;

}
