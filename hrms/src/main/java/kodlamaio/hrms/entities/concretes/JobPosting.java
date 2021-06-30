package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jobpostings")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "number_of_open_positions")
    private int numberOfOpenPositions;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "application_deadline")
    private Date applicationDeadline;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cityId;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employers employers;

    @OneToOne()
    @JoinColumn(name = "work_type_id")
    private WorkType workTypeId;

    @ManyToOne
    @JoinColumn(name = "work_time_id")
    private WorkTime workTimeId;


}
