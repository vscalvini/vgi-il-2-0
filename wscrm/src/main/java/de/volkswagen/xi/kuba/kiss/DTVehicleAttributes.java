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
 * Vehicle attribute data
 * 
 * <p>Classe Java per DT_VehicleAttributes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://volkswagen.de/xi/kuba/KISS}DT_Vendor" minOccurs="0"/>
 *         &lt;element name="Modeltype" type="{http://volkswagen.de/xi/kuba/KISS}DT_ModelType" minOccurs="0"/>
 *         &lt;element name="Bodytype" type="{http://volkswagen.de/xi/kuba/KISS}DT_BodyType" minOccurs="0"/>
 *         &lt;element name="InitialLicense" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ModelDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChassisNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="ModelKey" type="{http://volkswagen.de/xi/kuba/KISS}DT_ModelKey" minOccurs="0"/>
 *         &lt;element name="ModelKeyWithExt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="180"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineSize" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="5"/>
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
 *         &lt;element name="EngineId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GearUnitId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineVersion" type="{http://volkswagen.de/xi/kuba/KISS}DT_EngineVersion" minOccurs="0"/>
 *         &lt;element name="ColorKey" type="{http://volkswagen.de/xi/kuba/KISS}DT_ColorKey" minOccurs="0"/>
 *         &lt;element name="PaintKey" type="{http://volkswagen.de/xi/kuba/KISS}DT_PaintKey" minOccurs="0"/>
 *         &lt;element name="Color" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpecialForm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KeyNumber1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KeyNumber2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ColorTegaron" type="{http://volkswagen.de/xi/kuba/KISS}DT_ColorTegaron" minOccurs="0"/>
 *         &lt;element name="TypeMine" type="{http://volkswagen.de/xi/kuba/KISS}DT_TypeMine" minOccurs="0"/>
 *         &lt;element name="FiscalHorsePower" type="{http://volkswagen.de/xi/kuba/KISS}DT_FiscalHorsePower" minOccurs="0"/>
 *         &lt;element name="MaxWeightVehicle" type="{http://volkswagen.de/xi/kuba/KISS}DT_MaxWeightVehicle" minOccurs="0"/>
 *         &lt;element name="Seats" type="{http://volkswagen.de/xi/kuba/KISS}DT_Seats" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://volkswagen.de/xi/kuba/KISS}DT_GroupId" minOccurs="0"/>
 *         &lt;element name="ManualId" type="{http://volkswagen.de/xi/kuba/KISS}DT_ManualId" minOccurs="0"/>
 *         &lt;element name="EquipmentLine" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductionYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="VehiCo2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehiCo2Unit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehiCo2Directive" minOccurs="0">
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
@XmlType(name = "DT_VehicleAttributes", propOrder = {
    "method",
    "vendor",
    "modeltype",
    "bodytype",
    "initialLicense",
    "modelDescription",
    "chassisNumber",
    "modelYear",
    "modelKey",
    "modelKeyWithExt",
    "engineSize",
    "enginePower",
    "engineId",
    "gearUnitId",
    "engineVersion",
    "colorKey",
    "paintKey",
    "color",
    "specialForm",
    "keyNumber1",
    "keyNumber2",
    "validFrom",
    "colorTegaron",
    "typeMine",
    "fiscalHorsePower",
    "maxWeightVehicle",
    "seats",
    "groupId",
    "manualId",
    "equipmentLine",
    "productionYear",
    "vehiCo2",
    "vehiCo2Unit",
    "vehiCo2Directive"
})
public class DTVehicleAttributes {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "Vendor")
    protected String vendor;
    @XmlElement(name = "Modeltype")
    protected String modeltype;
    @XmlElement(name = "Bodytype")
    protected String bodytype;
    @XmlElement(name = "InitialLicense")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialLicense;
    @XmlElement(name = "ModelDescription")
    protected String modelDescription;
    @XmlElement(name = "ChassisNumber")
    protected String chassisNumber;
    @XmlElement(name = "ModelYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar modelYear;
    @XmlElement(name = "ModelKey")
    protected String modelKey;
    @XmlElement(name = "ModelKeyWithExt")
    protected String modelKeyWithExt;
    @XmlElement(name = "EngineSize")
    protected String engineSize;
    @XmlElement(name = "EnginePower")
    protected String enginePower;
    @XmlElement(name = "EngineId")
    protected String engineId;
    @XmlElement(name = "GearUnitId")
    protected String gearUnitId;
    @XmlElement(name = "EngineVersion")
    protected String engineVersion;
    @XmlElement(name = "ColorKey")
    protected String colorKey;
    @XmlElement(name = "PaintKey")
    protected String paintKey;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "SpecialForm")
    protected String specialForm;
    @XmlElement(name = "KeyNumber1")
    protected String keyNumber1;
    @XmlElement(name = "KeyNumber2")
    protected String keyNumber2;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ColorTegaron")
    protected String colorTegaron;
    @XmlElement(name = "TypeMine")
    protected String typeMine;
    @XmlElement(name = "FiscalHorsePower")
    protected String fiscalHorsePower;
    @XmlElement(name = "MaxWeightVehicle")
    protected String maxWeightVehicle;
    @XmlElement(name = "Seats")
    protected String seats;
    @XmlElement(name = "GroupId")
    protected String groupId;
    @XmlElement(name = "ManualId")
    protected String manualId;
    @XmlElement(name = "EquipmentLine")
    protected String equipmentLine;
    @XmlElement(name = "ProductionYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar productionYear;
    @XmlElement(name = "VehiCo2")
    protected String vehiCo2;
    @XmlElement(name = "VehiCo2Unit")
    protected String vehiCo2Unit;
    @XmlElement(name = "VehiCo2Directive")
    protected String vehiCo2Directive;

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
     * Recupera il valore della proprietà vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Imposta il valore della proprietà vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Recupera il valore della proprietà modeltype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeltype() {
        return modeltype;
    }

    /**
     * Imposta il valore della proprietà modeltype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeltype(String value) {
        this.modeltype = value;
    }

    /**
     * Recupera il valore della proprietà bodytype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodytype() {
        return bodytype;
    }

    /**
     * Imposta il valore della proprietà bodytype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodytype(String value) {
        this.bodytype = value;
    }

    /**
     * Recupera il valore della proprietà initialLicense.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialLicense() {
        return initialLicense;
    }

    /**
     * Imposta il valore della proprietà initialLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialLicense(XMLGregorianCalendar value) {
        this.initialLicense = value;
    }

    /**
     * Recupera il valore della proprietà modelDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Imposta il valore della proprietà modelDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Recupera il valore della proprietà chassisNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Imposta il valore della proprietà chassisNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
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
     * Recupera il valore della proprietà modelKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelKey() {
        return modelKey;
    }

    /**
     * Imposta il valore della proprietà modelKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelKey(String value) {
        this.modelKey = value;
    }

    /**
     * Recupera il valore della proprietà modelKeyWithExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelKeyWithExt() {
        return modelKeyWithExt;
    }

    /**
     * Imposta il valore della proprietà modelKeyWithExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelKeyWithExt(String value) {
        this.modelKeyWithExt = value;
    }

    /**
     * Recupera il valore della proprietà engineSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineSize() {
        return engineSize;
    }

    /**
     * Imposta il valore della proprietà engineSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineSize(String value) {
        this.engineSize = value;
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
     * Recupera il valore della proprietà engineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineId() {
        return engineId;
    }

    /**
     * Imposta il valore della proprietà engineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineId(String value) {
        this.engineId = value;
    }

    /**
     * Recupera il valore della proprietà gearUnitId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearUnitId() {
        return gearUnitId;
    }

    /**
     * Imposta il valore della proprietà gearUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearUnitId(String value) {
        this.gearUnitId = value;
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
     * Recupera il valore della proprietà colorKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorKey() {
        return colorKey;
    }

    /**
     * Imposta il valore della proprietà colorKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorKey(String value) {
        this.colorKey = value;
    }

    /**
     * Recupera il valore della proprietà paintKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaintKey() {
        return paintKey;
    }

    /**
     * Imposta il valore della proprietà paintKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaintKey(String value) {
        this.paintKey = value;
    }

    /**
     * Recupera il valore della proprietà color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Recupera il valore della proprietà specialForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialForm() {
        return specialForm;
    }

    /**
     * Imposta il valore della proprietà specialForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialForm(String value) {
        this.specialForm = value;
    }

    /**
     * Recupera il valore della proprietà keyNumber1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNumber1() {
        return keyNumber1;
    }

    /**
     * Imposta il valore della proprietà keyNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNumber1(String value) {
        this.keyNumber1 = value;
    }

    /**
     * Recupera il valore della proprietà keyNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNumber2() {
        return keyNumber2;
    }

    /**
     * Imposta il valore della proprietà keyNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNumber2(String value) {
        this.keyNumber2 = value;
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
     * Recupera il valore della proprietà colorTegaron.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorTegaron() {
        return colorTegaron;
    }

    /**
     * Imposta il valore della proprietà colorTegaron.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorTegaron(String value) {
        this.colorTegaron = value;
    }

    /**
     * Recupera il valore della proprietà typeMine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMine() {
        return typeMine;
    }

    /**
     * Imposta il valore della proprietà typeMine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMine(String value) {
        this.typeMine = value;
    }

    /**
     * Recupera il valore della proprietà fiscalHorsePower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalHorsePower() {
        return fiscalHorsePower;
    }

    /**
     * Imposta il valore della proprietà fiscalHorsePower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalHorsePower(String value) {
        this.fiscalHorsePower = value;
    }

    /**
     * Recupera il valore della proprietà maxWeightVehicle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWeightVehicle() {
        return maxWeightVehicle;
    }

    /**
     * Imposta il valore della proprietà maxWeightVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWeightVehicle(String value) {
        this.maxWeightVehicle = value;
    }

    /**
     * Recupera il valore della proprietà seats.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeats() {
        return seats;
    }

    /**
     * Imposta il valore della proprietà seats.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeats(String value) {
        this.seats = value;
    }

    /**
     * Recupera il valore della proprietà groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Imposta il valore della proprietà groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Recupera il valore della proprietà manualId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualId() {
        return manualId;
    }

    /**
     * Imposta il valore della proprietà manualId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualId(String value) {
        this.manualId = value;
    }

    /**
     * Recupera il valore della proprietà equipmentLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentLine() {
        return equipmentLine;
    }

    /**
     * Imposta il valore della proprietà equipmentLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentLine(String value) {
        this.equipmentLine = value;
    }

    /**
     * Recupera il valore della proprietà productionYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionYear() {
        return productionYear;
    }

    /**
     * Imposta il valore della proprietà productionYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionYear(XMLGregorianCalendar value) {
        this.productionYear = value;
    }

    /**
     * Recupera il valore della proprietà vehiCo2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiCo2() {
        return vehiCo2;
    }

    /**
     * Imposta il valore della proprietà vehiCo2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiCo2(String value) {
        this.vehiCo2 = value;
    }

    /**
     * Recupera il valore della proprietà vehiCo2Unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiCo2Unit() {
        return vehiCo2Unit;
    }

    /**
     * Imposta il valore della proprietà vehiCo2Unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiCo2Unit(String value) {
        this.vehiCo2Unit = value;
    }

    /**
     * Recupera il valore della proprietà vehiCo2Directive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiCo2Directive() {
        return vehiCo2Directive;
    }

    /**
     * Imposta il valore della proprietà vehiCo2Directive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiCo2Directive(String value) {
        this.vehiCo2Directive = value;
    }

}
