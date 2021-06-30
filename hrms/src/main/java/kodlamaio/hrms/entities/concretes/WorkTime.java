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
@Table(name = "worktime")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})
public class WorkTime {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "work_time_name")
    private String workTimeName;

    @JsonIgnore
    @OneToMany(mappedBy = "workTimeId")
    private List<JobPosting> jobPostings;

}
