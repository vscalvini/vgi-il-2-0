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
 * Campaign response data
 * 
 * <p>Classe Java per DT_Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Response">
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
 *         &lt;element name="BouncedData" type="{http://volkswagen.de/xi/kuba/KISS}DT_BouncedData" minOccurs="0"/>
 *         &lt;element name="Archieving" type="{http://volkswagen.de/xi/kuba/KISS}DT_ArchivingData" minOccurs="0"/>
 *         &lt;element name="ProcessType" type="{http://volkswagen.de/xi/kuba/KISS}DT_ProcessType" minOccurs="0"/>
 *         &lt;element name="ConnectDataOrigin" type="{http://volkswagen.de/xi/kuba/KISS}ConnectDataOriginSPType"/>
 *         &lt;element name="ExternalCaseNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalResponseIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="ExternalParentIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="SurveyData" type="{http://volkswagen.de/xi/kuba/KISS}DT_Survey" minOccurs="0"/>
 *         &lt;element name="SurveyStructure" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyStructure" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
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
 *         &lt;element name="CallingAttempts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CampaignElement" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignElement" minOccurs="0"/>
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
 *         &lt;element name="Concretions" type="{http://volkswagen.de/xi/kuba/KISS}DT_Concretions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Response", propOrder = {
    "method",
    "referenceHandle",
    "bouncedData",
    "archieving",
    "processType",
    "connectDataOrigin",
    "externalCaseNo",
    "externalResponseIds",
    "externalParentIds",
    "surveyData",
    "surveyStructure",
    "status",
    "appointments",
    "texts",
    "callingAttempts",
    "campaignElement",
    "interestRefHandles",
    "concretions"
})
public class DTResponse {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "BouncedData")
    protected DTBouncedData bouncedData;
    @XmlElement(name = "Archieving")
    protected DTArchivingData archieving;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "ConnectDataOrigin", required = true)
    protected ConnectDataOriginSPType connectDataOrigin;
    @XmlElement(name = "ExternalCaseNo")
    protected String externalCaseNo;
    @XmlElement(name = "ExternalResponseIds")
    protected DTOrderId externalResponseIds;
    @XmlElement(name = "ExternalParentIds")
    protected DTOrderId externalParentIds;
    @XmlElement(name = "SurveyData")
    protected String surveyData;
    @XmlElement(name = "SurveyStructure")
    protected DTSurveyStructure surveyStructure;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "Appointments")
    protected DTResponse.Appointments appointments;
    @XmlElement(name = "Texts")
    protected DTResponse.Texts texts;
    @XmlElement(name = "CallingAttempts")
    protected String callingAttempts;
    @XmlElement(name = "CampaignElement")
    protected String campaignElement;
    @XmlElement(name = "InterestRefHandles")
    protected DTResponse.InterestRefHandles interestRefHandles;
    @XmlElement(name = "Concretions")
    protected DTConcretions concretions;

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
     * Recupera il valore della proprietà bouncedData.
     * 
     * @return
     *     possible object is
     *     {@link DTBouncedData }
     *     
     */
    public DTBouncedData getBouncedData() {
        return bouncedData;
    }

    /**
     * Imposta il valore della proprietà bouncedData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBouncedData }
     *     
     */
    public void setBouncedData(DTBouncedData value) {
        this.bouncedData = value;
    }

    /**
     * Recupera il valore della proprietà archieving.
     * 
     * @return
     *     possible object is
     *     {@link DTArchivingData }
     *     
     */
    public DTArchivingData getArchieving() {
        return archieving;
    }

    /**
     * Imposta il valore della proprietà archieving.
     * 
     * @param value
     *     allowed object is
     *     {@link DTArchivingData }
     *     
     */
    public void setArchieving(DTArchivingData value) {
        this.archieving = value;
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
     * Recupera il valore della proprietà externalResponseIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalResponseIds() {
        return externalResponseIds;
    }

    /**
     * Imposta il valore della proprietà externalResponseIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalResponseIds(DTOrderId value) {
        this.externalResponseIds = value;
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
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link DTResponse.Appointments }
     *     
     */
    public DTResponse.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link DTResponse.Appointments }
     *     
     */
    public void setAppointments(DTResponse.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link DTResponse.Texts }
     *     
     */
    public DTResponse.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link DTResponse.Texts }
     *     
     */
    public void setTexts(DTResponse.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà callingAttempts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingAttempts() {
        return callingAttempts;
    }

    /**
     * Imposta il valore della proprietà callingAttempts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingAttempts(String value) {
        this.callingAttempts = value;
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
     * Recupera il valore della proprietà interestRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link DTResponse.InterestRefHandles }
     *     
     */
    public DTResponse.InterestRefHandles getInterestRefHandles() {
        return interestRefHandles;
    }

    /**
     * Imposta il valore della proprietà interestRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link DTResponse.InterestRefHandles }
     *     
     */
    public void setInterestRefHandles(DTResponse.InterestRefHandles value) {
        this.interestRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà concretions.
     * 
     * @return
     *     possible object is
     *     {@link DTConcretions }
     *     
     */
    public DTConcretions getConcretions() {
        return concretions;
    }

    /**
     * Imposta il valore della proprietà concretions.
     * 
     * @param value
     *     allowed object is
     *     {@link DTConcretions }
     *     
     */
    public void setConcretions(DTConcretions value) {
        this.concretions = value;
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

}
