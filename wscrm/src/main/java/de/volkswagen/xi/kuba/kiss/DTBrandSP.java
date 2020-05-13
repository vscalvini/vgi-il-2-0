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
 * Brand data
 * 
 * <p>Classe Java per DT_BrandSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BrandSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://volkswagen.de/xi/kuba/KISS}DT_Make" minOccurs="0"/>
 *         &lt;element name="MakeStatus" type="{http://volkswagen.de/xi/kuba/KISS}DT_MakeStatus" minOccurs="0"/>
 *         &lt;element name="MakeFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MakeTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GVOStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContractStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContractEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContractStatus" type="{http://volkswagen.de/xi/kuba/KISS}DT_ContractStatus" minOccurs="0"/>
 *         &lt;element name="ContractValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedStatus" type="{http://volkswagen.de/xi/kuba/KISS}DT_ContractStatus" minOccurs="0"/>
 *         &lt;element name="PlannedFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="D1Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="D1From" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="D1To" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DistributionCenter" type="{http://volkswagen.de/xi/kuba/KISS}DT_DistributionCenter" minOccurs="0"/>
 *         &lt;element name="RegionCenter" type="{http://volkswagen.de/xi/kuba/KISS}DT_RegionCenter" minOccurs="0"/>
 *         &lt;element name="NoEva" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BrandSP", propOrder = {
    "method",
    "make",
    "makeStatus",
    "makeFrom",
    "makeTo",
    "gvoStatus",
    "contractStart",
    "contractEnd",
    "contractStatus",
    "contractValidFrom",
    "plannedStatus",
    "plannedFrom",
    "plannedTo",
    "d1Status",
    "d1From",
    "d1To",
    "distributionCenter",
    "regionCenter",
    "noEva"
})
public class DTBrandSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "MakeStatus")
    protected String makeStatus;
    @XmlElement(name = "MakeFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar makeFrom;
    @XmlElement(name = "MakeTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar makeTo;
    @XmlElement(name = "GVOStatus")
    protected String gvoStatus;
    @XmlElement(name = "ContractStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStart;
    @XmlElement(name = "ContractEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEnd;
    @XmlElement(name = "ContractStatus")
    protected String contractStatus;
    @XmlElement(name = "ContractValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractValidFrom;
    @XmlElement(name = "PlannedStatus")
    protected String plannedStatus;
    @XmlElement(name = "PlannedFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedFrom;
    @XmlElement(name = "PlannedTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedTo;
    @XmlElement(name = "D1Status")
    protected String d1Status;
    @XmlElement(name = "D1From")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d1From;
    @XmlElement(name = "D1To")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d1To;
    @XmlElement(name = "DistributionCenter")
    protected String distributionCenter;
    @XmlElement(name = "RegionCenter")
    protected String regionCenter;
    @XmlElement(name = "NoEva")
    protected Boolean noEva;

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
     * Recupera il valore della proprietà make.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Imposta il valore della proprietà make.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Recupera il valore della proprietà makeStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeStatus() {
        return makeStatus;
    }

    /**
     * Imposta il valore della proprietà makeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeStatus(String value) {
        this.makeStatus = value;
    }

    /**
     * Recupera il valore della proprietà makeFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMakeFrom() {
        return makeFrom;
    }

    /**
     * Imposta il valore della proprietà makeFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMakeFrom(XMLGregorianCalendar value) {
        this.makeFrom = value;
    }

    /**
     * Recupera il valore della proprietà makeTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMakeTo() {
        return makeTo;
    }

    /**
     * Imposta il valore della proprietà makeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMakeTo(XMLGregorianCalendar value) {
        this.makeTo = value;
    }

    /**
     * Recupera il valore della proprietà gvoStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGVOStatus() {
        return gvoStatus;
    }

    /**
     * Imposta il valore della proprietà gvoStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGVOStatus(String value) {
        this.gvoStatus = value;
    }

    /**
     * Recupera il valore della proprietà contractStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStart() {
        return contractStart;
    }

    /**
     * Imposta il valore della proprietà contractStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStart(XMLGregorianCalendar value) {
        this.contractStart = value;
    }

    /**
     * Recupera il valore della proprietà contractEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEnd() {
        return contractEnd;
    }

    /**
     * Imposta il valore della proprietà contractEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEnd(XMLGregorianCalendar value) {
        this.contractEnd = value;
    }

    /**
     * Recupera il valore della proprietà contractStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Imposta il valore della proprietà contractStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Recupera il valore della proprietà contractValidFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractValidFrom() {
        return contractValidFrom;
    }

    /**
     * Imposta il valore della proprietà contractValidFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractValidFrom(XMLGregorianCalendar value) {
        this.contractValidFrom = value;
    }

    /**
     * Recupera il valore della proprietà plannedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedStatus() {
        return plannedStatus;
    }

    /**
     * Imposta il valore della proprietà plannedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedStatus(String value) {
        this.plannedStatus = value;
    }

    /**
     * Recupera il valore della proprietà plannedFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedFrom() {
        return plannedFrom;
    }

    /**
     * Imposta il valore della proprietà plannedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedFrom(XMLGregorianCalendar value) {
        this.plannedFrom = value;
    }

    /**
     * Recupera il valore della proprietà plannedTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedTo() {
        return plannedTo;
    }

    /**
     * Imposta il valore della proprietà plannedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedTo(XMLGregorianCalendar value) {
        this.plannedTo = value;
    }

    /**
     * Recupera il valore della proprietà d1Status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD1Status() {
        return d1Status;
    }

    /**
     * Imposta il valore della proprietà d1Status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD1Status(String value) {
        this.d1Status = value;
    }

    /**
     * Recupera il valore della proprietà d1From.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD1From() {
        return d1From;
    }

    /**
     * Imposta il valore della proprietà d1From.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD1From(XMLGregorianCalendar value) {
        this.d1From = value;
    }

    /**
     * Recupera il valore della proprietà d1To.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD1To() {
        return d1To;
    }

    /**
     * Imposta il valore della proprietà d1To.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD1To(XMLGregorianCalendar value) {
        this.d1To = value;
    }

    /**
     * Recupera il valore della proprietà distributionCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCenter() {
        return distributionCenter;
    }

    /**
     * Imposta il valore della proprietà distributionCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCenter(String value) {
        this.distributionCenter = value;
    }

    /**
     * Recupera il valore della proprietà regionCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCenter() {
        return regionCenter;
    }

    /**
     * Imposta il valore della proprietà regionCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCenter(String value) {
        this.regionCenter = value;
    }

    /**
     * Recupera il valore della proprietà noEva.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEva() {
        return noEva;
    }

    /**
     * Imposta il valore della proprietà noEva.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEva(Boolean value) {
        this.noEva = value;
    }

}
