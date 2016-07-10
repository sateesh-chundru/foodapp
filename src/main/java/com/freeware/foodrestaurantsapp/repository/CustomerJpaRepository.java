

package com.freeware.foodrestaurantsapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.freeware.foodrestaurantsapp.entity.CustomerEntity;


/**
 * Repository : Customer.
 */
public interface CustomerJpaRepository extends PagingAndSortingRepository<CustomerEntity, Integer> {

}
