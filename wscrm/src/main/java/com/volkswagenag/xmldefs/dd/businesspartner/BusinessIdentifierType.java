//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package com.volkswagenag.xmldefs.dd.businesspartner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.volkswagenag.xmldefs.dd.basictypes.CodeType;
import com.volkswagenag.xmldefs.dd.basictypes.CountryCodeType;


/**
 * <p>Classe Java per BusinessIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierType" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateType" minOccurs="0"/>
 *         &lt;element name="Authority" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *         &lt;element name="City" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateType" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessIdentifierType", propOrder = {
    "identifierType",
    "identifier",
    "entryDate",
    "authority",
    "country",
    "region",
    "city",
    "validFrom",
    "validTo"
})
public class BusinessIdentifierType {

    @XmlElement(name = "IdentifierType")
    protected CodeType identifierType;
    @XmlElement(name = "Identifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identifier;
    @XmlElement(name = "EntryDate")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "Authority")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String authority;
    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "Region")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String region;
    @XmlElement(name = "City")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String city;
    @XmlElement(name = "ValidFrom")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    protected XMLGregorianCalendar validTo;

    /**
     * Recupera il valore della proprietà identifierType.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIdentifierType() {
        return identifierType;
    }

    /**
     * Imposta il valore della proprietà identifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIdentifierType(CodeType value) {
        this.identifierType = value;
    }

    /**
     * Recupera il valore della proprietà identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Imposta il valore della proprietà identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Recupera il valore della proprietà entryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Imposta il valore della proprietà entryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Recupera il valore della proprietà authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Imposta il valore della proprietà authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Imposta il valore della proprietà region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà validFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Imposta il valore della proprietà validFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Recupera il valore della proprietà validTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Imposta il valore della proprietà validTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

}
