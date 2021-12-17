package com.appsdeveloperblog.rentacar.api.rental.cqrsPackage.features.restModels;

import java.time.LocalDate;

import org.axonframework.modelling.command.AggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRestModel {
	
	
	private int carId;
	private LocalDate rentDate;
	private LocalDate returnDate;
	private int rentKilometer;
	private int returnKilometer;

}
