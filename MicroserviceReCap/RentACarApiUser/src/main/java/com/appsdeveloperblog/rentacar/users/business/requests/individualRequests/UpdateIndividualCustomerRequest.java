package com.appsdeveloperblog.rentacar.users.business.requests.individualRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateIndividualCustomerRequest {

	@NotNull
	private int id;

	@NotNull
	@NotBlank
	@Size(min = 2, max = 25)
	private String firstName;
	
	@NotNull
	@NotBlank
	@Size(min = 2, max = 25)
	private String lastName;

	@Email
	@NotBlank
	@NotNull
	private String email;

	@NotNull
	@Size(min = 6, max = 20)
	@NotBlank
	private String password;

	@NotNull
	private LocalDate birthdate;

}
