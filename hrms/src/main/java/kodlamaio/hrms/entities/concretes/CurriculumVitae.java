package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cv")
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name ="jobseeker_id")
    private JobSeekers jobSeekerId;

    @Column(name = "photo")
    private String photo;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "linkedin_link")
    private String linkedinLink;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date")
    private Date creationDate;

}
