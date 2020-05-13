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


/**
 * Data of brochure bundles
 * 
 * <p>Classe Java per DT_BrochureOrder complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BrochureOrder">
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
 *         &lt;element name="CampaignElement" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignElement" minOccurs="0"/>
 *         &lt;element name="ExternalCaseNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalParentIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="BrochureBundleNames" type="{http://volkswagen.de/xi/kuba/KISS}DT_BrochureBundleSP" minOccurs="0"/>
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
 *         &lt;element name="ShippingAddress" type="{http://volkswagen.de/xi/kuba/KISS}DT_ShippingAddress" minOccurs="0"/>
 *         &lt;element name="SurveyData" type="{http://volkswagen.de/xi/kuba/KISS}DT_Survey" minOccurs="0"/>
 *         &lt;element name="SurveyStructure" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyStructure" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BrochureOrder", propOrder = {
    "method",
    "referenceHandle",
    "processType",
    "campaignElement",
    "externalCaseNo",
    "externalParentIds",
    "brochureBundleNames",
    "partners",
    "shippingAddress",
    "surveyData",
    "surveyStructure",
    "status"
})
public class DTBrochureOrder {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "CampaignElement")
    protected String campaignElement;
    @XmlElement(name = "ExternalCaseNo")
    protected String externalCaseNo;
    @XmlElement(name = "ExternalParentIds")
    protected DTOrderId externalParentIds;
    @XmlElement(name = "BrochureBundleNames")
    protected DTBrochureBundleSP brochureBundleNames;
    @XmlElement(name = "Partners")
    protected DTBrochureOrder.Partners partners;
    @XmlElement(name = "ShippingAddress")
    protected DTShippingAddress shippingAddress;
    @XmlElement(name = "SurveyData")
    protected String surveyData;
    @XmlElement(name = "SurveyStructure")
    protected DTSurveyStructure surveyStructure;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;

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
     * Recupera il valore della proprietà brochureBundleNames.
     * 
     * @return
     *     possible object is
     *     {@link DTBrochureBundleSP }
     *     
     */
    public DTBrochureBundleSP getBrochureBundleNames() {
        return brochureBundleNames;
    }

    /**
     * Imposta il valore della proprietà brochureBundleNames.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBrochureBundleSP }
     *     
     */
    public void setBrochureBundleNames(DTBrochureBundleSP value) {
        this.brochureBundleNames = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link DTBrochureOrder.Partners }
     *     
     */
    public DTBrochureOrder.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBrochureOrder.Partners }
     *     
     */
    public void setPartners(DTBrochureOrder.Partners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà shippingAddress.
     * 
     * @return
     *     possible object is
     *     {@link DTShippingAddress }
     *     
     */
    public DTShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Imposta il valore della proprietà shippingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link DTShippingAddress }
     *     
     */
    public void setShippingAddress(DTShippingAddress value) {
        this.shippingAddress = value;
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

}
