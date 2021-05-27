package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Employers {
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website_name")
	private String websiteName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
}
