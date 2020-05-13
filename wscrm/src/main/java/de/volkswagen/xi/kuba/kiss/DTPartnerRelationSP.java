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
 * Partner relation
 * 
 * <p>Classe Java per DT_PartnerRelationSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PartnerRelationSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="RelationId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RelationType" type="{http://volkswagen.de/xi/kuba/KISS}DT_RelationType" minOccurs="0"/>
 *         &lt;element name="Partner1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Partner1External" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Partner1RefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="Partner2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Partner2External" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Partner2RefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="ValidDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ValidDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StandardRelationship" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SetPart1StandardAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CentralData" type="{http://volkswagen.de/xi/kuba/KISS}DT_PR_CentralData" minOccurs="0"/>
 *         &lt;element name="AddressData" type="{http://volkswagen.de/xi/kuba/KISS}DT_PR_AddressDataSP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PartnerRelationSP", propOrder = {
    "method",
    "relationId",
    "relationType",
    "partner1",
    "partner1External",
    "partner1RefHandle",
    "partner2",
    "partner2External",
    "partner2RefHandle",
    "validDateFrom",
    "validDateTo",
    "standardRelationship",
    "setPart1StandardAddress",
    "centralData",
    "addressData"
})
public class DTPartnerRelationSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "RelationId")
    protected String relationId;
    @XmlElement(name = "RelationType")
    protected String relationType;
    @XmlElement(name = "Partner1")
    protected String partner1;
    @XmlElement(name = "Partner1External")
    protected String partner1External;
    @XmlElement(name = "Partner1RefHandle")
    protected String partner1RefHandle;
    @XmlElement(name = "Partner2")
    protected String partner2;
    @XmlElement(name = "Partner2External")
    protected String partner2External;
    @XmlElement(name = "Partner2RefHandle")
    protected String partner2RefHandle;
    @XmlElement(name = "ValidDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validDateFrom;
    @XmlElement(name = "ValidDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validDateTo;
    @XmlElement(name = "StandardRelationship")
    protected Boolean standardRelationship;
    @XmlElement(name = "SetPart1StandardAddress")
    protected Boolean setPart1StandardAddress;
    @XmlElement(name = "CentralData")
    protected DTPRCentralData centralData;
    @XmlElement(name = "AddressData")
    protected DTPRAddressDataSP addressData;

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
     * Recupera il valore della proprietà relationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * Imposta il valore della proprietà relationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationId(String value) {
        this.relationId = value;
    }

    /**
     * Recupera il valore della proprietà relationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Imposta il valore della proprietà relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
    }

    /**
     * Recupera il valore della proprietà partner1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner1() {
        return partner1;
    }

    /**
     * Imposta il valore della proprietà partner1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner1(String value) {
        this.partner1 = value;
    }

    /**
     * Recupera il valore della proprietà partner1External.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner1External() {
        return partner1External;
    }

    /**
     * Imposta il valore della proprietà partner1External.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner1External(String value) {
        this.partner1External = value;
    }

    /**
     * Recupera il valore della proprietà partner1RefHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner1RefHandle() {
        return partner1RefHandle;
    }

    /**
     * Imposta il valore della proprietà partner1RefHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner1RefHandle(String value) {
        this.partner1RefHandle = value;
    }

    /**
     * Recupera il valore della proprietà partner2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner2() {
        return partner2;
    }

    /**
     * Imposta il valore della proprietà partner2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner2(String value) {
        this.partner2 = value;
    }

    /**
     * Recupera il valore della proprietà partner2External.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner2External() {
        return partner2External;
    }

    /**
     * Imposta il valore della proprietà partner2External.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner2External(String value) {
        this.partner2External = value;
    }

    /**
     * Recupera il valore della proprietà partner2RefHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner2RefHandle() {
        return partner2RefHandle;
    }

    /**
     * Imposta il valore della proprietà partner2RefHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner2RefHandle(String value) {
        this.partner2RefHandle = value;
    }

    /**
     * Recupera il valore della proprietà validDateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateFrom() {
        return validDateFrom;
    }

    /**
     * Imposta il valore della proprietà validDateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateFrom(XMLGregorianCalendar value) {
        this.validDateFrom = value;
    }

    /**
     * Recupera il valore della proprietà validDateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateTo() {
        return validDateTo;
    }

    /**
     * Imposta il valore della proprietà validDateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateTo(XMLGregorianCalendar value) {
        this.validDateTo = value;
    }

    /**
     * Recupera il valore della proprietà standardRelationship.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardRelationship() {
        return standardRelationship;
    }

    /**
     * Imposta il valore della proprietà standardRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardRelationship(Boolean value) {
        this.standardRelationship = value;
    }

    /**
     * Recupera il valore della proprietà setPart1StandardAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetPart1StandardAddress() {
        return setPart1StandardAddress;
    }

    /**
     * Imposta il valore della proprietà setPart1StandardAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetPart1StandardAddress(Boolean value) {
        this.setPart1StandardAddress = value;
    }

    /**
     * Recupera il valore della proprietà centralData.
     * 
     * @return
     *     possible object is
     *     {@link DTPRCentralData }
     *     
     */
    public DTPRCentralData getCentralData() {
        return centralData;
    }

    /**
     * Imposta il valore della proprietà centralData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPRCentralData }
     *     
     */
    public void setCentralData(DTPRCentralData value) {
        this.centralData = value;
    }

    /**
     * Recupera il valore della proprietà addressData.
     * 
     * @return
     *     possible object is
     *     {@link DTPRAddressDataSP }
     *     
     */
    public DTPRAddressDataSP getAddressData() {
        return addressData;
    }

    /**
     * Imposta il valore della proprietà addressData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPRAddressDataSP }
     *     
     */
    public void setAddressData(DTPRAddressDataSP value) {
        this.addressData = value;
    }

}
