/*
 * Created on 20 svi 2017 ( Time 15:57:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package hr.miewmiew.MiewMiew.dbmodel.jpa;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "AspnetuserloginsEntity" ( stored in table "AspNetUserLogins" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class AspnetuserloginsEntityKey implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="LoginProvider", nullable=false)
    private String     loginprovider ;
    
    @Column(name="ProviderKey", nullable=false)
    private String     providerkey  ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public AspnetuserloginsEntityKey() {
        super();
    }

    public AspnetuserloginsEntityKey( String loginprovider, String providerkey ) {
        super();
        this.loginprovider = loginprovider ;
        this.providerkey = providerkey ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setLoginprovider( String value ) {
        this.loginprovider = value;
    }
    public String getLoginprovider() {
        return this.loginprovider;
    }

    public void setProviderkey( String value ) {
        this.providerkey = value;
    }
    public String getProviderkey() {
        return this.providerkey;
    }


    //----------------------------------------------------------------------
    // equals METHOD
    //----------------------------------------------------------------------
	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		AspnetuserloginsEntityKey other = (AspnetuserloginsEntityKey) obj; 
		//--- Attribute loginprovider
		if ( loginprovider == null ) { 
			if ( other.loginprovider != null ) 
				return false ; 
		} else if ( ! loginprovider.equals(other.loginprovider) ) 
			return false ; 
		//--- Attribute providerkey
		if ( providerkey == null ) { 
			if ( other.providerkey != null ) 
				return false ; 
		} else if ( ! providerkey.equals(other.providerkey) ) 
			return false ; 
		return true; 
	} 


    //----------------------------------------------------------------------
    // hashCode METHOD
    //----------------------------------------------------------------------
	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute loginprovider
		result = prime * result + ((loginprovider == null) ? 0 : loginprovider.hashCode() ) ; 
		//--- Attribute providerkey
		result = prime * result + ((providerkey == null) ? 0 : providerkey.hashCode() ) ; 
		
		return result; 
	} 


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(loginprovider); 
		sb.append("|"); 
		sb.append(providerkey); 
        return sb.toString();
    }
}
