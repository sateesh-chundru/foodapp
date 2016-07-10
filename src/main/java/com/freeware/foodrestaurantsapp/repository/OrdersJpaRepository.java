package com.freeware.foodrestaurantsapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.freeware.foodrestaurantsapp.entity.OrdersEntity;

/**
 * Repository : Orders.
 */
public interface OrdersJpaRepository extends PagingAndSortingRepository<OrdersEntity, Integer> {

}
