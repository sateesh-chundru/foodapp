package com.freeware.foodrestaurantsapp.repository;

	import org.springframework.data.repository.PagingAndSortingRepository;

import com.freeware.foodrestaurantsapp.entity.FooditemEntity;

/**
 * Repository : Fooditem.
 */
public interface FooditemJpaRepository extends PagingAndSortingRepository<FooditemEntity, Integer> {

}
