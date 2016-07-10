/*
 * Created on 10 Jul 2016 ( Time 20:21:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.beanmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.freeware.foodrestaurantsapp.entity.OrderquatityEntity;
import com.freeware.foodrestaurantsapp.model.Orderquatity;


/**
 * Mapping between entity beans and display beans.
 */
@Component
public class OrderquatityServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public OrderquatityServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'OrderquatityEntity' to 'Orderquatity'
	 * @param orderquatityEntity
	 */
	public Orderquatity mapOrderquatityEntityToOrderquatity(OrderquatityEntity orderquatityEntity) {
		if(orderquatityEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Orderquatity orderquatity = map(orderquatityEntity, Orderquatity.class);

		return orderquatity;
	}
	
	/**
	 * Mapping from 'Orderquatity' to 'OrderquatityEntity'
	 * @param orderquatity
	 * @param orderquatityEntity
	 */
	public void mapOrderquatityToOrderquatityEntity(Orderquatity orderquatity, OrderquatityEntity orderquatityEntity) {
		if(orderquatity == null) {
			return;
		}

		//--- Generic mapping 
		map(orderquatity, orderquatityEntity);

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