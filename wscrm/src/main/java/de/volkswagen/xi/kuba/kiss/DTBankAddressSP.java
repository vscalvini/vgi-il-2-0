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
 * Address of a bank
 * 
 * <p>Classe Java per DT_BankAddressSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BankAddressSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="City" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SWIFTCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POBankCurrentAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankNo" type="{http://volkswagen.de/xi/kuba/KISS}DT_BankNo" minOccurs="0"/>
 *         &lt;element name="PostCheckNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankBranch" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "DT_BankAddressSP", propOrder = {
    "bankName",
    "region",
    "street",
    "city",
    "swiftCode",
    "bankGroup",
    "poBankCurrentAccount",
    "bankNo",
    "postCheckNo",
    "bankBranch",
    "addressNo"
})
public class DTBankAddressSP {

    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "SWIFTCode")
    protected String swiftCode;
    @XmlElement(name = "BankGroup")
    protected String bankGroup;
    @XmlElement(name = "POBankCurrentAccount")
    protected Boolean poBankCurrentAccount;
    @XmlElement(name = "BankNo")
    protected String bankNo;
    @XmlElement(name = "PostCheckNo")
    protected String postCheckNo;
    @XmlElement(name = "BankBranch")
    protected String bankBranch;
    @XmlElement(name = "AddressNo")
    protected String addressNo;

    /**
     * Recupera il valore della proprietà bankName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Imposta il valore della proprietà bankName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
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
     * Recupera il valore della proprietà street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietà street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Recupera il valore della proprietà swiftCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTCode() {
        return swiftCode;
    }

    /**
     * Imposta il valore della proprietà swiftCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTCode(String value) {
        this.swiftCode = value;
    }

    /**
     * Recupera il valore della proprietà bankGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankGroup() {
        return bankGroup;
    }

    /**
     * Imposta il valore della proprietà bankGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankGroup(String value) {
        this.bankGroup = value;
    }

    /**
     * Recupera il valore della proprietà poBankCurrentAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOBankCurrentAccount() {
        return poBankCurrentAccount;
    }

    /**
     * Imposta il valore della proprietà poBankCurrentAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOBankCurrentAccount(Boolean value) {
        this.poBankCurrentAccount = value;
    }

    /**
     * Recupera il valore della proprietà bankNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * Imposta il valore della proprietà bankNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

    /**
     * Recupera il valore della proprietà postCheckNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCheckNo() {
        return postCheckNo;
    }

    /**
     * Imposta il valore della proprietà postCheckNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCheckNo(String value) {
        this.postCheckNo = value;
    }

    /**
     * Recupera il valore della proprietà bankBranch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Imposta il valore della proprietà bankBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
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

}
