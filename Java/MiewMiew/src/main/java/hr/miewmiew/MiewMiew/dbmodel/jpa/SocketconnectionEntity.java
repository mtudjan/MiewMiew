/*
 * Created on 20 svi 2017 ( Time 15:57:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package hr.miewmiew.MiewMiew.dbmodel.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "SocketConnection"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="SocketConnection", schema="dbo", catalog="HackatonIn2" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="SocketconnectionEntity.countAll", query="SELECT COUNT(x) FROM SocketconnectionEntity x" )
} )
public class SocketconnectionEntity implements Serializable {

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
    @Column(name="SocketId", nullable=false)
    private String     socketid     ;

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
    public SocketconnectionEntity() {
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
    //--- DATABASE MAPPING : SocketId ( nvarchar ) 
    public void setSocketid( String socketid ) {
        this.socketid = socketid;
    }
    public String getSocketid() {
        return this.socketid;
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
        sb.append(socketid);
        return sb.toString(); 
    } 

}
