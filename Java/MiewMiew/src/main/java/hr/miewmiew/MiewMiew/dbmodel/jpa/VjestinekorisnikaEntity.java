/*
 * Created on 20 svi 2017 ( Time 16:00:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package hr.miewmiew.MiewMiew.dbmodel.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "VjestineKorisnika"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="VjestineKorisnika", schema="dbo", catalog="HackatonIn2" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="VjestinekorisnikaEntity.countAll", query="SELECT COUNT(x) FROM VjestinekorisnikaEntity x" )
} )
public class VjestinekorisnikaEntity implements Serializable {

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
	// "korisnikid" (column "KorisnikId") is not defined by itself because used as FK in a link 
	// "specijalnostid" (column "SpecijalnostId") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="KorisnikId", referencedColumnName="Id")
    private AspnetusersEntity aspnetusers ;

    @ManyToOne
    @JoinColumn(name="SpecijalnostId", referencedColumnName="Id")
    private SpecijalnostiEntity specijalnosti;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public VjestinekorisnikaEntity() {
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

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setAspnetusers( AspnetusersEntity aspnetusers ) {
        this.aspnetusers = aspnetusers;
    }
    public AspnetusersEntity getAspnetusers() {
        return this.aspnetusers;
    }

    public void setSpecijalnosti( SpecijalnostiEntity specijalnosti ) {
        this.specijalnosti = specijalnosti;
    }
    public SpecijalnostiEntity getSpecijalnosti() {
        return this.specijalnosti;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        return sb.toString(); 
    } 

}
