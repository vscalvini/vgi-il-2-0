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
 * Identification of business partners
 * 
 * <p>Classe Java per DT_Identification complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="IdentType" type="{http://volkswagen.de/xi/kuba/KISS}DT_IdentificationType" minOccurs="0"/>
 *         &lt;element name="IdentNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentInstitute" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IdentValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IdentValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CountryISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APlusCard" type="{http://volkswagen.de/xi/kuba/KISS}DT_APlusCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Identification", propOrder = {
    "method",
    "identType",
    "identNo",
    "identInstitute",
    "identEntryDate",
    "identValidFrom",
    "identValidTo",
    "countryISO",
    "region",
    "aPlusCard"
})
public class DTIdentification {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "IdentType")
    protected String identType;
    @XmlElement(name = "IdentNo")
    protected String identNo;
    @XmlElement(name = "IdentInstitute")
    protected String identInstitute;
    @XmlElement(name = "IdentEntryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar identEntryDate;
    @XmlElement(name = "IdentValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar identValidFrom;
    @XmlElement(name = "IdentValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar identValidTo;
    @XmlElement(name = "CountryISO")
    protected String countryISO;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "APlusCard")
    protected DTAPlusCard aPlusCard;

    /**
     * Recupera il valore della proprietà method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Imposta il valore della proprietà method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Recupera il valore della proprietà identType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentType() {
        return identType;
    }

    /**
     * Imposta il valore della proprietà identType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentType(String value) {
        this.identType = value;
    }

    /**
     * Recupera il valore della proprietà identNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentNo() {
        return identNo;
    }

    /**
     * Imposta il valore della proprietà identNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentNo(String value) {
        this.identNo = value;
    }

    /**
     * Recupera il valore della proprietà identInstitute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentInstitute() {
        return identInstitute;
    }

    /**
     * Imposta il valore della proprietà identInstitute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentInstitute(String value) {
        this.identInstitute = value;
    }

    /**
     * Recupera il valore della proprietà identEntryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentEntryDate() {
        return identEntryDate;
    }

    /**
     * Imposta il valore della proprietà identEntryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentEntryDate(XMLGregorianCalendar value) {
        this.identEntryDate = value;
    }

    /**
     * Recupera il valore della proprietà identValidFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentValidFrom() {
        return identValidFrom;
    }

    /**
     * Imposta il valore della proprietà identValidFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentValidFrom(XMLGregorianCalendar value) {
        this.identValidFrom = value;
    }

    /**
     * Recupera il valore della proprietà identValidTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentValidTo() {
        return identValidTo;
    }

    /**
     * Imposta il valore della proprietà identValidTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentValidTo(XMLGregorianCalendar value) {
        this.identValidTo = value;
    }

    /**
     * Recupera il valore della proprietà countryISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO() {
        return countryISO;
    }

    /**
     * Imposta il valore della proprietà countryISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO(String value) {
        this.countryISO = value;
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
     * Recupera il valore della proprietà aPlusCard.
     * 
     * @return
     *     possible object is
     *     {@link DTAPlusCard }
     *     
     */
    public DTAPlusCard getAPlusCard() {
        return aPlusCard;
    }

    /**
     * Imposta il valore della proprietà aPlusCard.
     * 
     * @param value
     *     allowed object is
     *     {@link DTAPlusCard }
     *     
     */
    public void setAPlusCard(DTAPlusCard value) {
        this.aPlusCard = value;
    }

}
