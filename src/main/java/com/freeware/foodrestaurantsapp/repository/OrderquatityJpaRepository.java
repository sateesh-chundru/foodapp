package com.freeware.foodrestaurantsapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.freeware.foodrestaurantsapp.entity.OrderquatityEntity;

/**
 * Repository : Orderquatity.
 */
public interface OrderquatityJpaRepository extends PagingAndSortingRepository<OrderquatityEntity, Integer> {

}
