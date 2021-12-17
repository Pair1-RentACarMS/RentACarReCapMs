package com.appsdeveloperblog.rentacar.api.rental.business.dtos.colorDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateColorDto {
	
	@NotNull @Size(min = 2,max = 25)
	private String colorName;

}
