/*
 * Created on 20 svi 2017 ( Time 15:57:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package hr.miewmiew.MiewMiew.dbmodel.jpa;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "AspnetusertokensEntity" ( stored in table "AspNetUserTokens" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class AspnetusertokensEntityKey implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="UserId", nullable=false)
    private String     userid       ;
    
    @Column(name="LoginProvider", nullable=false)
    private String     loginprovider ;
    
    @Column(name="Name", nullable=false)
    private String     name         ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public AspnetusertokensEntityKey() {
        super();
    }

    public AspnetusertokensEntityKey( String userid, String loginprovider, String name ) {
        super();
        this.userid = userid ;
        this.loginprovider = loginprovider ;
        this.name = name ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setUserid( String value ) {
        this.userid = value;
    }
    public String getUserid() {
        return this.userid;
    }

    public void setLoginprovider( String value ) {
        this.loginprovider = value;
    }
    public String getLoginprovider() {
        return this.loginprovider;
    }

    public void setName( String value ) {
        this.name = value;
    }
    public String getName() {
        return this.name;
    }


    //----------------------------------------------------------------------
    // equals METHOD
    //----------------------------------------------------------------------
	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		AspnetusertokensEntityKey other = (AspnetusertokensEntityKey) obj; 
		//--- Attribute userid
		if ( userid == null ) { 
			if ( other.userid != null ) 
				return false ; 
		} else if ( ! userid.equals(other.userid) ) 
			return false ; 
		//--- Attribute loginprovider
		if ( loginprovider == null ) { 
			if ( other.loginprovider != null ) 
				return false ; 
		} else if ( ! loginprovider.equals(other.loginprovider) ) 
			return false ; 
		//--- Attribute name
		if ( name == null ) { 
			if ( other.name != null ) 
				return false ; 
		} else if ( ! name.equals(other.name) ) 
			return false ; 
		return true; 
	} 


    //----------------------------------------------------------------------
    // hashCode METHOD
    //----------------------------------------------------------------------
	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute userid
		result = prime * result + ((userid == null) ? 0 : userid.hashCode() ) ; 
		//--- Attribute loginprovider
		result = prime * result + ((loginprovider == null) ? 0 : loginprovider.hashCode() ) ; 
		//--- Attribute name
		result = prime * result + ((name == null) ? 0 : name.hashCode() ) ; 
		
		return result; 
	} 


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(userid); 
		sb.append("|"); 
		sb.append(loginprovider); 
		sb.append("|"); 
		sb.append(name); 
        return sb.toString();
    }
}
