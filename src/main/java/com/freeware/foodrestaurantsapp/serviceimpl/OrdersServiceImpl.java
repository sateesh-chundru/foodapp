/*
 * Created on 10 Jul 2016 ( Time 20:21:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.freeware.foodrestaurantsapp.beanmapper.OrdersServiceMapper;
import com.freeware.foodrestaurantsapp.entity.OrdersEntity;
import com.freeware.foodrestaurantsapp.model.Orders;
import com.freeware.foodrestaurantsapp.repository.OrdersJpaRepository;
import com.freeware.foodrestaurantsapp.service.OrdersService;

/**
 * Implementation of OrdersService
 */
@Component
@Transactional
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersJpaRepository ordersJpaRepository;

	@Resource
	private OrdersServiceMapper ordersServiceMapper;
	
	@Override
	public Orders findById(Integer ordersId) {
		OrdersEntity ordersEntity = ordersJpaRepository.findOne(ordersId);
		return ordersServiceMapper.mapOrdersEntityToOrders(ordersEntity);
	}

	@Override
	public List<Orders> findAll() {
		Iterable<OrdersEntity> entities = ordersJpaRepository.findAll();
		List<Orders> beans = new ArrayList<Orders>();
		for(OrdersEntity ordersEntity : entities) {
			beans.add(ordersServiceMapper.mapOrdersEntityToOrders(ordersEntity));
		}
		return beans;
	}

	@Override
	public Orders save(Orders orders) {
		return update(orders) ;
	}

	@Override
	public Orders create(Orders orders) {
		OrdersEntity ordersEntity = ordersJpaRepository.findOne(orders.getOrdersId());
		if( ordersEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		ordersEntity = new OrdersEntity();
		ordersServiceMapper.mapOrdersToOrdersEntity(orders, ordersEntity);
		OrdersEntity ordersEntitySaved = ordersJpaRepository.save(ordersEntity);
		return ordersServiceMapper.mapOrdersEntityToOrders(ordersEntitySaved);
	}

	@Override
	public Orders update(Orders orders) {
		OrdersEntity ordersEntity = ordersJpaRepository.findOne(orders.getOrdersId());
		ordersServiceMapper.mapOrdersToOrdersEntity(orders, ordersEntity);
		OrdersEntity ordersEntitySaved = ordersJpaRepository.save(ordersEntity);
		return ordersServiceMapper.mapOrdersEntityToOrders(ordersEntitySaved);
	}

	@Override
	public void delete(Integer ordersId) {
		ordersJpaRepository.delete(ordersId);
	}

	public OrdersJpaRepository getOrdersJpaRepository() {
		return ordersJpaRepository;
	}

	public void setOrdersJpaRepository(OrdersJpaRepository ordersJpaRepository) {
		this.ordersJpaRepository = ordersJpaRepository;
	}

	public OrdersServiceMapper getOrdersServiceMapper() {
		return ordersServiceMapper;
	}

	public void setOrdersServiceMapper(OrdersServiceMapper ordersServiceMapper) {
		this.ordersServiceMapper = ordersServiceMapper;
	}

}
