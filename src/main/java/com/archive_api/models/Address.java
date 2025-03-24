package com.archive_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;
	private String country;
	private String zipCode;

	@Enumerated(EnumType.STRING)
	private AddressType type;

	private Boolean isDefault;

	// Enum para os tipos de endereço
	public enum AddressType {
		SHIPPING, BILLING
	}
}