/*
 * Created on 10 Jul 2016 ( Time 20:21:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.service;

import java.util.List;

import com.freeware.foodrestaurantsapp.model.Quatitytype;


/**
 * Business Service Interface for entity Quatitytype.
 */
public interface QuatitytypeService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param quatityId
	 * @return entity
	 */
	Quatitytype findById( Integer quatityId  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Quatitytype> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Quatitytype save(Quatitytype entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Quatitytype update(Quatitytype entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Quatitytype create(Quatitytype entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param quatityId
	 */
	void delete( Integer quatityId );


}
