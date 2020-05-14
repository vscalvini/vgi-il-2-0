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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Business object 'control data'
 * 
 * <p>Classe Java per BO_ControlDataSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BO_ControlDataSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="Sender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Receiver" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Brand" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Market" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SysCommunicationLanguage" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage" minOccurs="0"/>
 *         &lt;element name="LastChangedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastChangedTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="LastChangedBy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
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
@XmlType(name = "BO_ControlDataSP", propOrder = {
    "referenceHandle",
    "sender",
    "receiver",
    "brand",
    "market",
    "sysCommunicationLanguage",
    "lastChangedDate",
    "lastChangedTime",
    "lastChangedBy"
})
public class BOControlDataSP {

    @XmlElement(name = "ReferenceHandle")
    protected String referenceHandle;
    @XmlElement(name = "Sender")
    protected String sender;
    @XmlElement(name = "Receiver")
    protected String receiver;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "SysCommunicationLanguage")
    protected String sysCommunicationLanguage;
    @XmlElement(name = "LastChangedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangedDate;
    @XmlElement(name = "LastChangedTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastChangedTime;
    @XmlElement(name = "LastChangedBy")
    protected String lastChangedBy;

    /**
     * Recupera il valore della proprietà referenceHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceHandle() {
        return referenceHandle;
    }

    /**
     * Imposta il valore della proprietà referenceHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceHandle(String value) {
        this.referenceHandle = value;
    }

    /**
     * Recupera il valore della proprietà sender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Imposta il valore della proprietà sender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Recupera il valore della proprietà receiver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Imposta il valore della proprietà receiver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Recupera il valore della proprietà brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Imposta il valore della proprietà brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Recupera il valore della proprietà market.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Imposta il valore della proprietà market.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Recupera il valore della proprietà sysCommunicationLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCommunicationLanguage() {
        return sysCommunicationLanguage;
    }

    /**
     * Imposta il valore della proprietà sysCommunicationLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCommunicationLanguage(String value) {
        this.sysCommunicationLanguage = value;
    }

    /**
     * Recupera il valore della proprietà lastChangedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Imposta il valore della proprietà lastChangedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangedDate(XMLGregorianCalendar value) {
        this.lastChangedDate = value;
    }

    /**
     * Recupera il valore della proprietà lastChangedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangedTime() {
        return lastChangedTime;
    }

    /**
     * Imposta il valore della proprietà lastChangedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangedTime(XMLGregorianCalendar value) {
        this.lastChangedTime = value;
    }

    /**
     * Recupera il valore della proprietà lastChangedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangedBy() {
        return lastChangedBy;
    }

    /**
     * Imposta il valore della proprietà lastChangedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedBy(String value) {
        this.lastChangedBy = value;
    }

}
