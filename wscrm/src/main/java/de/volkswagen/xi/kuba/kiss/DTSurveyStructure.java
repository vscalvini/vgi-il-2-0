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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Survey data (hierarchical structure)
 * 
 * <p>Classe Java per DT_SurveyStructure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_SurveyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svyApplicationId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SurveyId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="svySurveyId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="svyVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchemaVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="svySchemaVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="svyLanguage" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage" minOccurs="0"/>
 *         &lt;element name="conid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SurveyItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SurveyItem" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="onInputProcessing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Mode" default="SUBMIT">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="10"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "DT_SurveyStructure", propOrder = {
    "svyApplicationId",
    "surveyId",
    "svySurveyId",
    "svyVersion",
    "schemaVersion",
    "svySchemaVersion",
    "svyLanguage",
    "conid",
    "surveyItems",
    "onInputProcessing"
})
public class DTSurveyStructure {

    protected String svyApplicationId;
    @XmlElement(name = "SurveyId")
    protected String surveyId;
    protected String svySurveyId;
    protected String svyVersion;
    @XmlElement(name = "SchemaVersion")
    protected String schemaVersion;
    protected String svySchemaVersion;
    protected String svyLanguage;
    protected String conid;
    @XmlElement(name = "SurveyItems")
    protected DTSurveyStructure.SurveyItems surveyItems;
    protected DTSurveyStructure.OnInputProcessing onInputProcessing;

    /**
     * Recupera il valore della proprietà svyApplicationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvyApplicationId() {
        return svyApplicationId;
    }

    /**
     * Imposta il valore della proprietà svyApplicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvyApplicationId(String value) {
        this.svyApplicationId = value;
    }

    /**
     * Recupera il valore della proprietà surveyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyId() {
        return surveyId;
    }

    /**
     * Imposta il valore della proprietà surveyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyId(String value) {
        this.surveyId = value;
    }

    /**
     * Recupera il valore della proprietà svySurveyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvySurveyId() {
        return svySurveyId;
    }

    /**
     * Imposta il valore della proprietà svySurveyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvySurveyId(String value) {
        this.svySurveyId = value;
    }

    /**
     * Recupera il valore della proprietà svyVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvyVersion() {
        return svyVersion;
    }

    /**
     * Imposta il valore della proprietà svyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvyVersion(String value) {
        this.svyVersion = value;
    }

    /**
     * Recupera il valore della proprietà schemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Imposta il valore della proprietà schemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Recupera il valore della proprietà svySchemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvySchemaVersion() {
        return svySchemaVersion;
    }

    /**
     * Imposta il valore della proprietà svySchemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvySchemaVersion(String value) {
        this.svySchemaVersion = value;
    }

    /**
     * Recupera il valore della proprietà svyLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvyLanguage() {
        return svyLanguage;
    }

    /**
     * Imposta il valore della proprietà svyLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvyLanguage(String value) {
        this.svyLanguage = value;
    }

    /**
     * Recupera il valore della proprietà conid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConid() {
        return conid;
    }

    /**
     * Imposta il valore della proprietà conid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConid(String value) {
        this.conid = value;
    }

    /**
     * Recupera il valore della proprietà surveyItems.
     * 
     * @return
     *     possible object is
     *     {@link DTSurveyStructure.SurveyItems }
     *     
     */
    public DTSurveyStructure.SurveyItems getSurveyItems() {
        return surveyItems;
    }

    /**
     * Imposta il valore della proprietà surveyItems.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSurveyStructure.SurveyItems }
     *     
     */
    public void setSurveyItems(DTSurveyStructure.SurveyItems value) {
        this.surveyItems = value;
    }

    /**
     * Recupera il valore della proprietà onInputProcessing.
     * 
     * @return
     *     possible object is
     *     {@link DTSurveyStructure.OnInputProcessing }
     *     
     */
    public DTSurveyStructure.OnInputProcessing getOnInputProcessing() {
        return onInputProcessing;
    }

    /**
     * Imposta il valore della proprietà onInputProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSurveyStructure.OnInputProcessing }
     *     
     */
    public void setOnInputProcessing(DTSurveyStructure.OnInputProcessing value) {
        this.onInputProcessing = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Mode" default="SUBMIT">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="10"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class OnInputProcessing {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Mode")
        protected String mode;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà mode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMode() {
            if (mode == null) {
                return "SUBMIT";
            } else {
                return mode;
            }
        }

        /**
         * Imposta il valore della proprietà mode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMode(String value) {
            this.mode = value;
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
     *         &lt;element name="SurveyItem" type="{http://volkswagen.de/xi/kuba/KISS}DT_SurveyItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "surveyItem"
    })
    public static class SurveyItems {

        @XmlElement(name = "SurveyItem")
        protected List<DTSurveyItem> surveyItem;

        /**
         * Gets the value of the surveyItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surveyItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurveyItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTSurveyItem }
         * 
         * 
         */
        public List<DTSurveyItem> getSurveyItem() {
            if (surveyItem == null) {
                surveyItem = new ArrayList<DTSurveyItem>();
            }
            return this.surveyItem;
        }

    }

}
