package com.archive_api.repository;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.archive_api.models.Category;
import com.archive_api.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCategory(Category category);

	List<Product> findByBrand(String brand);

	List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

	List<Product> findByCollectionsId(Long collectionId);

	Page<Product> findAll(Pageable pageable);

	Optional<Product> findBySlug(String slug);
}