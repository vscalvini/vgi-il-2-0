//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.volkswagenag.xmldefs.dd.vehicle.CommissionIdentifierType;


/**
 * Structure containing a single Vehicle Sales order for a given activity partner within a KISS record
 * 
 * <p>Classe Java per VehicleSalesOrderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSalesOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle"/>
 *         &lt;element name="ProcessType" type="{http://volkswagen.de/xi/kuba/KISS}DT_ProcessType"/>
 *         &lt;element name="Subject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
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
 *         &lt;element name="CommissionIdentifier" type="{http://xmldefs.volkswagenag.com/DD/Vehicle}CommissionIdentifierType" minOccurs="0"/>
 *         &lt;element name="ExternalVehSalesOrderIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="Texts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderTextSP"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Appointments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
 *         &lt;element name="VehicleRefHandles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Partners" type="{http://volkswagen.de/xi/kuba/KISS}VehicleSalesOrderPartners"/>
 *         &lt;element name="Financing" type="{http://volkswagen.de/xi/kuba/KISS}VehicleFinancingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSalesOrderType", propOrder = {
    "referenceHandle",
    "processType",
    "subject",
    "dataOrigin",
    "usedCar",
    "commissionIdentifier",
    "externalVehSalesOrderIds",
    "texts",
    "appointments",
    "status",
    "vehicleRefHandles",
    "partners",
    "financing"
})
public class VehicleSalesOrderType {

    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProcessType", required = true)
    protected String processType;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "DataOrigin")
    protected String dataOrigin;
    @XmlElement(name = "UsedCar")
    protected String usedCar;
    @XmlElement(name = "CommissionIdentifier")
    protected CommissionIdentifierType commissionIdentifier;
    @XmlElement(name = "ExternalVehSalesOrderIds")
    protected DTOrderId externalVehSalesOrderIds;
    @XmlElement(name = "Texts")
    protected VehicleSalesOrderType.Texts texts;
    @XmlElement(name = "Appointments")
    protected VehicleSalesOrderType.Appointments appointments;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "VehicleRefHandles")
    protected VehicleSalesOrderType.VehicleRefHandles vehicleRefHandles;
    @XmlElement(name = "Partners", required = true)
    protected VehicleSalesOrderPartners partners;
    @XmlElement(name = "Financing")
    protected VehicleFinancingType financing;

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
     * Recupera il valore della proprietà processType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Imposta il valore della proprietà processType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà dataOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Imposta il valore della proprietà dataOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOrigin(String value) {
        this.dataOrigin = value;
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
     * Recupera il valore della proprietà commissionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link CommissionIdentifierType }
     *     
     */
    public CommissionIdentifierType getCommissionIdentifier() {
        return commissionIdentifier;
    }

    /**
     * Imposta il valore della proprietà commissionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionIdentifierType }
     *     
     */
    public void setCommissionIdentifier(CommissionIdentifierType value) {
        this.commissionIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà externalVehSalesOrderIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalVehSalesOrderIds() {
        return externalVehSalesOrderIds;
    }

    /**
     * Imposta il valore della proprietà externalVehSalesOrderIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalVehSalesOrderIds(DTOrderId value) {
        this.externalVehSalesOrderIds = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrderType.Texts }
     *     
     */
    public VehicleSalesOrderType.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrderType.Texts }
     *     
     */
    public void setTexts(VehicleSalesOrderType.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrderType.Appointments }
     *     
     */
    public VehicleSalesOrderType.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrderType.Appointments }
     *     
     */
    public void setAppointments(VehicleSalesOrderType.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderStatusSP }
     *     
     */
    public DTOrderStatusSP getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderStatusSP }
     *     
     */
    public void setStatus(DTOrderStatusSP value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrderType.VehicleRefHandles }
     *     
     */
    public VehicleSalesOrderType.VehicleRefHandles getVehicleRefHandles() {
        return vehicleRefHandles;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrderType.VehicleRefHandles }
     *     
     */
    public void setVehicleRefHandles(VehicleSalesOrderType.VehicleRefHandles value) {
        this.vehicleRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrderPartners }
     *     
     */
    public VehicleSalesOrderPartners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrderPartners }
     *     
     */
    public void setPartners(VehicleSalesOrderPartners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà financing.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFinancingType }
     *     
     */
    public VehicleFinancingType getFinancing() {
        return financing;
    }

    /**
     * Imposta il valore della proprietà financing.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFinancingType }
     *     
     */
    public void setFinancing(VehicleFinancingType value) {
        this.financing = value;
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
     *         &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP"/>
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
        "appointment"
    })
    public static class Appointments {

        @XmlElement(name = "Appointment", required = true)
        protected DTOrderAppointmentSP appointment;

        /**
         * Recupera il valore della proprietà appointment.
         * 
         * @return
         *     possible object is
         *     {@link DTOrderAppointmentSP }
         *     
         */
        public DTOrderAppointmentSP getAppointment() {
            return appointment;
        }

        /**
         * Imposta il valore della proprietà appointment.
         * 
         * @param value
         *     allowed object is
         *     {@link DTOrderAppointmentSP }
         *     
         */
        public void setAppointment(DTOrderAppointmentSP value) {
            this.appointment = value;
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
     *         &lt;element name="Text" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderTextSP"/>
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
        "text"
    })
    public static class Texts {

        @XmlElement(name = "Text", required = true)
        protected DTOrderTextSP text;

        /**
         * Recupera il valore della proprietà text.
         * 
         * @return
         *     possible object is
         *     {@link DTOrderTextSP }
         *     
         */
        public DTOrderTextSP getText() {
            return text;
        }

        /**
         * Imposta il valore della proprietà text.
         * 
         * @param value
         *     allowed object is
         *     {@link DTOrderTextSP }
         *     
         */
        public void setText(DTOrderTextSP value) {
            this.text = value;
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
     *         &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded"/>
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
        "vehicleRefHandle"
    })
    public static class VehicleRefHandles {

        @XmlElement(name = "VehicleRefHandle", required = true)
        protected List<String> vehicleRefHandle;

        /**
         * Gets the value of the vehicleRefHandle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRefHandle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRefHandle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVehicleRefHandle() {
            if (vehicleRefHandle == null) {
                vehicleRefHandle = new ArrayList<String>();
            }
            return this.vehicleRefHandle;
        }

    }

}
