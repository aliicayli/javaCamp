package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {

    private String companyName;
    private String jobPosition;
    private int numberOfOpenPositions;
    private Date releaseDate;
    private Date applicationDeadline;

}
