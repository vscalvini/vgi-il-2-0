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
 * Banking arrangement of a business partner
 * 
 * <p>Classe Java per DT_BankingArrangementSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BankingArrangementSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="BankCountryISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="BankKey" type="{http://volkswagen.de/xi/kuba/KISS}DT_BankNo" minOccurs="0"/>
 *         &lt;element name="BankAddress" type="{http://volkswagen.de/xi/kuba/KISS}DT_BankAddressSP" minOccurs="0"/>
 *         &lt;element name="AccountNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ControlKey" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountHolder" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CollectionAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalBankId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAccountName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IBAN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IBANFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BankingArrangementSP", propOrder = {
    "method",
    "bankCountryISO",
    "bankKey",
    "bankAddress",
    "accountNo",
    "controlKey",
    "bankReference",
    "accountHolder",
    "collectionAuthorization",
    "externalBankId",
    "bankAccountName",
    "iban",
    "ibanFromDate"
})
public class DTBankingArrangementSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "BankCountryISO")
    protected String bankCountryISO;
    @XmlElement(name = "BankKey")
    protected String bankKey;
    @XmlElement(name = "BankAddress")
    protected DTBankAddressSP bankAddress;
    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "ControlKey")
    protected String controlKey;
    @XmlElement(name = "BankReference")
    protected String bankReference;
    @XmlElement(name = "AccountHolder")
    protected String accountHolder;
    @XmlElement(name = "CollectionAuthorization")
    protected Boolean collectionAuthorization;
    @XmlElement(name = "ExternalBankId")
    protected String externalBankId;
    @XmlElement(name = "BankAccountName")
    protected String bankAccountName;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "IBANFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ibanFromDate;

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
     * Recupera il valore della proprietà bankCountryISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryISO() {
        return bankCountryISO;
    }

    /**
     * Imposta il valore della proprietà bankCountryISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryISO(String value) {
        this.bankCountryISO = value;
    }

    /**
     * Recupera il valore della proprietà bankKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * Imposta il valore della proprietà bankKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankKey(String value) {
        this.bankKey = value;
    }

    /**
     * Recupera il valore della proprietà bankAddress.
     * 
     * @return
     *     possible object is
     *     {@link DTBankAddressSP }
     *     
     */
    public DTBankAddressSP getBankAddress() {
        return bankAddress;
    }

    /**
     * Imposta il valore della proprietà bankAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBankAddressSP }
     *     
     */
    public void setBankAddress(DTBankAddressSP value) {
        this.bankAddress = value;
    }

    /**
     * Recupera il valore della proprietà accountNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Imposta il valore della proprietà accountNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Recupera il valore della proprietà controlKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlKey() {
        return controlKey;
    }

    /**
     * Imposta il valore della proprietà controlKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlKey(String value) {
        this.controlKey = value;
    }

    /**
     * Recupera il valore della proprietà bankReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReference() {
        return bankReference;
    }

    /**
     * Imposta il valore della proprietà bankReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReference(String value) {
        this.bankReference = value;
    }

    /**
     * Recupera il valore della proprietà accountHolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Imposta il valore della proprietà accountHolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolder(String value) {
        this.accountHolder = value;
    }

    /**
     * Recupera il valore della proprietà collectionAuthorization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionAuthorization() {
        return collectionAuthorization;
    }

    /**
     * Imposta il valore della proprietà collectionAuthorization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionAuthorization(Boolean value) {
        this.collectionAuthorization = value;
    }

    /**
     * Recupera il valore della proprietà externalBankId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBankId() {
        return externalBankId;
    }

    /**
     * Imposta il valore della proprietà externalBankId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBankId(String value) {
        this.externalBankId = value;
    }

    /**
     * Recupera il valore della proprietà bankAccountName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Imposta il valore della proprietà bankAccountName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietà ibanFromDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIBANFromDate() {
        return ibanFromDate;
    }

    /**
     * Imposta il valore della proprietà ibanFromDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIBANFromDate(XMLGregorianCalendar value) {
        this.ibanFromDate = value;
    }

}
