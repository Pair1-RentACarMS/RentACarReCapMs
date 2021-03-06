package com.appsdeveloperblog.rentacar.api.rental.models.colorModels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateColorRequestModel {
	
	@JsonIgnore
	private int id;
	
	
	@NotNull @NotBlank @Size(min = 2)
	private String colorName;

}
