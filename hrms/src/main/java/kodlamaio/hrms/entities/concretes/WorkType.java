package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "worktype")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})
public class WorkType {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "type_name")
    private String typeName;

    @JsonIgnore
    @OneToMany(mappedBy = "workTypeId")
    private List<JobPosting> jobPostings;
}
