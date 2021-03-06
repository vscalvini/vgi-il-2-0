//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vehicle partner data
 * 
 * <p>Classe Java per DT_VehiclePartner complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehiclePartner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="RefPartnerHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="PartnerFunction" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerFunction" minOccurs="0"/>
 *         &lt;element name="PartnerNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchemeID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplayType" type="{http://volkswagen.de/xi/kuba/KISS}DT_DisplayType" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_VehiclePartner", propOrder = {
    "method",
    "refPartnerHandle",
    "partnerFunction",
    "partnerNumber",
    "schemeID",
    "displayType",
    "validFrom",
    "validTo"
})
public class DTVehiclePartner {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "RefPartnerHandle")
    protected String refPartnerHandle;
    @XmlElement(name = "PartnerFunction")
    protected String partnerFunction;
    @XmlElement(name = "PartnerNumber")
    protected String partnerNumber;
    @XmlElement(name = "SchemeID")
    protected String schemeID;
    @XmlElement(name = "DisplayType")
    protected String displayType;
    @XmlElement(name = "ValidFrom")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    protected XMLGregorianCalendar validTo;

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
     * Recupera il valore della proprietà refPartnerHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPartnerHandle() {
        return refPartnerHandle;
    }

    /**
     * Imposta il valore della proprietà refPartnerHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPartnerHandle(String value) {
        this.refPartnerHandle = value;
    }

    /**
     * Recupera il valore della proprietà partnerFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerFunction() {
        return partnerFunction;
    }

    /**
     * Imposta il valore della proprietà partnerFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerFunction(String value) {
        this.partnerFunction = value;
    }

    /**
     * Recupera il valore della proprietà partnerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNumber() {
        return partnerNumber;
    }

    /**
     * Imposta il valore della proprietà partnerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNumber(String value) {
        this.partnerNumber = value;
    }

    /**
     * Recupera il valore della proprietà schemeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Imposta il valore della proprietà schemeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Recupera il valore della proprietà displayType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Imposta il valore della proprietà displayType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
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
