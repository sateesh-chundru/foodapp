/*
 * Created on 10 Jul 2016 ( Time 20:21:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.freeware.foodrestaurantsapp.beanmapper.RestaurantServiceMapper;
import com.freeware.foodrestaurantsapp.entity.RestaurantEntity;
import com.freeware.foodrestaurantsapp.model.Restaurant;
import com.freeware.foodrestaurantsapp.repository.RestaurantJpaRepository;
import com.freeware.foodrestaurantsapp.service.RestaurantService;

/**
 * Implementation of RestaurantService
 */
@Component
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	@Resource
	private RestaurantJpaRepository restaurantJpaRepository;

	@Resource
	private RestaurantServiceMapper restaurantServiceMapper;
	
	@Override
	public Restaurant findById(Integer restaurantId) {
		RestaurantEntity restaurantEntity = restaurantJpaRepository.findOne(restaurantId);
		return restaurantServiceMapper.mapRestaurantEntityToRestaurant(restaurantEntity);
	}

	@Override
	public List<Restaurant> findAll() {
		Iterable<RestaurantEntity> entities = restaurantJpaRepository.findAll();
		List<Restaurant> beans = new ArrayList<Restaurant>();
		for(RestaurantEntity restaurantEntity : entities) {
			beans.add(restaurantServiceMapper.mapRestaurantEntityToRestaurant(restaurantEntity));
		}
		return beans;
	}

	@Override
	public Restaurant save(Restaurant restaurant) {
		return update(restaurant) ;
	}

	@Override
	public Restaurant create(Restaurant restaurant) {
		RestaurantEntity restaurantEntity = restaurantJpaRepository.findOne(restaurant.getRestaurantId());
		if( restaurantEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		restaurantEntity = new RestaurantEntity();
		restaurantServiceMapper.mapRestaurantToRestaurantEntity(restaurant, restaurantEntity);
		RestaurantEntity restaurantEntitySaved = restaurantJpaRepository.save(restaurantEntity);
		return restaurantServiceMapper.mapRestaurantEntityToRestaurant(restaurantEntitySaved);
	}

	@Override
	public Restaurant update(Restaurant restaurant) {
		RestaurantEntity restaurantEntity = restaurantJpaRepository.findOne(restaurant.getRestaurantId());
		restaurantServiceMapper.mapRestaurantToRestaurantEntity(restaurant, restaurantEntity);
		RestaurantEntity restaurantEntitySaved = restaurantJpaRepository.save(restaurantEntity);
		return restaurantServiceMapper.mapRestaurantEntityToRestaurant(restaurantEntitySaved);
	}

	@Override
	public void delete(Integer restaurantId) {
		restaurantJpaRepository.delete(restaurantId);
	}

	public RestaurantJpaRepository getRestaurantJpaRepository() {
		return restaurantJpaRepository;
	}

	public void setRestaurantJpaRepository(RestaurantJpaRepository restaurantJpaRepository) {
		this.restaurantJpaRepository = restaurantJpaRepository;
	}

	public RestaurantServiceMapper getRestaurantServiceMapper() {
		return restaurantServiceMapper;
	}

	public void setRestaurantServiceMapper(RestaurantServiceMapper restaurantServiceMapper) {
		this.restaurantServiceMapper = restaurantServiceMapper;
	}

}
