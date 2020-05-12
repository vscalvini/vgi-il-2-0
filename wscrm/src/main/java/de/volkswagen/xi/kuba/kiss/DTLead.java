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
 * Lead data
 * 
 * <p>Classe Java per DT_Lead complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Lead">
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
 *         &lt;element name="SurveyData" type="{http://volkswagen.de/xi/kuba/KISS}DT_Survey" minOccurs="0"/>
 *         &lt;element name="SurveyStructure" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyStructure" minOccurs="0"/>
 *         &lt;element name="ExternalLeadIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="LeadSource" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LeadSubject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConnectDataOrigin" type="{http://volkswagen.de/xi/kuba/KISS}ConnectDataOriginSPType" minOccurs="0"/>
 *         &lt;element name="DealerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShopID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *                   &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
 *         &lt;element name="FavoredContact" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FavoredCommType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CampaignElement" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignElement" minOccurs="0"/>
 *         &lt;element name="TestDrive" type="{http://volkswagen.de/xi/kuba/KISS}DT_TestDrive" minOccurs="0"/>
 *         &lt;element name="CustomerWishes" type="{http://volkswagen.de/xi/kuba/KISS}DT_CustWish" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
 *         &lt;element name="Rubric" type="{http://volkswagen.de/xi/kuba/KISS}DT_Rubric" minOccurs="0"/>
 *         &lt;element name="QualLevelMan" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InterestRefHandles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InterestRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InteractionResults" type="{http://volkswagen.de/xi/kuba/KISS}InteractionResultsType" minOccurs="0"/>
 *         &lt;element name="Channel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "DT_Lead", propOrder = {
    "method",
    "referenceHandle",
    "processType",
    "surveyData",
    "surveyStructure",
    "externalLeadIds",
    "leadSource",
    "leadSubject",
    "connectDataOrigin",
    "dealerID",
    "shopID",
    "partners",
    "appointments",
    "texts",
    "vehicleRefHandles",
    "favoredContact",
    "favoredCommType",
    "campaignElement",
    "testDrive",
    "customerWishes",
    "status",
    "rubric",
    "qualLevelMan",
    "interestRefHandles",
    "interactionResults",
    "channel"
})
public class DTLead {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "SurveyData")
    protected String surveyData;
    @XmlElement(name = "SurveyStructure")
    protected DTSurveyStructure surveyStructure;
    @XmlElement(name = "ExternalLeadIds")
    protected DTOrderId externalLeadIds;
    @XmlElement(name = "LeadSource")
    protected String leadSource;
    @XmlElement(name = "LeadSubject")
    protected String leadSubject;
    @XmlElement(name = "ConnectDataOrigin")
    protected ConnectDataOriginSPType connectDataOrigin;
    @XmlElement(name = "DealerID")
    protected String dealerID;
    @XmlElement(name = "ShopID")
    protected String shopID;
    @XmlElement(name = "Partners")
    protected DTLead.Partners partners;
    @XmlElement(name = "Appointments")
    protected DTLead.Appointments appointments;
    @XmlElement(name = "Texts")
    protected DTLead.Texts texts;
    @XmlElement(name = "VehicleRefHandles")
    protected DTLead.VehicleRefHandles vehicleRefHandles;
    @XmlElement(name = "FavoredContact")
    protected String favoredContact;
    @XmlElement(name = "FavoredCommType")
    protected String favoredCommType;
    @XmlElement(name = "CampaignElement")
    protected String campaignElement;
    @XmlElement(name = "TestDrive")
    protected DTTestDrive testDrive;
    @XmlElement(name = "CustomerWishes")
    protected DTCustWish customerWishes;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "Rubric", defaultValue = "10")
    protected String rubric;
    @XmlElement(name = "QualLevelMan")
    protected String qualLevelMan;
    @XmlElement(name = "InterestRefHandles")
    protected DTLead.InterestRefHandles interestRefHandles;
    @XmlElement(name = "InteractionResults")
    protected InteractionResultsType interactionResults;
    @XmlElement(name = "Channel")
    protected String channel;

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
     * Recupera il valore della proprietà externalLeadIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalLeadIds() {
        return externalLeadIds;
    }

    /**
     * Imposta il valore della proprietà externalLeadIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalLeadIds(DTOrderId value) {
        this.externalLeadIds = value;
    }

    /**
     * Recupera il valore della proprietà leadSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSource() {
        return leadSource;
    }

    /**
     * Imposta il valore della proprietà leadSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSource(String value) {
        this.leadSource = value;
    }

    /**
     * Recupera il valore della proprietà leadSubject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSubject() {
        return leadSubject;
    }

    /**
     * Imposta il valore della proprietà leadSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSubject(String value) {
        this.leadSubject = value;
    }

    /**
     * Recupera il valore della proprietà connectDataOrigin.
     * 
     * @return
     *     possible object is
     *     {@link ConnectDataOriginSPType }
     *     
     */
    public ConnectDataOriginSPType getConnectDataOrigin() {
        return connectDataOrigin;
    }

    /**
     * Imposta il valore della proprietà connectDataOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectDataOriginSPType }
     *     
     */
    public void setConnectDataOrigin(ConnectDataOriginSPType value) {
        this.connectDataOrigin = value;
    }

    /**
     * Recupera il valore della proprietà dealerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerID() {
        return dealerID;
    }

    /**
     * Imposta il valore della proprietà dealerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerID(String value) {
        this.dealerID = value;
    }

    /**
     * Recupera il valore della proprietà shopID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopID() {
        return shopID;
    }

    /**
     * Imposta il valore della proprietà shopID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopID(String value) {
        this.shopID = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link DTLead.Partners }
     *     
     */
    public DTLead.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLead.Partners }
     *     
     */
    public void setPartners(DTLead.Partners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link DTLead.Appointments }
     *     
     */
    public DTLead.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLead.Appointments }
     *     
     */
    public void setAppointments(DTLead.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link DTLead.Texts }
     *     
     */
    public DTLead.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLead.Texts }
     *     
     */
    public void setTexts(DTLead.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link DTLead.VehicleRefHandles }
     *     
     */
    public DTLead.VehicleRefHandles getVehicleRefHandles() {
        return vehicleRefHandles;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLead.VehicleRefHandles }
     *     
     */
    public void setVehicleRefHandles(DTLead.VehicleRefHandles value) {
        this.vehicleRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà favoredContact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoredContact() {
        return favoredContact;
    }

    /**
     * Imposta il valore della proprietà favoredContact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoredContact(String value) {
        this.favoredContact = value;
    }

    /**
     * Recupera il valore della proprietà favoredCommType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoredCommType() {
        return favoredCommType;
    }

    /**
     * Imposta il valore della proprietà favoredCommType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoredCommType(String value) {
        this.favoredCommType = value;
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
     * Recupera il valore della proprietà testDrive.
     * 
     * @return
     *     possible object is
     *     {@link DTTestDrive }
     *     
     */
    public DTTestDrive getTestDrive() {
        return testDrive;
    }

    /**
     * Imposta il valore della proprietà testDrive.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTestDrive }
     *     
     */
    public void setTestDrive(DTTestDrive value) {
        this.testDrive = value;
    }

    /**
     * Recupera il valore della proprietà customerWishes.
     * 
     * @return
     *     possible object is
     *     {@link DTCustWish }
     *     
     */
    public DTCustWish getCustomerWishes() {
        return customerWishes;
    }

    /**
     * Imposta il valore della proprietà customerWishes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCustWish }
     *     
     */
    public void setCustomerWishes(DTCustWish value) {
        this.customerWishes = value;
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
     * Recupera il valore della proprietà rubric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubric() {
        return rubric;
    }

    /**
     * Imposta il valore della proprietà rubric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubric(String value) {
        this.rubric = value;
    }

    /**
     * Recupera il valore della proprietà qualLevelMan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualLevelMan() {
        return qualLevelMan;
    }

    /**
     * Imposta il valore della proprietà qualLevelMan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualLevelMan(String value) {
        this.qualLevelMan = value;
    }

    /**
     * Recupera il valore della proprietà interestRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link DTLead.InterestRefHandles }
     *     
     */
    public DTLead.InterestRefHandles getInterestRefHandles() {
        return interestRefHandles;
    }

    /**
     * Imposta il valore della proprietà interestRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLead.InterestRefHandles }
     *     
     */
    public void setInterestRefHandles(DTLead.InterestRefHandles value) {
        this.interestRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà interactionResults.
     * 
     * @return
     *     possible object is
     *     {@link InteractionResultsType }
     *     
     */
    public InteractionResultsType getInteractionResults() {
        return interactionResults;
    }

    /**
     * Imposta il valore della proprietà interactionResults.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionResultsType }
     *     
     */
    public void setInteractionResults(InteractionResultsType value) {
        this.interactionResults = value;
    }

    /**
     * Recupera il valore della proprietà channel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Imposta il valore della proprietà channel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
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
     *         &lt;element name="Appointment" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderAppointmentSP" maxOccurs="unbounded"/>
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
     *         &lt;element name="InterestRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
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
        "interestRefHandle"
    })
    public static class InterestRefHandles {

        @XmlElement(name = "InterestRefHandle")
        protected String interestRefHandle;

        /**
         * Recupera il valore della proprietà interestRefHandle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterestRefHandle() {
            return interestRefHandle;
        }

        /**
         * Imposta il valore della proprietà interestRefHandle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterestRefHandle(String value) {
            this.interestRefHandle = value;
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
