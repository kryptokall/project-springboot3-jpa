package com.estudos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.course.entities.Order;

// Não é necessária a annotation @Repository, pois a classe herda de JpaRepository, que já é registrada como repository do Spring
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
