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
 * Payment card
 * 
 * <p>Classe Java per DT_PaymentCardSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PaymentCardSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="CashCardGuid" type="{http://volkswagen.de/xi/kuba/KISS}DT_Guid32" minOccurs="0"/>
 *         &lt;element name="CashCardId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CashCardInstitute" type="{http://volkswagen.de/xi/kuba/KISS}DT_CashCardInstitute" minOccurs="0"/>
 *         &lt;element name="CashCardNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsStandardCashCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CashCardAccountName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaskNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CashCardHolder" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CashCardIssueBank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CashCardIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PaymentCardSP", propOrder = {
    "method",
    "cashCardGuid",
    "cashCardId",
    "cashCardInstitute",
    "cashCardNumber",
    "isStandardCashCard",
    "cashCardAccountName",
    "validTo",
    "validFrom",
    "maskNo",
    "cashCardHolder",
    "cashCardIssueBank",
    "cashCardIssueDate"
})
public class DTPaymentCardSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "CashCardGuid")
    protected String cashCardGuid;
    @XmlElement(name = "CashCardId")
    protected String cashCardId;
    @XmlElement(name = "CashCardInstitute")
    protected String cashCardInstitute;
    @XmlElement(name = "CashCardNumber")
    protected String cashCardNumber;
    @XmlElement(name = "IsStandardCashCard")
    protected Boolean isStandardCashCard;
    @XmlElement(name = "CashCardAccountName")
    protected String cashCardAccountName;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "MaskNo")
    protected String maskNo;
    @XmlElement(name = "CashCardHolder")
    protected String cashCardHolder;
    @XmlElement(name = "CashCardIssueBank")
    protected String cashCardIssueBank;
    @XmlElement(name = "CashCardIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cashCardIssueDate;

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
     * Recupera il valore della proprietà cashCardGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardGuid() {
        return cashCardGuid;
    }

    /**
     * Imposta il valore della proprietà cashCardGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardGuid(String value) {
        this.cashCardGuid = value;
    }

    /**
     * Recupera il valore della proprietà cashCardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardId() {
        return cashCardId;
    }

    /**
     * Imposta il valore della proprietà cashCardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardId(String value) {
        this.cashCardId = value;
    }

    /**
     * Recupera il valore della proprietà cashCardInstitute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardInstitute() {
        return cashCardInstitute;
    }

    /**
     * Imposta il valore della proprietà cashCardInstitute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardInstitute(String value) {
        this.cashCardInstitute = value;
    }

    /**
     * Recupera il valore della proprietà cashCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardNumber() {
        return cashCardNumber;
    }

    /**
     * Imposta il valore della proprietà cashCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardNumber(String value) {
        this.cashCardNumber = value;
    }

    /**
     * Recupera il valore della proprietà isStandardCashCard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandardCashCard() {
        return isStandardCashCard;
    }

    /**
     * Imposta il valore della proprietà isStandardCashCard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandardCashCard(Boolean value) {
        this.isStandardCashCard = value;
    }

    /**
     * Recupera il valore della proprietà cashCardAccountName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardAccountName() {
        return cashCardAccountName;
    }

    /**
     * Imposta il valore della proprietà cashCardAccountName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardAccountName(String value) {
        this.cashCardAccountName = value;
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
     * Recupera il valore della proprietà maskNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskNo() {
        return maskNo;
    }

    /**
     * Imposta il valore della proprietà maskNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskNo(String value) {
        this.maskNo = value;
    }

    /**
     * Recupera il valore della proprietà cashCardHolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardHolder() {
        return cashCardHolder;
    }

    /**
     * Imposta il valore della proprietà cashCardHolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardHolder(String value) {
        this.cashCardHolder = value;
    }

    /**
     * Recupera il valore della proprietà cashCardIssueBank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardIssueBank() {
        return cashCardIssueBank;
    }

    /**
     * Imposta il valore della proprietà cashCardIssueBank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardIssueBank(String value) {
        this.cashCardIssueBank = value;
    }

    /**
     * Recupera il valore della proprietà cashCardIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCashCardIssueDate() {
        return cashCardIssueDate;
    }

    /**
     * Imposta il valore della proprietà cashCardIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCashCardIssueDate(XMLGregorianCalendar value) {
        this.cashCardIssueDate = value;
    }

}
