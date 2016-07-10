/*
 * Created on 10 Jul 2016 ( Time 20:21:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.service;

import java.util.List;

import com.freeware.foodrestaurantsapp.model.Orderquatity;


/**
 * Business Service Interface for entity Orderquatity.
 */
public interface OrderquatityService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param orderquatity
	 * @return entity
	 */
	Orderquatity findById( Integer orderquatity  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Orderquatity> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Orderquatity save(Orderquatity entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Orderquatity update(Orderquatity entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Orderquatity create(Orderquatity entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param orderquatity
	 */
	void delete( Integer orderquatity );


}
