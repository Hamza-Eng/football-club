package akaza.gdt.com.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class ClientsDTO {
	@NotBlank
	private long id;
	private String name;
	private String lname;
	@NotBlank(message = "email is requered")
	@Email(message = "email format invalid ")
	private String email;
	@NotBlank(message = "email is requered")
	private String password;
	@NotEmpty
	private String position;
}
