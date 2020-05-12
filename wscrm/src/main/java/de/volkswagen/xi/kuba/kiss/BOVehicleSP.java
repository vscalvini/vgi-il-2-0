//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Business object 'Vehicle'
 * 
 * <p>Classe Java per BO_VehicleSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BO_VehicleSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="VehicleGuid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectFamily" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtVehicleIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExtVehicleId" type="{http://volkswagen.de/xi/kuba/KISS}DT_ExtVehicleId" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExternalId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleAttributes" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleAttributes" minOccurs="0"/>
 *         &lt;element name="VehicleTransactionData" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleTransactionDataSP" minOccurs="0"/>
 *         &lt;element name="VehicleOrderData" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleOrderData" minOccurs="0"/>
 *         &lt;element name="VehicleOrigin" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleOrigin" minOccurs="0"/>
 *         &lt;element name="VehicleTelematics" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleTelematicsSP" minOccurs="0"/>
 *         &lt;element name="VehicleTextComments" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleTextComments" minOccurs="0"/>
 *         &lt;element name="VehicleTraderAttributes" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleTraderAttributes" minOccurs="0"/>
 *         &lt;element name="VehiclePRNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehiclePRNumber" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehiclePRNumber" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleServiceAppointments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleServiceAppointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleServiceAppointmentSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehiclePartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehiclePartner" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehiclePartner" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleLifeData" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleLifeData" minOccurs="0"/>
 *         &lt;element name="VehicleAdditionalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalData" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddionalVehicleData" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "BO_VehicleSP", propOrder = {
    "referenceHandle",
    "vehicleGuid",
    "objectFamily",
    "extVehicleIds",
    "externalId",
    "vehicleAttributes",
    "vehicleTransactionData",
    "vehicleOrderData",
    "vehicleOrigin",
    "vehicleTelematics",
    "vehicleTextComments",
    "vehicleTraderAttributes",
    "vehiclePRNumbers",
    "vehicleServiceAppointments",
    "vehiclePartners",
    "vehicleLifeData",
    "vehicleAdditionalData"
})
public class BOVehicleSP {

    @XmlElement(name = "ReferenceHandle")
    protected String referenceHandle;
    @XmlElement(name = "VehicleGuid")
    protected String vehicleGuid;
    @XmlElement(name = "ObjectFamily")
    protected String objectFamily;
    @XmlElement(name = "ExtVehicleIds")
    protected BOVehicleSP.ExtVehicleIds extVehicleIds;
    @XmlElement(name = "ExternalId")
    protected String externalId;
    @XmlElement(name = "VehicleAttributes")
    protected DTVehicleAttributes vehicleAttributes;
    @XmlElement(name = "VehicleTransactionData")
    protected DTVehicleTransactionDataSP vehicleTransactionData;
    @XmlElement(name = "VehicleOrderData")
    protected DTVehicleOrderData vehicleOrderData;
    @XmlElement(name = "VehicleOrigin")
    protected DTVehicleOrigin vehicleOrigin;
    @XmlElement(name = "VehicleTelematics")
    protected DTVehicleTelematicsSP vehicleTelematics;
    @XmlElement(name = "VehicleTextComments")
    protected DTVehicleTextComments vehicleTextComments;
    @XmlElement(name = "VehicleTraderAttributes")
    protected DTVehicleTraderAttributes vehicleTraderAttributes;
    @XmlElement(name = "VehiclePRNumbers")
    protected BOVehicleSP.VehiclePRNumbers vehiclePRNumbers;
    @XmlElement(name = "VehicleServiceAppointments")
    protected BOVehicleSP.VehicleServiceAppointments vehicleServiceAppointments;
    @XmlElement(name = "VehiclePartners")
    protected BOVehicleSP.VehiclePartners vehiclePartners;
    @XmlElement(name = "VehicleLifeData")
    protected DTVehicleLifeData vehicleLifeData;
    @XmlElement(name = "VehicleAdditionalData")
    protected BOVehicleSP.VehicleAdditionalData vehicleAdditionalData;

    /**
     * Recupera il valore della proprietà referenceHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceHandle() {
        return referenceHandle;
    }

    /**
     * Imposta il valore della proprietà referenceHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceHandle(String value) {
        this.referenceHandle = value;
    }

    /**
     * Recupera il valore della proprietà vehicleGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleGuid() {
        return vehicleGuid;
    }

    /**
     * Imposta il valore della proprietà vehicleGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleGuid(String value) {
        this.vehicleGuid = value;
    }

    /**
     * Recupera il valore della proprietà objectFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectFamily() {
        return objectFamily;
    }

    /**
     * Imposta il valore della proprietà objectFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectFamily(String value) {
        this.objectFamily = value;
    }

    /**
     * Recupera il valore della proprietà extVehicleIds.
     * 
     * @return
     *     possible object is
     *     {@link BOVehicleSP.ExtVehicleIds }
     *     
     */
    public BOVehicleSP.ExtVehicleIds getExtVehicleIds() {
        return extVehicleIds;
    }

