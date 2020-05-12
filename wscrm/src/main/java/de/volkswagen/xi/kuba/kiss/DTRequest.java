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
 * Request data
 * 
 * <p>Classe Java per DT_Request complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="METHOD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle"/>
 *         &lt;element name="ProcessType" type="{http://volkswagen.de/xi/kuba/KISS}DT_ProcessType" minOccurs="0"/>
 *         &lt;element name="Subject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Texts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderTextSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Concretions" type="{http://volkswagen.de/xi/kuba/KISS}DT_Concretion" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
 *         &lt;element name="ExternalRequestIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="ExternalCaseNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalParentIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="Priority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Partners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Partner" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderPartner" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestedChannel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestedReaction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Addressee" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Intact" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleRefHandles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SurveyData" type="{http://volkswagen.de/xi/kuba/KISS}DT_Survey" minOccurs="0"/>
 *         &lt;element name="SurveyStructure" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyStructure" minOccurs="0"/>
 *         &lt;element name="CampaignElement" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignElement" minOccurs="0"/>
 *         &lt;element name="SalesCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AgentGrouping" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
@XmlType(name = "DT_Request", propOrder = {
    "method",
    "referenceHandle",
    "processType",
    "subject",
    "texts",
    "concretions",
    "status",
    "externalRequestIds",
    "externalCaseNo",
    "externalParentIds",
    "priority",
    "partners",
    "appointments",
    "requestedChannel",
    "requestedReaction",
    "addressee",
    "intact",
    "vehicleRefHandles",
    "surveyData",
    "surveyStructure",
    "campaignElement",
    "salesCategory",
    "agentGrouping"
})
public class DTRequest {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Texts")
    protected DTRequest.Texts texts;
    @XmlElement(name = "Concretions")
    protected DTConcretion concretions;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "ExternalRequestIds")
    protected DTOrderId externalRequestIds;
    @XmlElement(name = "ExternalCaseNo")
    protected String externalCaseNo;
    @XmlElement(name = "ExternalParentIds")
    protected DTOrderId externalParentIds;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Partners")
    protected DTRequest.Partners partners;
    @XmlElement(name = "Appointments")
    protected DTRequest.Appointments appointments;
    @XmlElement(name = "RequestedChannel")
    protected String requestedChannel;
    @XmlElement(name = "RequestedReaction")
    protected String requestedReaction;
    @XmlElement(name = "Addressee")
    protected String addressee;
    @XmlElement(name = "Intact")
    protected String intact;
    @XmlElement(name = "VehicleRefHandles")
    protected DTRequest.VehicleRefHandles vehicleRefHandles;
    @XmlElement(name = "SurveyData")
    protected String surveyData;
    @XmlElement(name = "SurveyStructure")
    protected DTSurveyStructure surveyStructure;
    @XmlElement(name = "CampaignElement")
    protected String campaignElement;
    @XmlElement(name = "SalesCategory")
    protected String salesCategory;
    @XmlElement(name = "AgentGrouping")
    protected String agentGrouping;

    /**
     * Recupera il valore della proprietà method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETHOD() {
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
    public void setMETHOD(String value) {
        this.method = value;
    }

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
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link DTRequest.Texts }
     *     
     */
    public DTRequest.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRequest.Texts }
     *     
     */
    public void setTexts(DTRequest.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà concretions.
     * 
     * @return
     *     possible object is
     *     {@link DTConcretion }
     *     
     */
    public DTConcretion getConcretions() {
        return concretions;
    }

    /**
     * Imposta il valore della proprietà concretions.
     * 
     * @param value
     *     allowed object is
     *     {@link DTConcretion }
     *     
     */
    public void setConcretions(DTConcretion value) {
        this.concretions = value;
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
     * Recupera il valore della proprietà externalRequestIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalRequestIds() {
        return externalRequestIds;
    }

    /**
     * Imposta il valore della proprietà externalRequestIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalRequestIds(DTOrderId value) {
        this.externalRequestIds = value;
    }

    /**
     * Recupera il valore della proprietà externalCaseNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCaseNo() {
        return externalCaseNo;
    }

    /**
     * Imposta il valore della proprietà externalCaseNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCaseNo(String value) {
        this.externalCaseNo = value;
    }

    /**
     * Recupera il valore della proprietà externalParentIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalParentIds() {
        return externalParentIds;
    }

    /**
     * Imposta il valore della proprietà externalParentIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalParentIds(DTOrderId value) {
        this.externalParentIds = value;
    }

    /**
     * Recupera il valore della proprietà priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link DTRequest.Partners }
     *     
     */
    public DTRequest.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRequest.Partners }
     *     
     */
    public void setPartners(DTRequest.Partners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link DTRequest.Appointments }
     *     
     */
    public DTRequest.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRequest.Appointments }
     *     
     */
    public void setAppointments(DTRequest.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà requestedChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedChannel() {
        return requestedChannel;
    }

    /**
     * Imposta il valore della proprietà requestedChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedChannel(String value) {
        this.requestedChannel = value;
    }

    /**
     * Recupera il valore della proprietà requestedReaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedReaction() {
        return requestedReaction;
    }

    /**
     * Imposta il valore della proprietà requestedReaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedReaction(String value) {
        this.requestedReaction = value;
    }

    /**
     * Recupera il valore della proprietà addressee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Imposta il valore della proprietà addressee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressee(String value) {
        this.addressee = value;
    }

    /**
     * Recupera il valore della proprietà intact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntact() {
        return intact;
    }

    /**
     * Imposta il valore della proprietà intact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntact(String value) {
        this.intact = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link DTRequest.VehicleRefHandles }
     *     
     */
    public DTRequest.VehicleRefHandles getVehicleRefHandles() {
        return vehicleRefHandles;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRequest.VehicleRefHandles }
     *     
     */
    public void setVehicleRefHandles(DTRequest.VehicleRefHandles value) {
        this.vehicleRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà surveyData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyData() {
        return surveyData;
    }

    /**
     * Imposta il valore della proprietà surveyData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyData(String value) {
        this.surveyData = value;
    }

    /**
     * Recupera il valore della proprietà surveyStructure.
     * 
     * @return
     *     possible object is
     *     {@link DTSurveyStructure }
     *     
     */
    public DTSurveyStructure getSurveyStructure() {
        return surveyStructure;
    }

    /**
     * Imposta il valore della proprietà surveyStructure.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSurveyStructure }
     *     
     */
    public void setSurveyStructure(DTSurveyStructure value) {
        this.surveyStructure = value;
    }

    /**
     * Recupera il valore della proprietà campaignElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignElement() {
        return campaignElement;
    }

    /**
     * Imposta il valore della proprietà campaignElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignElement(String value) {
        this.campaignElement = value;
    }

    /**
     * Recupera il valore della proprietà salesCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCategory() {
        return salesCategory;
    }

    /**
     * Imposta il valore della proprietà salesCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCategory(String value) {
        this.salesCategory = value;
    }

    /**
     * Recupera il valore della proprietà agentGrouping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentGrouping() {
        return agentGrouping;
    }

    /**
     * Imposta il valore della proprietà agentGrouping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentGrouping(String value) {
        this.agentGrouping = value;
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
     *         &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Appointment")
        protected List<DTOrderAppointmentSP> appointment;

        /**
         * Gets the value of the appointment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appointment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppointment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTOrderAppointmentSP }
         * 
         * 
         */
        public List<DTOrderAppointmentSP> getAppointment() {
            if (appointment == null) {
                appointment = new ArrayList<DTOrderAppointmentSP>();
            }
            return this.appointment;
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
     *         &lt;element name="Partner" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderPartner" maxOccurs="unbounded" minOccurs="0"/>
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
        "partner"
    })
    public static class Partners {

        @XmlElement(name = "Partner")
        protected List<DTOrderPartner> partner;

        /**
         * Gets the value of the partner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTOrderPartner }
         * 
         * 
         */
        public List<DTOrderPartner> getPartner() {
            if (partner == null) {
                partner = new ArrayList<DTOrderPartner>();
            }
            return this.partner;
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
     *         &lt;element name="Text" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderTextSP" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Text")
        protected List<DTOrderTextSP> text;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTOrderTextSP }
         * 
         * 
         */
        public List<DTOrderTextSP> getText() {
            if (text == null) {
                text = new ArrayList<DTOrderTextSP>();
            }
            return this.text;
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
     *         &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "VehicleRefHandle")
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
