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
 * Data type for Roadside Assistance objects
 * 
 * <p>Classe Java per DT_RoadsideAssistance complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_RoadsideAssistance">
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
 *         &lt;element name="ExternalRSASIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="ExternalCaseNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="Description" minOccurs="0">
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
 *         &lt;element name="SurveyData" type="{http://volkswagen.de/xi/kuba/KISS}DT_Survey" minOccurs="0"/>
 *         &lt;element name="SurveyStructure" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_RoadsideAssistance", propOrder = {
    "method",
    "referenceHandle",
    "externalRSASIds",
    "externalCaseNo",
    "vehicleRefHandle",
    "description",
    "texts",
    "partners",
    "surveyData",
    "surveyStructure"
})
public class DTRoadsideAssistance {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ExternalRSASIds")
    protected DTOrderId externalRSASIds;
    @XmlElement(name = "ExternalCaseNo")
    protected String externalCaseNo;
    @XmlElement(name = "VehicleRefHandle")
    protected String vehicleRefHandle;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Texts")
    protected DTRoadsideAssistance.Texts texts;
    @XmlElement(name = "Partners")
    protected DTRoadsideAssistance.Partners partners;
    @XmlElement(name = "SurveyData")
    protected String surveyData;
    @XmlElement(name = "SurveyStructure")
    protected DTSurveyStructure surveyStructure;

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
     * Recupera il valore della proprietà externalRSASIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalRSASIds() {
        return externalRSASIds;
    }

    /**
     * Imposta il valore della proprietà externalRSASIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalRSASIds(DTOrderId value) {
        this.externalRSASIds = value;
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
     * Recupera il valore della proprietà vehicleRefHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRefHandle() {
        return vehicleRefHandle;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRefHandle(String value) {
        this.vehicleRefHandle = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link DTRoadsideAssistance.Texts }
     *     
     */
    public DTRoadsideAssistance.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRoadsideAssistance.Texts }
     *     
     */
    public void setTexts(DTRoadsideAssistance.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link DTRoadsideAssistance.Partners }
     *     
     */
    public DTRoadsideAssistance.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRoadsideAssistance.Partners }
     *     
     */
    public void setPartners(DTRoadsideAssistance.Partners value) {
        this.partners = value;
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

}
