package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "foreignlanguage")
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_level")
    private String languageLevel;
}
