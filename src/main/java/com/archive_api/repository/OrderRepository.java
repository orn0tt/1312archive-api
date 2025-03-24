package com.archive_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.archive_api.models.Order;
import com.archive_api.models.Order.OrderStatus;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByUserId(Long userId);

	Optional<Order> findByOrderNumber(String orderNumber);

	List<Order> findByStatus(OrderStatus status);
}