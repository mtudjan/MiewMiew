/*
 * Created on 21 svi 2017 ( Time 03:31:35 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package hr.miewmiew.MiewMiew.dbmodel.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "AspNetUsers"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="AspNetUsers", schema="dbo", catalog="HackatonIn2" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="AspnetusersEntity.countAll", query="SELECT COUNT(x) FROM AspnetusersEntity x" )
} )
public class AspnetusersEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="Id", nullable=false)
    private String     id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="AccessFailedCount", nullable=false)
    private Integer    accessfailedcount ;

    @Column(name="ConcurrencyStamp")
    private String     concurrencystamp ;

    @Column(name="Email")
    private String     email        ;

    @Column(name="EmailConfirmed", nullable=false)
    private Boolean    emailconfirmed ;

    @Column(name="LockoutEnabled", nullable=false)
    private Boolean    lockoutenabled ;

    @Column(name="LockoutEnd")
    private String     lockoutend   ;

    @Column(name="NormalizedEmail")
    private String     normalizedemail ;

    @Column(name="NormalizedUserName")
    private String     normalizedusername ;

    @Column(name="PasswordHash")
    private String     passwordhash ;

    @Column(name="PhoneNumber")
    private String     phonenumber  ;

    @Column(name="PhoneNumberConfirmed", nullable=false)
    private Boolean    phonenumberconfirmed ;

    @Column(name="SecurityStamp")
    private String     securitystamp ;

    @Column(name="TwoFactorEnabled", nullable=false)
    private Boolean    twofactorenabled ;

    @Column(name="UserName")
    private String     username     ;

    @Column(name="Salt")
    private String     salt         ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Created")
    private Date       created      ;

    @Column(name="Ime")
    private String     ime          ;

    @Column(name="Prezime")
    private String     prezime      ;

    @Column(name="Razina")
    private Integer    razina       ;

    @Column(name="Latitude")
    private Double     latitude     ;

    @Column(name="Longitude")
    private Double     longitude    ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="aspnetusers", targetEntity=AkcijaspasavanjeEntity.class)
    private List<AkcijaspasavanjeEntity> listOfAkcijaspasavanje;

    @OneToMany(mappedBy="aspnetusers", targetEntity=DostupanEntity.class)
    private List<DostupanEntity> listOfDostupan;

    @OneToMany(mappedBy="aspnetusers", targetEntity=SudioniciEntity.class)
    private List<SudioniciEntity> listOfSudionici;

    @OneToMany(mappedBy="aspnetusers", targetEntity=NedostupanEntity.class)
    private List<NedostupanEntity> listOfNedostupan;

    @OneToMany(mappedBy="aspnetusers", targetEntity=PorukaEntity.class)
    private List<PorukaEntity> listOfPoruka;

    @OneToMany(mappedBy="aspnetusers", targetEntity=AspnetuserclaimsEntity.class)
    private List<AspnetuserclaimsEntity> listOfAspnetuserclaims;

    @ManyToMany(mappedBy="listOfAspnetusers", targetEntity=AspnetrolesEntity.class)
    private List<AspnetrolesEntity> listOfAspnetroles;

    @OneToMany(mappedBy="aspnetusers2", targetEntity=PorukaEntity.class)
    private List<PorukaEntity> listOfPoruka2;

    @OneToMany(mappedBy="aspnetusers", targetEntity=VjestinekorisnikaEntity.class)
    private List<VjestinekorisnikaEntity> listOfVjestinekorisnika;

    @OneToMany(mappedBy="aspnetusers", targetEntity=SocketconnectionEntity.class)
    private List<SocketconnectionEntity> listOfSocketconnection;

    @OneToMany(mappedBy="aspnetusers", targetEntity=AspnetuserloginsEntity.class)
    private List<AspnetuserloginsEntity> listOfAspnetuserlogins;

    @OneToMany(mappedBy="aspnetusers", targetEntity=SocketEntity.class)
    private List<SocketEntity> listOfSocket;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AspnetusersEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( String id ) {
        this.id = id ;
    }
    public String getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : AccessFailedCount ( int ) 
    public void setAccessfailedcount( Integer accessfailedcount ) {
        this.accessfailedcount = accessfailedcount;
    }
    public Integer getAccessfailedcount() {
        return this.accessfailedcount;
    }

    //--- DATABASE MAPPING : ConcurrencyStamp ( nvarchar ) 
    public void setConcurrencystamp( String concurrencystamp ) {
        this.concurrencystamp = concurrencystamp;
    }
    public String getConcurrencystamp() {
        return this.concurrencystamp;
    }

    //--- DATABASE MAPPING : Email ( nvarchar ) 
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    //--- DATABASE MAPPING : EmailConfirmed ( bit ) 
    public void setEmailconfirmed( Boolean emailconfirmed ) {
        this.emailconfirmed = emailconfirmed;
    }
    public Boolean getEmailconfirmed() {
        return this.emailconfirmed;
    }

    //--- DATABASE MAPPING : LockoutEnabled ( bit ) 
    public void setLockoutenabled( Boolean lockoutenabled ) {
        this.lockoutenabled = lockoutenabled;
    }
    public Boolean getLockoutenabled() {
        return this.lockoutenabled;
    }

    //--- DATABASE MAPPING : LockoutEnd ( datetimeoffset ) 
    public void setLockoutend( String lockoutend ) {
        this.lockoutend = lockoutend;
    }
    public String getLockoutend() {
        return this.lockoutend;
    }

    //--- DATABASE MAPPING : NormalizedEmail ( nvarchar ) 
    public void setNormalizedemail( String normalizedemail ) {
        this.normalizedemail = normalizedemail;
    }
    public String getNormalizedemail() {
        return this.normalizedemail;
    }

    //--- DATABASE MAPPING : NormalizedUserName ( nvarchar ) 
    public void setNormalizedusername( String normalizedusername ) {
        this.normalizedusername = normalizedusername;
    }
    public String getNormalizedusername() {
        return this.normalizedusername;
    }

    //--- DATABASE MAPPING : PasswordHash ( nvarchar ) 
    public void setPasswordhash( String passwordhash ) {
        this.passwordhash = passwordhash;
    }
    public String getPasswordhash() {
        return this.passwordhash;
    }

    //--- DATABASE MAPPING : PhoneNumber ( nvarchar ) 
    public void setPhonenumber( String phonenumber ) {
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }

    //--- DATABASE MAPPING : PhoneNumberConfirmed ( bit ) 
    public void setPhonenumberconfirmed( Boolean phonenumberconfirmed ) {
        this.phonenumberconfirmed = phonenumberconfirmed;
    }
    public Boolean getPhonenumberconfirmed() {
        return this.phonenumberconfirmed;
    }

    //--- DATABASE MAPPING : SecurityStamp ( nvarchar ) 
    public void setSecuritystamp( String securitystamp ) {
        this.securitystamp = securitystamp;
    }
    public String getSecuritystamp() {
        return this.securitystamp;
    }

    //--- DATABASE MAPPING : TwoFactorEnabled ( bit ) 
    public void setTwofactorenabled( Boolean twofactorenabled ) {
        this.twofactorenabled = twofactorenabled;
    }
    public Boolean getTwofactorenabled() {
        return this.twofactorenabled;
    }

    //--- DATABASE MAPPING : UserName ( nvarchar ) 
    public void setUsername( String username ) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }

    //--- DATABASE MAPPING : Salt ( nvarchar ) 
    public void setSalt( String salt ) {
        this.salt = salt;
    }
    public String getSalt() {
        return this.salt;
    }

    //--- DATABASE MAPPING : Created ( datetime ) 
    public void setCreated( Date created ) {
        this.created = created;
    }
    public Date getCreated() {
        return this.created;
    }

    //--- DATABASE MAPPING : Ime ( nvarchar ) 
    public void setIme( String ime ) {
        this.ime = ime;
    }
    public String getIme() {
        return this.ime;
    }

    //--- DATABASE MAPPING : Prezime ( nvarchar ) 
    public void setPrezime( String prezime ) {
        this.prezime = prezime;
    }
    public String getPrezime() {
        return this.prezime;
    }

    //--- DATABASE MAPPING : Razina ( int ) 
    public void setRazina( Integer razina ) {
        this.razina = razina;
    }
    public Integer getRazina() {
        return this.razina;
    }

    //--- DATABASE MAPPING : Latitude ( float ) 
    public void setLatitude( Double latitude ) {
        this.latitude = latitude;
    }
    public Double getLatitude() {
        return this.latitude;
    }

    //--- DATABASE MAPPING : Longitude ( float ) 
    public void setLongitude( Double longitude ) {
        this.longitude = longitude;
    }
    public Double getLongitude() {
        return this.longitude;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfAkcijaspasavanje( List<AkcijaspasavanjeEntity> listOfAkcijaspasavanje ) {
        this.listOfAkcijaspasavanje = listOfAkcijaspasavanje;
    }
    public List<AkcijaspasavanjeEntity> getListOfAkcijaspasavanje() {
        return this.listOfAkcijaspasavanje;
    }

    public void setListOfDostupan( List<DostupanEntity> listOfDostupan ) {
        this.listOfDostupan = listOfDostupan;
    }
    public List<DostupanEntity> getListOfDostupan() {
        return this.listOfDostupan;
    }

    public void setListOfSudionici( List<SudioniciEntity> listOfSudionici ) {
        this.listOfSudionici = listOfSudionici;
    }
    public List<SudioniciEntity> getListOfSudionici() {
        return this.listOfSudionici;
    }

    public void setListOfNedostupan( List<NedostupanEntity> listOfNedostupan ) {
        this.listOfNedostupan = listOfNedostupan;
    }
    public List<NedostupanEntity> getListOfNedostupan() {
        return this.listOfNedostupan;
    }

    public void setListOfPoruka( List<PorukaEntity> listOfPoruka ) {
        this.listOfPoruka = listOfPoruka;
    }
    public List<PorukaEntity> getListOfPoruka() {
        return this.listOfPoruka;
    }

    public void setListOfAspnetuserclaims( List<AspnetuserclaimsEntity> listOfAspnetuserclaims ) {
        this.listOfAspnetuserclaims = listOfAspnetuserclaims;
    }
    public List<AspnetuserclaimsEntity> getListOfAspnetuserclaims() {
        return this.listOfAspnetuserclaims;
    }

    public void setListOfAspnetroles( List<AspnetrolesEntity> listOfAspnetroles ) {
        this.listOfAspnetroles = listOfAspnetroles;
    }
    public List<AspnetrolesEntity> getListOfAspnetroles() {
        return this.listOfAspnetroles;
    }

    public void setListOfPoruka2( List<PorukaEntity> listOfPoruka2 ) {
        this.listOfPoruka2 = listOfPoruka2;
    }
    public List<PorukaEntity> getListOfPoruka2() {
        return this.listOfPoruka2;
    }

    public void setListOfVjestinekorisnika( List<VjestinekorisnikaEntity> listOfVjestinekorisnika ) {
        this.listOfVjestinekorisnika = listOfVjestinekorisnika;
    }
    public List<VjestinekorisnikaEntity> getListOfVjestinekorisnika() {
        return this.listOfVjestinekorisnika;
    }

    public void setListOfSocketconnection( List<SocketconnectionEntity> listOfSocketconnection ) {
        this.listOfSocketconnection = listOfSocketconnection;
    }
    public List<SocketconnectionEntity> getListOfSocketconnection() {
        return this.listOfSocketconnection;
    }

    public void setListOfAspnetuserlogins( List<AspnetuserloginsEntity> listOfAspnetuserlogins ) {
        this.listOfAspnetuserlogins = listOfAspnetuserlogins;
    }
    public List<AspnetuserloginsEntity> getListOfAspnetuserlogins() {
        return this.listOfAspnetuserlogins;
    }

    public void setListOfSocket( List<SocketEntity> listOfSocket ) {
        this.listOfSocket = listOfSocket;
    }
    public List<SocketEntity> getListOfSocket() {
        return this.listOfSocket;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(accessfailedcount);
        sb.append("|");
        sb.append(concurrencystamp);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(emailconfirmed);
        sb.append("|");
        sb.append(lockoutenabled);
        sb.append("|");
        sb.append(lockoutend);
        sb.append("|");
        sb.append(normalizedemail);
        sb.append("|");
        sb.append(normalizedusername);
        sb.append("|");
        sb.append(passwordhash);
        sb.append("|");
        sb.append(phonenumber);
        sb.append("|");
        sb.append(phonenumberconfirmed);
        sb.append("|");
        sb.append(securitystamp);
        sb.append("|");
        sb.append(twofactorenabled);
        sb.append("|");
        sb.append(username);
        sb.append("|");
        sb.append(salt);
        sb.append("|");
        sb.append(created);
        sb.append("|");
        sb.append(ime);
        sb.append("|");
        sb.append(prezime);
        sb.append("|");
        sb.append(razina);
        sb.append("|");
        sb.append(latitude);
        sb.append("|");
        sb.append(longitude);
        return sb.toString(); 
    } 

}