    /**
     * Imposta il valore della proprietà extVehicleIds.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehicleSP.ExtVehicleIds }
     *     
     */
    public void setExtVehicleIds(BOVehicleSP.ExtVehicleIds value) {
        this.extVehicleIds = value;
    }

    /**
     * Recupera il valore della proprietà externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Imposta il valore della proprietà externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Recupera il valore della proprietà vehicleAttributes.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleAttributes }
     *     
     */
    public DTVehicleAttributes getVehicleAttributes() {
        return vehicleAttributes;
    }

    /**
     * Imposta il valore della proprietà vehicleAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleAttributes }
     *     
     */
    public void setVehicleAttributes(DTVehicleAttributes value) {
        this.vehicleAttributes = value;
    }

    /**
     * Recupera il valore della proprietà vehicleTransactionData.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleTransactionDataSP }
     *     
     */
    public DTVehicleTransactionDataSP getVehicleTransactionData() {
        return vehicleTransactionData;
    }

    /**
     * Imposta il valore della proprietà vehicleTransactionData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleTransactionDataSP }
     *     
     */
    public void setVehicleTransactionData(DTVehicleTransactionDataSP value) {
        this.vehicleTransactionData = value;
    }

    /**
     * Recupera il valore della proprietà vehicleOrderData.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleOrderData }
     *     
     */
    public DTVehicleOrderData getVehicleOrderData() {
        return vehicleOrderData;
    }

    /**
     * Imposta il valore della proprietà vehicleOrderData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleOrderData }
     *     
     */
    public void setVehicleOrderData(DTVehicleOrderData value) {
        this.vehicleOrderData = value;
    }

    /**
     * Recupera il valore della proprietà vehicleOrigin.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleOrigin }
     *     
     */
    public DTVehicleOrigin getVehicleOrigin() {
        return vehicleOrigin;
    }

    /**
     * Imposta il valore della proprietà vehicleOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleOrigin }
     *     
     */
    public void setVehicleOrigin(DTVehicleOrigin value) {
        this.vehicleOrigin = value;
    }

    /**
     * Recupera il valore della proprietà vehicleTelematics.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleTelematicsSP }
     *     
     */
    public DTVehicleTelematicsSP getVehicleTelematics() {
        return vehicleTelematics;
    }

    /**
     * Imposta il valore della proprietà vehicleTelematics.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleTelematicsSP }
     *     
     */
    public void setVehicleTelematics(DTVehicleTelematicsSP value) {
        this.vehicleTelematics = value;
    }

    /**
     * Recupera il valore della proprietà vehicleTextComments.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleTextComments }
     *     
     */
    public DTVehicleTextComments getVehicleTextComments() {
        return vehicleTextComments;
    }

    /**
     * Imposta il valore della proprietà vehicleTextComments.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleTextComments }
     *     
     */
    public void setVehicleTextComments(DTVehicleTextComments value) {
        this.vehicleTextComments = value;
    }

    /**
     * Recupera il valore della proprietà vehicleTraderAttributes.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleTraderAttributes }
     *     
     */
    public DTVehicleTraderAttributes getVehicleTraderAttributes() {
        return vehicleTraderAttributes;
    }

    /**
     * Imposta il valore della proprietà vehicleTraderAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleTraderAttributes }
     *     
     */
    public void setVehicleTraderAttributes(DTVehicleTraderAttributes value) {
        this.vehicleTraderAttributes = value;
    }

    /**
     * Recupera il valore della proprietà vehiclePRNumbers.
     * 
     * @return
     *     possible object is
     *     {@link BOVehicleSP.VehiclePRNumbers }
     *     
     */
    public BOVehicleSP.VehiclePRNumbers getVehiclePRNumbers() {
        return vehiclePRNumbers;
    }

    /**
     * Imposta il valore della proprietà vehiclePRNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehicleSP.VehiclePRNumbers }
     *     
     */
    public void setVehiclePRNumbers(BOVehicleSP.VehiclePRNumbers value) {
        this.vehiclePRNumbers = value;
    }

    /**
     * Recupera il valore della proprietà vehicleServiceAppointments.
     * 
     * @return
     *     possible object is
     *     {@link BOVehicleSP.VehicleServiceAppointments }
     *     
     */
    public BOVehicleSP.VehicleServiceAppointments getVehicleServiceAppointments() {
        return vehicleServiceAppointments;
    }

