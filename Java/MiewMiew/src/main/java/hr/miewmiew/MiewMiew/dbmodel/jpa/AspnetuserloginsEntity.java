/*
 * Created on 20 svi 2017 ( Time 15:57:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a composite Primary Key  


package hr.miewmiew.MiewMiew.dbmodel.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "AspNetUserLogins"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="AspNetUserLogins", schema="dbo", catalog="HackatonIn2" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="AspnetuserloginsEntity.countAll", query="SELECT COUNT(x) FROM AspnetuserloginsEntity x" )
} )
public class AspnetuserloginsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private AspnetuserloginsEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="ProviderDisplayName")
    private String     providerdisplayname ;

	// "userid" (column "UserId") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="UserId", referencedColumnName="Id")
    private AspnetusersEntity aspnetusers ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AspnetuserloginsEntity() {
		super();
		this.compositePrimaryKey = new AspnetuserloginsEntityKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setLoginprovider( String loginprovider ) {
        this.compositePrimaryKey.setLoginprovider( loginprovider ) ;
    }
    public String getLoginprovider() {
        return this.compositePrimaryKey.getLoginprovider() ;
    }
    public void setProviderkey( String providerkey ) {
        this.compositePrimaryKey.setProviderkey( providerkey ) ;
    }
    public String getProviderkey() {
        return this.compositePrimaryKey.getProviderkey() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : ProviderDisplayName ( nvarchar ) 
    public void setProviderdisplayname( String providerdisplayname ) {
        this.providerdisplayname = providerdisplayname;
    }
    public String getProviderdisplayname() {
        return this.providerdisplayname;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setAspnetusers( AspnetusersEntity aspnetusers ) {
        this.aspnetusers = aspnetusers;
    }
    public AspnetusersEntity getAspnetusers() {
        return this.aspnetusers;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" ); 
        }  
        sb.append("]:"); 
        sb.append(providerdisplayname);
        return sb.toString(); 
    } 

}
