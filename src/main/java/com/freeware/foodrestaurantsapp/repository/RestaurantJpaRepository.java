package com.freeware.foodrestaurantsapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.freeware.foodrestaurantsapp.entity.RestaurantEntity;

/**
 * Repository : Restaurant.
 */
public interface RestaurantJpaRepository extends PagingAndSortingRepository<RestaurantEntity, Integer> {

}
