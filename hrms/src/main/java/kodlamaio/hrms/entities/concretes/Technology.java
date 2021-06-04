package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "technology")
@AllArgsConstructor
@NoArgsConstructor
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;

    @Column(name = "technology_name")
    private String technologyName;
}
