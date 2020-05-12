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
 * Vehicle transaction data
 * 
 * <p>Classe Java per DT_VehicleTransactionDataSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleTransactionDataSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicenseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MileageDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MileagePerYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NationalLicense" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UsedCar" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Usage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BUSI"/>
 *               &lt;enumeration value="PRIV"/>
 *               &lt;enumeration value="PRBU"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerSatisfaction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReprocureFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReprocureTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MileageUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrentRegistrationDate" type="{http://volkswagen.de/xi/kuba/KISS}DT_CurrentRegistrationDate" minOccurs="0"/>
 *         &lt;element name="VehicleStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConnectCapability" type="{http://volkswagen.de/xi/kuba/KISS}ConnectCapabilitySPType" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Imported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_VehicleTransactionDataSP", propOrder = {
    "method",
    "remarks",
    "licenseNumber",
    "mileage",
    "mileageDate",
    "mileagePerYear",
    "buyDate",
    "saleDate",
    "status",
    "modelText",
    "nationalLicense",
    "usedCar",
    "usage",
    "customerSatisfaction",
    "reprocureFrom",
    "reprocureTo",
    "mileageUnit",
    "currentRegistrationDate",
    "vehicleStatus",
    "connectCapability",
    "inactive",
    "imported"
})
public class DTVehicleTransactionDataSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "Mileage")
    protected Integer mileage;
    @XmlElement(name = "MileageDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mileageDate;
    @XmlElement(name = "MileagePerYear")
    protected Integer mileagePerYear;
    @XmlElement(name = "BuyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buyDate;
    @XmlElement(name = "SaleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ModelText")
    protected String modelText;
    @XmlElement(name = "NationalLicense")
    protected String nationalLicense;
    @XmlElement(name = "UsedCar")
    protected String usedCar;
    @XmlElement(name = "Usage")
    protected String usage;
    @XmlElement(name = "CustomerSatisfaction")
    protected String customerSatisfaction;
    @XmlElement(name = "ReprocureFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reprocureFrom;
    @XmlElement(name = "ReprocureTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reprocureTo;
    @XmlElement(name = "MileageUnit")
    protected String mileageUnit;
    @XmlElement(name = "CurrentRegistrationDate")
    protected XMLGregorianCalendar currentRegistrationDate;
    @XmlElement(name = "VehicleStatus")
    protected String vehicleStatus;
    @XmlElement(name = "ConnectCapability")
    protected ConnectCapabilitySPType connectCapability;
    @XmlElement(name = "Inactive", defaultValue = "false")
    protected Boolean inactive;
    @XmlElement(name = "Imported")
    protected Boolean imported;

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
     * Recupera il valore della proprietà remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Imposta il valore della proprietà remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Recupera il valore della proprietà licenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Imposta il valore della proprietà licenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Recupera il valore della proprietà mileage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMileage() {
        return mileage;
    }

    /**
     * Imposta il valore della proprietà mileage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMileage(Integer value) {
        this.mileage = value;
    }

    /**
     * Recupera il valore della proprietà mileageDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMileageDate() {
        return mileageDate;
    }

    /**
     * Imposta il valore della proprietà mileageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMileageDate(XMLGregorianCalendar value) {
        this.mileageDate = value;
    }

    /**
     * Recupera il valore della proprietà mileagePerYear.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMileagePerYear() {
        return mileagePerYear;
    }

    /**
     * Imposta il valore della proprietà mileagePerYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMileagePerYear(Integer value) {
        this.mileagePerYear = value;
    }

    /**
     * Recupera il valore della proprietà buyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyDate() {
        return buyDate;
    }

    /**
     * Imposta il valore della proprietà buyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyDate(XMLGregorianCalendar value) {
        this.buyDate = value;
    }

    /**
     * Recupera il valore della proprietà saleDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Imposta il valore della proprietà saleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà modelText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelText() {
        return modelText;
    }

    /**
     * Imposta il valore della proprietà modelText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelText(String value) {
        this.modelText = value;
    }

    /**
     * Recupera il valore della proprietà nationalLicense.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalLicense() {
        return nationalLicense;
    }

    /**
     * Imposta il valore della proprietà nationalLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalLicense(String value) {
        this.nationalLicense = value;
    }

    /**
     * Recupera il valore della proprietà usedCar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedCar() {
        return usedCar;
    }

    /**
     * Imposta il valore della proprietà usedCar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedCar(String value) {
        this.usedCar = value;
    }

    /**
     * Recupera il valore della proprietà usage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Imposta il valore della proprietà usage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Recupera il valore della proprietà customerSatisfaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    /**
     * Imposta il valore della proprietà customerSatisfaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSatisfaction(String value) {
        this.customerSatisfaction = value;
    }

    /**
     * Recupera il valore della proprietà reprocureFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReprocureFrom() {
        return reprocureFrom;
    }

    /**
     * Imposta il valore della proprietà reprocureFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReprocureFrom(XMLGregorianCalendar value) {
        this.reprocureFrom = value;
    }

    /**
     * Recupera il valore della proprietà reprocureTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReprocureTo() {
        return reprocureTo;
    }

    /**
     * Imposta il valore della proprietà reprocureTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReprocureTo(XMLGregorianCalendar value) {
        this.reprocureTo = value;
    }

    /**
     * Recupera il valore della proprietà mileageUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileageUnit() {
        return mileageUnit;
    }

    /**
     * Imposta il valore della proprietà mileageUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileageUnit(String value) {
        this.mileageUnit = value;
    }

    /**
     * Recupera il valore della proprietà currentRegistrationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentRegistrationDate() {
        return currentRegistrationDate;
    }

    /**
     * Imposta il valore della proprietà currentRegistrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentRegistrationDate(XMLGregorianCalendar value) {
        this.currentRegistrationDate = value;
    }

    /**
     * Recupera il valore della proprietà vehicleStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Imposta il valore della proprietà vehicleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleStatus(String value) {
        this.vehicleStatus = value;
    }

    /**
     * Recupera il valore della proprietà connectCapability.
     * 
     * @return
     *     possible object is
     *     {@link ConnectCapabilitySPType }
     *     
     */
    public ConnectCapabilitySPType getConnectCapability() {
        return connectCapability;
    }

    /**
     * Imposta il valore della proprietà connectCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectCapabilitySPType }
     *     
     */
    public void setConnectCapability(ConnectCapabilitySPType value) {
        this.connectCapability = value;
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
     * Recupera il valore della proprietà imported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImported() {
        return imported;
    }

    /**
     * Imposta il valore della proprietà imported.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImported(Boolean value) {
        this.imported = value;
    }

}
