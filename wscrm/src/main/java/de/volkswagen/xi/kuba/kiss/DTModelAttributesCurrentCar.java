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
 * Data type for current car information in interest
 * 
 * <p>Classe Java per DT_ModelAttributesCurrentCar complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ModelAttributesCurrentCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Brand" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Model" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PurchaseFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="Mileage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MileageUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="KM"/>
 *               &lt;enumeration value="MI"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EnginePower" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="TypeOfUsage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
@XmlType(name = "DT_ModelAttributesCurrentCar", propOrder = {
    "brand",
    "model",
    "purchaseFlag",
    "modelYear",
    "mileage",
    "mileageUnit",
    "engineVersion",
    "enginePower",
    "licenseNumber",
    "typeOfUsage"
})
public class DTModelAttributesCurrentCar {

    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "PurchaseFlag")
    protected String purchaseFlag;
    @XmlElement(name = "ModelYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar modelYear;
    @XmlElement(name = "Mileage")
    protected Integer mileage;
    @XmlElement(name = "MileageUnit")
    protected String mileageUnit;
    @XmlElement(name = "EngineVersion")
    protected String engineVersion;
    @XmlElement(name = "EnginePower")
    protected String enginePower;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "TypeOfUsage")
    protected String typeOfUsage;

    /**
     * Recupera il valore della proprietà brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Imposta il valore della proprietà brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Recupera il valore della proprietà model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Imposta il valore della proprietà model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Recupera il valore della proprietà purchaseFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseFlag() {
        return purchaseFlag;
    }

    /**
     * Imposta il valore della proprietà purchaseFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseFlag(String value) {
        this.purchaseFlag = value;
    }

    /**
     * Recupera il valore della proprietà modelYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelYear() {
        return modelYear;
    }

    /**
     * Imposta il valore della proprietà modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelYear(XMLGregorianCalendar value) {
        this.modelYear = value;
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
     * Recupera il valore della proprietà engineVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * Imposta il valore della proprietà engineVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineVersion(String value) {
        this.engineVersion = value;
    }

    /**
     * Recupera il valore della proprietà enginePower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnginePower() {
        return enginePower;
    }

    /**
     * Imposta il valore della proprietà enginePower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnginePower(String value) {
        this.enginePower = value;
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
     * Recupera il valore della proprietà typeOfUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfUsage() {
        return typeOfUsage;
    }

    /**
     * Imposta il valore della proprietà typeOfUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfUsage(String value) {
        this.typeOfUsage = value;
    }

}
