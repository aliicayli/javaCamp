package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "schools")
@AllArgsConstructor
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "school_name_id")
    private SchoolName schoolName;

    @Column(name = "starting_date")
    private Date startingDate;

    @Column(name = "end_date")
    private Date endDate;





}
