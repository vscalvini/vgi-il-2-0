//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Person data of a business partner
 * 
 * <p>Classe Java per DT_PartnerPersonSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PartnerPersonSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BirthName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecondName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TitleAcademic1" type="{http://volkswagen.de/xi/kuba/KISS}DT_TitleAcademic" minOccurs="0"/>
 *         &lt;element name="TitleAcademic2" type="{http://volkswagen.de/xi/kuba/KISS}DT_TitleAcademic" minOccurs="0"/>
 *         &lt;element name="TitleSupplement" type="{http://volkswagen.de/xi/kuba/KISS}DT_TitleSupplement" minOccurs="0"/>
 *         &lt;element name="Prefix1" type="{http://volkswagen.de/xi/kuba/KISS}DT_Prefix" minOccurs="0"/>
 *         &lt;element name="Prefix2" type="{http://volkswagen.de/xi/kuba/KISS}DT_Prefix" minOccurs="0"/>
 *         &lt;element name="NickName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Initials" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameFormat" type="{http://volkswagen.de/xi/kuba/KISS}DT_NameFormat" minOccurs="0"/>
 *         &lt;element name="NameCountryISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://volkswagen.de/xi/kuba/KISS}DT_Sex" minOccurs="0"/>
 *         &lt;element name="BirthPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://volkswagen.de/xi/kuba/KISS}DT_MaritalStatus" minOccurs="0"/>
 *         &lt;element name="CorrespondLanguageISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage" minOccurs="0"/>
 *         &lt;element name="FullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Employer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Occupation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NationalityISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="CountryOrigin" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="Job" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocalTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PartnerPersonSP", propOrder = {
    "firstName",
    "lastName",
    "birthName",
    "middleName",
    "secondName",
    "titleAcademic1",
    "titleAcademic2",
    "titleSupplement",
    "prefix1",
    "prefix2",
    "nickName",
    "initials",
    "nameFormat",
    "nameCountryISO",
    "sex",
    "birthPlace",
    "birthDate",
    "deathDate",
    "maritalStatus",
    "correspondLanguageISO",
    "fullName",
    "employer",
    "occupation",
    "nationalityISO",
    "countryOrigin",
    "job",
    "localTitle"
})
public class DTPartnerPersonSP {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "SecondName")
    protected String secondName;
    @XmlElement(name = "TitleAcademic1")
    protected String titleAcademic1;
    @XmlElement(name = "TitleAcademic2")
    protected String titleAcademic2;
    @XmlElement(name = "TitleSupplement")
    protected String titleSupplement;
    @XmlElement(name = "Prefix1")
    protected String prefix1;
    @XmlElement(name = "Prefix2")
    protected String prefix2;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "NameFormat")
    protected String nameFormat;
    @XmlElement(name = "NameCountryISO")
    protected String nameCountryISO;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "DeathDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deathDate;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "CorrespondLanguageISO")
    protected String correspondLanguageISO;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "Employer")
    protected String employer;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "NationalityISO")
    protected String nationalityISO;
    @XmlElement(name = "CountryOrigin")
    protected String countryOrigin;
    @XmlElement(name = "Job")
    protected String job;
    @XmlElement(name = "LocalTitle")
    protected String localTitle;

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Recupera il valore della proprietà lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Imposta il valore della proprietà lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Recupera il valore della proprietà birthName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Imposta il valore della proprietà birthName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * Recupera il valore della proprietà middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Imposta il valore della proprietà middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Recupera il valore della proprietà secondName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Imposta il valore della proprietà secondName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Recupera il valore della proprietà titleAcademic1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAcademic1() {
        return titleAcademic1;
    }

    /**
     * Imposta il valore della proprietà titleAcademic1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAcademic1(String value) {
        this.titleAcademic1 = value;
    }

    /**
     * Recupera il valore della proprietà titleAcademic2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAcademic2() {
        return titleAcademic2;
    }

    /**
     * Imposta il valore della proprietà titleAcademic2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAcademic2(String value) {
        this.titleAcademic2 = value;
    }

    /**
     * Recupera il valore della proprietà titleSupplement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleSupplement() {
        return titleSupplement;
    }

    /**
     * Imposta il valore della proprietà titleSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleSupplement(String value) {
        this.titleSupplement = value;
    }

    /**
     * Recupera il valore della proprietà prefix1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix1() {
        return prefix1;
    }

    /**
     * Imposta il valore della proprietà prefix1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix1(String value) {
        this.prefix1 = value;
    }

    /**
     * Recupera il valore della proprietà prefix2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix2() {
        return prefix2;
    }

    /**
     * Imposta il valore della proprietà prefix2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix2(String value) {
        this.prefix2 = value;
    }

    /**
     * Recupera il valore della proprietà nickName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Imposta il valore della proprietà nickName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Recupera il valore della proprietà initials.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Imposta il valore della proprietà initials.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Recupera il valore della proprietà nameFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormat() {
        return nameFormat;
    }

    /**
     * Imposta il valore della proprietà nameFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormat(String value) {
        this.nameFormat = value;
    }

    /**
     * Recupera il valore della proprietà nameCountryISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCountryISO() {
        return nameCountryISO;
    }

    /**
     * Imposta il valore della proprietà nameCountryISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCountryISO(String value) {
        this.nameCountryISO = value;
    }

    /**
     * Recupera il valore della proprietà sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Imposta il valore della proprietà sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Recupera il valore della proprietà birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Imposta il valore della proprietà birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Recupera il valore della proprietà deathDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * Imposta il valore della proprietà deathDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDate(XMLGregorianCalendar value) {
        this.deathDate = value;
    }

    /**
     * Recupera il valore della proprietà maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Imposta il valore della proprietà maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Recupera il valore della proprietà correspondLanguageISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondLanguageISO() {
        return correspondLanguageISO;
    }

    /**
     * Imposta il valore della proprietà correspondLanguageISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondLanguageISO(String value) {
        this.correspondLanguageISO = value;
    }

    /**
     * Recupera il valore della proprietà fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Imposta il valore della proprietà fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Recupera il valore della proprietà employer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Imposta il valore della proprietà employer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployer(String value) {
        this.employer = value;
    }

    /**
     * Recupera il valore della proprietà occupation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Imposta il valore della proprietà occupation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Recupera il valore della proprietà nationalityISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityISO() {
        return nationalityISO;
    }

    /**
     * Imposta il valore della proprietà nationalityISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityISO(String value) {
        this.nationalityISO = value;
    }

    /**
     * Recupera il valore della proprietà countryOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /**
     * Imposta il valore della proprietà countryOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOrigin(String value) {
        this.countryOrigin = value;
    }

    /**
     * Recupera il valore della proprietà job.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * Imposta il valore della proprietà job.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * Recupera il valore della proprietà localTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTitle() {
        return localTitle;
    }

    /**
     * Imposta il valore della proprietà localTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTitle(String value) {
        this.localTitle = value;
    }

}
