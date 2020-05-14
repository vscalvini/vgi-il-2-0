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
 * Append structure for partner type independent data
 * 
 * <p>Classe Java per DT_CentralDataAppendSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_CentralDataAppendSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyType" type="{http://volkswagen.de/xi/kuba/KISS}DT_CompanyType" minOccurs="0"/>
 *         &lt;element name="ChainNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChainName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BirthYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="VZNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MajorClientNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Incomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatherBlock" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FSAGNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAFCode" type="{http://volkswagen.de/xi/kuba/KISS}DT_NAFCode" minOccurs="0"/>
 *         &lt;element name="YPCode" type="{http://volkswagen.de/xi/kuba/KISS}DT_YPCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_CentralDataAppendSP", propOrder = {
    "companyType",
    "chainNo",
    "chainName",
    "inactive",
    "birthYear",
    "vzNo",
    "majorClientNo",
    "incomplete",
    "gatherBlock",
    "fsagNumber",
    "nafCode",
    "ypCode"
})
public class DTCentralDataAppendSP {

    @XmlElement(name = "CompanyType")
    protected String companyType;
    @XmlElement(name = "ChainNo")
    protected String chainNo;
    @XmlElement(name = "ChainName")
    protected String chainName;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "BirthYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar birthYear;
    @XmlElement(name = "VZNo")
    protected String vzNo;
    @XmlElement(name = "MajorClientNo")
    protected String majorClientNo;
    @XmlElement(name = "Incomplete")
    protected Boolean incomplete;
    @XmlElement(name = "GatherBlock")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gatherBlock;
    @XmlElement(name = "FSAGNumber")
    protected String fsagNumber;
    @XmlElement(name = "NAFCode")
    protected String nafCode;
    @XmlElement(name = "YPCode")
    protected String ypCode;

    /**
     * Recupera il valore della proprietà companyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Imposta il valore della proprietà companyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Recupera il valore della proprietà chainNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainNo() {
        return chainNo;
    }

    /**
     * Imposta il valore della proprietà chainNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainNo(String value) {
        this.chainNo = value;
    }

    /**
     * Recupera il valore della proprietà chainName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Imposta il valore della proprietà chainName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Recupera il valore della proprietà inactive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Imposta il valore della proprietà inactive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Recupera il valore della proprietà birthYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthYear() {
        return birthYear;
    }

    /**
     * Imposta il valore della proprietà birthYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthYear(XMLGregorianCalendar value) {
        this.birthYear = value;
    }

    /**
     * Recupera il valore della proprietà vzNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVZNo() {
        return vzNo;
    }

    /**
     * Imposta il valore della proprietà vzNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVZNo(String value) {
        this.vzNo = value;
    }

    /**
     * Recupera il valore della proprietà majorClientNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorClientNo() {
        return majorClientNo;
    }

    /**
     * Imposta il valore della proprietà majorClientNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorClientNo(String value) {
        this.majorClientNo = value;
    }

    /**
     * Recupera il valore della proprietà incomplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncomplete() {
        return incomplete;
    }

    /**
     * Imposta il valore della proprietà incomplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncomplete(Boolean value) {
        this.incomplete = value;
    }

    /**
     * Recupera il valore della proprietà gatherBlock.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGatherBlock() {
        return gatherBlock;
    }

    /**
     * Imposta il valore della proprietà gatherBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGatherBlock(XMLGregorianCalendar value) {
        this.gatherBlock = value;
    }

    /**
     * Recupera il valore della proprietà fsagNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSAGNumber() {
        return fsagNumber;
    }

    /**
     * Imposta il valore della proprietà fsagNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSAGNumber(String value) {
        this.fsagNumber = value;
    }

    /**
     * Recupera il valore della proprietà nafCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAFCode() {
        return nafCode;
    }

    /**
     * Imposta il valore della proprietà nafCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAFCode(String value) {
        this.nafCode = value;
    }

    /**
     * Recupera il valore della proprietà ypCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYPCode() {
        return ypCode;
    }

    /**
     * Imposta il valore della proprietà ypCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYPCode(String value) {
        this.ypCode = value;
    }

}
