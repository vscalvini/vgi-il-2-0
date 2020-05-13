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


/**
 * Vehicle trader attributes
 * 
 * <p>Classe Java per DT_VehicleTraderAttributes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleTraderAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="Merchant" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactPerson" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneContactPerson" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesPersonNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesPersonLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesPersonFirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
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
@XmlType(name = "DT_VehicleTraderAttributes", propOrder = {
    "method",
    "merchant",
    "contactPerson",
    "phoneContactPerson",
    "salesPersonNumber",
    "salesPersonLastName",
    "salesPersonFirstName"
})
public class DTVehicleTraderAttributes {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "Merchant")
    protected String merchant;
    @XmlElement(name = "ContactPerson")
    protected String contactPerson;
    @XmlElement(name = "PhoneContactPerson")
    protected String phoneContactPerson;
    @XmlElement(name = "SalesPersonNumber")
    protected String salesPersonNumber;
    @XmlElement(name = "SalesPersonLastName")
    protected String salesPersonLastName;
    @XmlElement(name = "SalesPersonFirstName")
    protected String salesPersonFirstName;

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
     * Recupera il valore della proprietà merchant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Imposta il valore della proprietà merchant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Recupera il valore della proprietà contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Imposta il valore della proprietà contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Recupera il valore della proprietà phoneContactPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneContactPerson() {
        return phoneContactPerson;
    }

    /**
     * Imposta il valore della proprietà phoneContactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneContactPerson(String value) {
        this.phoneContactPerson = value;
    }

    /**
     * Recupera il valore della proprietà salesPersonNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPersonNumber() {
        return salesPersonNumber;
    }

    /**
     * Imposta il valore della proprietà salesPersonNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPersonNumber(String value) {
        this.salesPersonNumber = value;
    }

    /**
     * Recupera il valore della proprietà salesPersonLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPersonLastName() {
        return salesPersonLastName;
    }

    /**
     * Imposta il valore della proprietà salesPersonLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPersonLastName(String value) {
        this.salesPersonLastName = value;
    }

    /**
     * Recupera il valore della proprietà salesPersonFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPersonFirstName() {
        return salesPersonFirstName;
    }

    /**
     * Imposta il valore della proprietà salesPersonFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPersonFirstName(String value) {
        this.salesPersonFirstName = value;
    }

}
