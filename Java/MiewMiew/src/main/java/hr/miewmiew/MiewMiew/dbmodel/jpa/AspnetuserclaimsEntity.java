/*
 * Created on 20 svi 2017 ( Time 15:57:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package hr.miewmiew.MiewMiew.dbmodel.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "AspNetUserClaims"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="AspNetUserClaims", schema="dbo", catalog="HackatonIn2" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="AspnetuserclaimsEntity.countAll", query="SELECT COUNT(x) FROM AspnetuserclaimsEntity x" )
} )
public class AspnetuserclaimsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="ClaimType")
    private String     claimtype    ;

    @Column(name="ClaimValue")
    private String     claimvalue   ;

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
    public AspnetuserclaimsEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : ClaimType ( nvarchar ) 
    public void setClaimtype( String claimtype ) {
        this.claimtype = claimtype;
    }
    public String getClaimtype() {
        return this.claimtype;
    }

    //--- DATABASE MAPPING : ClaimValue ( nvarchar ) 
    public void setClaimvalue( String claimvalue ) {
        this.claimvalue = claimvalue;
    }
    public String getClaimvalue() {
        return this.claimvalue;
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
        sb.append(id);
        sb.append("]:"); 
        sb.append(claimtype);
        sb.append("|");
        sb.append(claimvalue);
        return sb.toString(); 
    } 

}