    /**
     * Imposta il valore della proprietà vehicleServiceAppointments.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehicleSP.VehicleServiceAppointments }
     *     
     */
    public void setVehicleServiceAppointments(BOVehicleSP.VehicleServiceAppointments value) {
        this.vehicleServiceAppointments = value;
    }

    /**
     * Recupera il valore della proprietà vehiclePartners.
     * 
     * @return
     *     possible object is
     *     {@link BOVehicleSP.VehiclePartners }
     *     
     */
    public BOVehicleSP.VehiclePartners getVehiclePartners() {
        return vehiclePartners;
    }

    /**
     * Imposta il valore della proprietà vehiclePartners.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehicleSP.VehiclePartners }
     *     
     */
    public void setVehiclePartners(BOVehicleSP.VehiclePartners value) {
        this.vehiclePartners = value;
    }

    /**
     * Recupera il valore della proprietà vehicleLifeData.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleLifeData }
     *     
     */
    public DTVehicleLifeData getVehicleLifeData() {
        return vehicleLifeData;
    }

    /**
     * Imposta il valore della proprietà vehicleLifeData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleLifeData }
     *     
     */
    public void setVehicleLifeData(DTVehicleLifeData value) {
        this.vehicleLifeData = value;
    }

    /**
     * Recupera il valore della proprietà vehicleAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link BOVehicleSP.VehicleAdditionalData }
     *     
     */
    public BOVehicleSP.VehicleAdditionalData getVehicleAdditionalData() {
        return vehicleAdditionalData;
    }

    /**
     * Imposta il valore della proprietà vehicleAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehicleSP.VehicleAdditionalData }
     *     
     */
    public void setVehicleAdditionalData(BOVehicleSP.VehicleAdditionalData value) {
        this.vehicleAdditionalData = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExtVehicleId" type="{http://volkswagen.de/xi/kuba/KISS}DT_ExtVehicleId" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extVehicleId"
    })
    public static class ExtVehicleIds {

        @XmlElement(name = "ExtVehicleId")
        protected List<DTExtVehicleId> extVehicleId;

        /**
         * Gets the value of the extVehicleId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extVehicleId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtVehicleId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTExtVehicleId }
         * 
         * 
         */
        public List<DTExtVehicleId> getExtVehicleId() {
            if (extVehicleId == null) {
                extVehicleId = new ArrayList<DTExtVehicleId>();
            }
            return this.extVehicleId;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdditionalData" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddionalVehicleData" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalData"
    })
    public static class VehicleAdditionalData {

        @XmlElement(name = "AdditionalData")
        protected List<DTAddionalVehicleData> additionalData;

        /**
         * Gets the value of the additionalData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTAddionalVehicleData }
         * 
         * 
         */
        public List<DTAddionalVehicleData> getAdditionalData() {
            if (additionalData == null) {
                additionalData = new ArrayList<DTAddionalVehicleData>();
            }
            return this.additionalData;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VehiclePRNumber" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehiclePRNumber" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehiclePRNumber"
    })
    public static class VehiclePRNumbers {

        @XmlElement(name = "VehiclePRNumber")
        protected List<DTVehiclePRNumber> vehiclePRNumber;

        /**
         * Gets the value of the vehiclePRNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehiclePRNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehiclePRNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTVehiclePRNumber }
         * 
         * 
         */
        public List<DTVehiclePRNumber> getVehiclePRNumber() {
            if (vehiclePRNumber == null) {
                vehiclePRNumber = new ArrayList<DTVehiclePRNumber>();
            }
            return this.vehiclePRNumber;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VehiclePartner" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehiclePartner" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehiclePartner"
    })
    public static class VehiclePartners {

        @XmlElement(name = "VehiclePartner")
        protected List<DTVehiclePartner> vehiclePartner;

        /**
         * Gets the value of the vehiclePartner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehiclePartner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehiclePartner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTVehiclePartner }
         * 
         * 
         */
        public List<DTVehiclePartner> getVehiclePartner() {
            if (vehiclePartner == null) {
                vehiclePartner = new ArrayList<DTVehiclePartner>();
            }
            return this.vehiclePartner;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VehicleServiceAppointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_VehicleServiceAppointmentSP" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicleServiceAppointment"
    })
    public static class VehicleServiceAppointments {

        @XmlElement(name = "VehicleServiceAppointment")
        protected List<DTVehicleServiceAppointmentSP> vehicleServiceAppointment;

        /**
         * Gets the value of the vehicleServiceAppointment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleServiceAppointment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleServiceAppointment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTVehicleServiceAppointmentSP }
         * 
         * 
         */
        public List<DTVehicleServiceAppointmentSP> getVehicleServiceAppointment() {
            if (vehicleServiceAppointment == null) {
                vehicleServiceAppointment = new ArrayList<DTVehicleServiceAppointmentSP>();
            }
            return this.vehicleServiceAppointment;
        }

    }

}
