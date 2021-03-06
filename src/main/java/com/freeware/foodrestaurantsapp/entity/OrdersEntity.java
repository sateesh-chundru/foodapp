/*
 * Created on 10 Jul 2016 ( Time 19:19:45 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.freeware.foodrestaurantsapp.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Persistent class for entity stored in table "orders"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="orders", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="OrdersEntity.countAll", query="SELECT COUNT(x) FROM OrdersEntity x" )
} )
public class OrdersEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="orders_id", nullable=false)
    private Integer    ordersId     ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="customer_id")
    private Integer    customerId   ;

    @Column(name="delivery_address", length=2147483647)
    private String     deliveryAddress ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public OrdersEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setOrdersId( Integer ordersId ) {
        this.ordersId = ordersId ;
    }
    public Integer getOrdersId() {
        return this.ordersId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : customer_id ( int4 ) 
    public void setCustomerId( Integer customerId ) {
        this.customerId = customerId;
    }
    public Integer getCustomerId() {
        return this.customerId;
    }

    //--- DATABASE MAPPING : delivery_address ( varchar ) 
    public void setDeliveryAddress( String deliveryAddress ) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(ordersId);
        sb.append("]:"); 
        sb.append(customerId);
        sb.append("|");
        sb.append(deliveryAddress);
        return sb.toString(); 
    } 

}
