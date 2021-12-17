package com.appsdeveloperblog.rentacar.api.rental.cqrsPackage.features.commands.create;

import java.time.LocalDate;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Data;

@Data
public class RentalCreatedEvent {

	private String rentalId;
	private int carId;
	private LocalDate rentDate;
	private LocalDate returnDate;
	private int rentKilometer;
	private int returnKilometer;

}
