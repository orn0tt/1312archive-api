package com.archive_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.archive_api.models.Collection;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {

	List<Collection> findByFeatured(Boolean featured);

	Optional<Collection> findByName(String name);
}