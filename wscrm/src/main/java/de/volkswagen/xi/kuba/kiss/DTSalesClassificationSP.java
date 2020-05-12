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
 * Sales classification data
 * 
 * <p>Classe Java per DT_SalesClassificationSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_SalesClassificationSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCompetitor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsProspekt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerSince" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsCODCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://volkswagen.de/xi/kuba/KISS}DT_Industry" minOccurs="0"/>
 *         &lt;element name="IsRented" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NielsenId" type="{http://volkswagen.de/xi/kuba/KISS}DT_NielsenId" minOccurs="0"/>
 *         &lt;element name="CustomerClassification" type="{http://volkswagen.de/xi/kuba/KISS}DT_CustomerClassification" minOccurs="0"/>
 *         &lt;element name="Attribute" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attribute10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "DT_SalesClassificationSP", propOrder = {
    "isCompetitor",
    "isProspekt",
    "isConsumer",
    "isCustomer",
    "customerSince",
    "isCODCustomer",
    "industry",
    "isRented",
    "accountGroup",
    "nielsenId",
    "customerClassification",
    "attribute",
    "attribute2",
    "attribute3",
    "attribute4",
    "attribute5",
    "attribute6",
    "attribute7",
    "attribute8",
    "attribute9",
    "attribute10"
})
public class DTSalesClassificationSP {

    @XmlElement(name = "IsCompetitor")
    protected Boolean isCompetitor;
    @XmlElement(name = "IsProspekt")
    protected Boolean isProspekt;
    @XmlElement(name = "IsConsumer")
    protected Boolean isConsumer;
    @XmlElement(name = "IsCustomer")
    protected Boolean isCustomer;
    @XmlElement(name = "CustomerSince")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerSince;
    @XmlElement(name = "IsCODCustomer")
    protected Boolean isCODCustomer;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "IsRented")
    protected Boolean isRented;
    @XmlElement(name = "AccountGroup")
    protected String accountGroup;
    @XmlElement(name = "NielsenId")
    protected String nielsenId;
    @XmlElement(name = "CustomerClassification")
    protected String customerClassification;
    @XmlElement(name = "Attribute")
    protected String attribute;
    @XmlElement(name = "Attribute2")
    protected String attribute2;
    @XmlElement(name = "Attribute3")
    protected String attribute3;
    @XmlElement(name = "Attribute4")
    protected String attribute4;
    @XmlElement(name = "Attribute5")
    protected String attribute5;
    @XmlElement(name = "Attribute6")
    protected String attribute6;
    @XmlElement(name = "Attribute7")
    protected String attribute7;
    @XmlElement(name = "Attribute8")
    protected String attribute8;
    @XmlElement(name = "Attribute9")
    protected String attribute9;
    @XmlElement(name = "Attribute10")
    protected String attribute10;

    /**
     * Recupera il valore della proprietà isCompetitor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompetitor() {
        return isCompetitor;
    }

    /**
     * Imposta il valore della proprietà isCompetitor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompetitor(Boolean value) {
        this.isCompetitor = value;
    }

    /**
     * Recupera il valore della proprietà isProspekt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProspekt() {
        return isProspekt;
    }

    /**
     * Imposta il valore della proprietà isProspekt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProspekt(Boolean value) {
        this.isProspekt = value;
    }

    /**
     * Recupera il valore della proprietà isConsumer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsumer() {
        return isConsumer;
    }

    /**
     * Imposta il valore della proprietà isConsumer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsumer(Boolean value) {
        this.isConsumer = value;
    }

    /**
     * Recupera il valore della proprietà isCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomer() {
        return isCustomer;
    }

    /**
     * Imposta il valore della proprietà isCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomer(Boolean value) {
        this.isCustomer = value;
    }

    /**
     * Recupera il valore della proprietà customerSince.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerSince() {
        return customerSince;
    }

    /**
     * Imposta il valore della proprietà customerSince.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerSince(XMLGregorianCalendar value) {
        this.customerSince = value;
    }

    /**
     * Recupera il valore della proprietà isCODCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCODCustomer() {
        return isCODCustomer;
    }

    /**
     * Imposta il valore della proprietà isCODCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCODCustomer(Boolean value) {
        this.isCODCustomer = value;
    }

    /**
     * Recupera il valore della proprietà industry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Imposta il valore della proprietà industry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Recupera il valore della proprietà isRented.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRented() {
        return isRented;
    }

    /**
     * Imposta il valore della proprietà isRented.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRented(Boolean value) {
        this.isRented = value;
    }

    /**
     * Recupera il valore della proprietà accountGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGroup() {
        return accountGroup;
    }

    /**
     * Imposta il valore della proprietà accountGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountGroup(String value) {
        this.accountGroup = value;
    }

    /**
     * Recupera il valore della proprietà nielsenId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNielsenId() {
        return nielsenId;
    }

    /**
     * Imposta il valore della proprietà nielsenId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNielsenId(String value) {
        this.nielsenId = value;
    }

    /**
     * Recupera il valore della proprietà customerClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClassification() {
        return customerClassification;
    }

    /**
     * Imposta il valore della proprietà customerClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClassification(String value) {
        this.customerClassification = value;
    }

    /**
     * Recupera il valore della proprietà attribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Imposta il valore della proprietà attribute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Recupera il valore della proprietà attribute2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * Imposta il valore della proprietà attribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute2(String value) {
        this.attribute2 = value;
    }

    /**
     * Recupera il valore della proprietà attribute3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * Imposta il valore della proprietà attribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute3(String value) {
        this.attribute3 = value;
    }

    /**
     * Recupera il valore della proprietà attribute4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * Imposta il valore della proprietà attribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute4(String value) {
        this.attribute4 = value;
    }

    /**
     * Recupera il valore della proprietà attribute5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * Imposta il valore della proprietà attribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute5(String value) {
        this.attribute5 = value;
    }

    /**
     * Recupera il valore della proprietà attribute6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * Imposta il valore della proprietà attribute6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute6(String value) {
        this.attribute6 = value;
    }

    /**
     * Recupera il valore della proprietà attribute7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
     * Imposta il valore della proprietà attribute7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute7(String value) {
        this.attribute7 = value;
    }

    /**
     * Recupera il valore della proprietà attribute8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
     * Imposta il valore della proprietà attribute8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute8(String value) {
        this.attribute8 = value;
    }

    /**
     * Recupera il valore della proprietà attribute9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
     * Imposta il valore della proprietà attribute9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute9(String value) {
        this.attribute9 = value;
    }

    /**
     * Recupera il valore della proprietà attribute10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
     * Imposta il valore della proprietà attribute10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute10(String value) {
        this.attribute10 = value;
    }

}
