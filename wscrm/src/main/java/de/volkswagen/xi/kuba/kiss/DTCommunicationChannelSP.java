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
 * Communication channel
 * 
 * <p>Classe Java per DT_CommunicationChannelSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_CommunicationChannelSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="CommunicationChannelId" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationChannelId" minOccurs="0"/>
 *         &lt;element name="AddressNo" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressNoFramework" minOccurs="0"/>
 *         &lt;element name="CommunicationType" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationType" minOccurs="0"/>
 *         &lt;element name="Value" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="241"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Extension" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remark" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="DefaultReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="R3User" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="X"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StandardInType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomeAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_CommunicationChannelSP", propOrder = {
    "method",
    "communicationChannelId",
    "addressNo",
    "communicationType",
    "value",
    "extension",
    "remark",
    "countryISO",
    "defaultReceiver",
    "r3User",
    "standardInType",
    "noUse",
    "homeAddress"
})
public class DTCommunicationChannelSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "CommunicationChannelId")
    protected DTCommunicationChannelId communicationChannelId;
    @XmlElement(name = "AddressNo")
    protected String addressNo;
    @XmlElement(name = "CommunicationType")
    protected String communicationType;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "CountryISO")
    protected String countryISO;
    @XmlElement(name = "DefaultReceiver")
    protected Boolean defaultReceiver;
    @XmlElement(name = "R3User")
    protected String r3User;
    @XmlElement(name = "StandardInType")
    protected Boolean standardInType;
    @XmlElement(name = "NoUse")
    protected Boolean noUse;
    @XmlElement(name = "HomeAddress")
    protected Boolean homeAddress;

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
     * Recupera il valore della proprietà communicationChannelId.
     * 
     * @return
     *     possible object is
     *     {@link DTCommunicationChannelId }
     *     
     */
    public DTCommunicationChannelId getCommunicationChannelId() {
        return communicationChannelId;
    }

    /**
     * Imposta il valore della proprietà communicationChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCommunicationChannelId }
     *     
     */
    public void setCommunicationChannelId(DTCommunicationChannelId value) {
        this.communicationChannelId = value;
    }

    /**
     * Recupera il valore della proprietà addressNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * Imposta il valore della proprietà addressNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNo(String value) {
        this.addressNo = value;
    }

    /**
     * Recupera il valore della proprietà communicationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationType() {
        return communicationType;
    }

    /**
     * Imposta il valore della proprietà communicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationType(String value) {
        this.communicationType = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Imposta il valore della proprietà remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     * Recupera il valore della proprietà defaultReceiver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultReceiver() {
        return defaultReceiver;
    }

    /**
     * Imposta il valore della proprietà defaultReceiver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultReceiver(Boolean value) {
        this.defaultReceiver = value;
    }

    /**
     * Recupera il valore della proprietà r3User.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR3User() {
        return r3User;
    }

    /**
     * Imposta il valore della proprietà r3User.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR3User(String value) {
        this.r3User = value;
    }

    /**
     * Recupera il valore della proprietà standardInType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardInType() {
        return standardInType;
    }

    /**
     * Imposta il valore della proprietà standardInType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardInType(Boolean value) {
        this.standardInType = value;
    }

    /**
     * Recupera il valore della proprietà noUse.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoUse() {
        return noUse;
    }

    /**
     * Imposta il valore della proprietà noUse.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoUse(Boolean value) {
        this.noUse = value;
    }

    /**
     * Recupera il valore della proprietà homeAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomeAddress() {
        return homeAddress;
    }

    /**
     * Imposta il valore della proprietà homeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomeAddress(Boolean value) {
        this.homeAddress = value;
    }

}
