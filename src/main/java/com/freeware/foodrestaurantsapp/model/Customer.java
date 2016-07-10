/*
 * Created on 10 Jul 2016 ( Time 19:32:41 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.freeware.foodrestaurantsapp.model;

import java.io.Serializable;


/**
 * Java bean for 'Customer' entity
 * 
 * @author Telosys Tools
 *
 */
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : customer_id serial 
    private Integer customerId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : customer_name text 
    private String customerName;

    // DB : customer_phoneno varchar 
    private String customerPhoneno;

    // DB : customer_emailid varchar 
    private String customerEmailid;

    // DB : password varchar 
    private String password;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setCustomerId( Integer customerId ) {
        this.customerId = customerId ;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setCustomerName( String customerName ) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerPhoneno( String customerPhoneno ) {
        this.customerPhoneno = customerPhoneno;
    }
    public String getCustomerPhoneno() {
        return this.customerPhoneno;
    }

    public void setCustomerEmailid( String customerEmailid ) {
        this.customerEmailid = customerEmailid;
    }
    public String getCustomerEmailid() {
        return this.customerEmailid;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(customerId);
        sb.append("|");
        sb.append(customerName);
        sb.append("|");
        sb.append(customerPhoneno);
        sb.append("|");
        sb.append(customerEmailid);
        sb.append("|");
        sb.append(password);
        return sb.toString(); 
    } 


}