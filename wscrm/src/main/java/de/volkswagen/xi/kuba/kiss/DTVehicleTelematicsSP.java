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
 * Vehicle telematic data
 * 
 * <p>Classe Java per DT_VehicleTelematicsSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleTelematicsSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="TelematicType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NavigationUnitType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeyId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecureCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ICCId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSISDN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Provider" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommunicationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EDNationality" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_VehicleTelematicsSP", propOrder = {
    "method",
    "telematicType",
    "navigationUnitType",
    "ops",
    "keyId",
    "imei",
    "secureCode",
    "iccId",
    "msisdn",
    "provider",
    "communicationType",
    "edNationality"
})
public class DTVehicleTelematicsSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "TelematicType")
    protected String telematicType;
    @XmlElement(name = "NavigationUnitType")
    protected String navigationUnitType;
    @XmlElement(name = "OPS")
    protected Boolean ops;
    @XmlElement(name = "KeyId")
    protected String keyId;
    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "SecureCode")
    protected String secureCode;
    @XmlElement(name = "ICCId")
    protected String iccId;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "Provider")
    protected String provider;
    @XmlElement(name = "CommunicationType")
    protected String communicationType;
    @XmlElement(name = "EDNationality")
    protected String edNationality;

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
     * Recupera il valore della proprietà telematicType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelematicType() {
        return telematicType;
    }

    /**
     * Imposta il valore della proprietà telematicType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelematicType(String value) {
        this.telematicType = value;
    }

    /**
     * Recupera il valore della proprietà navigationUnitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigationUnitType() {
        return navigationUnitType;
    }

    /**
     * Imposta il valore della proprietà navigationUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigationUnitType(String value) {
        this.navigationUnitType = value;
    }

    /**
     * Recupera il valore della proprietà ops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOPS() {
        return ops;
    }

    /**
     * Imposta il valore della proprietà ops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOPS(Boolean value) {
        this.ops = value;
    }

    /**
     * Recupera il valore della proprietà keyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Imposta il valore della proprietà keyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Recupera il valore della proprietà imei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Imposta il valore della proprietà imei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Recupera il valore della proprietà secureCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCode() {
        return secureCode;
    }

    /**
     * Imposta il valore della proprietà secureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCode(String value) {
        this.secureCode = value;
    }

    /**
     * Recupera il valore della proprietà iccId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCId() {
        return iccId;
    }

    /**
     * Imposta il valore della proprietà iccId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCId(String value) {
        this.iccId = value;
    }

    /**
     * Recupera il valore della proprietà msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Imposta il valore della proprietà msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Recupera il valore della proprietà provider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Imposta il valore della proprietà provider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
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
     * Recupera il valore della proprietà edNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDNationality() {
        return edNationality;
    }

    /**
     * Imposta il valore della proprietà edNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDNationality(String value) {
        this.edNationality = value;
    }

}
