/*
 * Created on 10 Jul 2016 ( Time 20:21:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.beanmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.freeware.foodrestaurantsapp.entity.OrdersEntity;
import com.freeware.foodrestaurantsapp.model.Orders;


/**
 * Mapping between entity beans and display beans.
 */
@Component
public class OrdersServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public OrdersServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'OrdersEntity' to 'Orders'
	 * @param ordersEntity
	 */
	public Orders mapOrdersEntityToOrders(OrdersEntity ordersEntity) {
		if(ordersEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Orders orders = map(ordersEntity, Orders.class);

		return orders;
	}
	
	/**
	 * Mapping from 'Orders' to 'OrdersEntity'
	 * @param orders
	 * @param ordersEntity
	 */
	public void mapOrdersToOrdersEntity(Orders orders, OrdersEntity ordersEntity) {
		if(orders == null) {
			return;
		}

		//--- Generic mapping 
		map(orders, ordersEntity);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}