package com.archive_api.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "coupons")
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String code;

	@Column(nullable = false)
	private BigDecimal discountValue;

	@Enumerated(EnumType.STRING)
	private DiscountType discountType;

	private BigDecimal minimumPurchase;

	private LocalDateTime validFrom;

	private LocalDateTime validUntil;

	private Integer usageLimit;

	private Integer usageCount;

	// Enum para os tipos de desconto
	public enum DiscountType {
		PERCENTAGE, FIXED_AMOUNT
	}
}