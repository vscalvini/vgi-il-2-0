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
import javax.xml.bind.annotation.XmlType;


/**
 * Central data of business partners
 * 
 * <p>Classe Java per DT_CentralDataSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_CentralDataSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchTerm1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SearchTerm2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerType" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerType" minOccurs="0"/>
 *         &lt;element name="AuthorizationGroup" type="{http://volkswagen.de/xi/kuba/KISS}DT_AuthorizationGroup" minOccurs="0"/>
 *         &lt;element name="PartnerLanguageISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage" minOccurs="0"/>
 *         &lt;element name="DataOriginType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataOriginType2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataOriginType3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CentralArchivFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CentralBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TitleKey" type="{http://volkswagen.de/xi/kuba/KISS}DT_TitleKey" minOccurs="0"/>
 *         &lt;element name="ContactAllowance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalPartnerNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TitleLetter" type="{http://volkswagen.de/xi/kuba/KISS}DT_TitleLetter" minOccurs="0"/>
 *         &lt;element name="NotReleased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CommunicationType" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationType" minOccurs="0"/>
 *         &lt;element name="TaxData" type="{http://volkswagen.de/xi/kuba/KISS}DT_TaxDataSP" minOccurs="0"/>
 *         &lt;element name="Append" type="{http://volkswagen.de/xi/kuba/KISS}DT_CentralDataAppendSP" minOccurs="0"/>
 *         &lt;element name="CBPModel" type="{http://volkswagen.de/xi/kuba/KISS}DT_CBPModelSP" minOccurs="0"/>
 *         &lt;element name="CommunicationTime" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "DT_CentralDataSP", propOrder = {
    "searchTerm1",
    "searchTerm2",
    "partnerType",
    "authorizationGroup",
    "partnerLanguageISO",
    "dataOriginType",
    "dataOriginType2",
    "dataOriginType3",
    "centralArchivFlag",
    "centralBlock",
    "titleKey",
    "contactAllowance",
    "externalPartnerNo",
    "titleLetter",
    "notReleased",
    "communicationType",
    "taxData",
    "append",
    "cbpModel",
    "communicationTime"
})
public class DTCentralDataSP {

    @XmlElement(name = "SearchTerm1")
    protected String searchTerm1;
    @XmlElement(name = "SearchTerm2")
    protected String searchTerm2;
    @XmlElement(name = "PartnerType")
    protected String partnerType;
    @XmlElement(name = "AuthorizationGroup")
    protected String authorizationGroup;
    @XmlElement(name = "PartnerLanguageISO")
    protected String partnerLanguageISO;
    @XmlElement(name = "DataOriginType")
    protected String dataOriginType;
    @XmlElement(name = "DataOriginType2")
    protected String dataOriginType2;
    @XmlElement(name = "DataOriginType3")
    protected String dataOriginType3;
    @XmlElement(name = "CentralArchivFlag")
    protected Boolean centralArchivFlag;
    @XmlElement(name = "CentralBlock")
    protected Boolean centralBlock;
    @XmlElement(name = "TitleKey")
    protected String titleKey;
    @XmlElement(name = "ContactAllowance")
    protected String contactAllowance;
    @XmlElement(name = "ExternalPartnerNo")
    protected String externalPartnerNo;
    @XmlElement(name = "TitleLetter")
    protected String titleLetter;
    @XmlElement(name = "NotReleased")
    protected Boolean notReleased;
    @XmlElement(name = "CommunicationType")
    protected String communicationType;
    @XmlElement(name = "TaxData")
    protected DTTaxDataSP taxData;
    @XmlElement(name = "Append")
    protected DTCentralDataAppendSP append;
    @XmlElement(name = "CBPModel")
    protected DTCBPModelSP cbpModel;
    @XmlElement(name = "CommunicationTime")
    protected String communicationTime;

    /**
     * Recupera il valore della proprietà searchTerm1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerm1() {
        return searchTerm1;
    }

    /**
     * Imposta il valore della proprietà searchTerm1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerm1(String value) {
        this.searchTerm1 = value;
    }

    /**
     * Recupera il valore della proprietà searchTerm2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerm2() {
        return searchTerm2;
    }

    /**
     * Imposta il valore della proprietà searchTerm2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerm2(String value) {
        this.searchTerm2 = value;
    }

    /**
     * Recupera il valore della proprietà partnerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Imposta il valore della proprietà partnerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
    }

    /**
     * Recupera il valore della proprietà authorizationGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationGroup() {
        return authorizationGroup;
    }

    /**
     * Imposta il valore della proprietà authorizationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationGroup(String value) {
        this.authorizationGroup = value;
    }

    /**
     * Recupera il valore della proprietà partnerLanguageISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerLanguageISO() {
        return partnerLanguageISO;
    }

    /**
     * Imposta il valore della proprietà partnerLanguageISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerLanguageISO(String value) {
        this.partnerLanguageISO = value;
    }

    /**
     * Recupera il valore della proprietà dataOriginType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOriginType() {
        return dataOriginType;
    }

    /**
     * Imposta il valore della proprietà dataOriginType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOriginType(String value) {
        this.dataOriginType = value;
    }

    /**
     * Recupera il valore della proprietà dataOriginType2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOriginType2() {
        return dataOriginType2;
    }

    /**
     * Imposta il valore della proprietà dataOriginType2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOriginType2(String value) {
        this.dataOriginType2 = value;
    }

    /**
     * Recupera il valore della proprietà dataOriginType3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOriginType3() {
        return dataOriginType3;
    }

    /**
     * Imposta il valore della proprietà dataOriginType3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOriginType3(String value) {
        this.dataOriginType3 = value;
    }

    /**
     * Recupera il valore della proprietà centralArchivFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCentralArchivFlag() {
        return centralArchivFlag;
    }

    /**
     * Imposta il valore della proprietà centralArchivFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCentralArchivFlag(Boolean value) {
        this.centralArchivFlag = value;
    }

    /**
     * Recupera il valore della proprietà centralBlock.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCentralBlock() {
        return centralBlock;
    }

    /**
     * Imposta il valore della proprietà centralBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCentralBlock(Boolean value) {
        this.centralBlock = value;
    }

    /**
     * Recupera il valore della proprietà titleKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleKey() {
        return titleKey;
    }

    /**
     * Imposta il valore della proprietà titleKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleKey(String value) {
        this.titleKey = value;
    }

    /**
     * Recupera il valore della proprietà contactAllowance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAllowance() {
        return contactAllowance;
    }

    /**
     * Imposta il valore della proprietà contactAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAllowance(String value) {
        this.contactAllowance = value;
    }

    /**
     * Recupera il valore della proprietà externalPartnerNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPartnerNo() {
        return externalPartnerNo;
    }

    /**
     * Imposta il valore della proprietà externalPartnerNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPartnerNo(String value) {
        this.externalPartnerNo = value;
    }

    /**
     * Recupera il valore della proprietà titleLetter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleLetter() {
        return titleLetter;
    }

    /**
     * Imposta il valore della proprietà titleLetter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleLetter(String value) {
        this.titleLetter = value;
    }

    /**
     * Recupera il valore della proprietà notReleased.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotReleased() {
        return notReleased;
    }

    /**
     * Imposta il valore della proprietà notReleased.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotReleased(Boolean value) {
        this.notReleased = value;
    }

    /**
     * Recupera il valore della proprietà communicationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationType() {
        return communicationType;
    }

    /**
     * Imposta il valore della proprietà communicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationType(String value) {
        this.communicationType = value;
    }

    /**
     * Recupera il valore della proprietà taxData.
     * 
     * @return
     *     possible object is
     *     {@link DTTaxDataSP }
     *     
     */
    public DTTaxDataSP getTaxData() {
        return taxData;
    }

    /**
     * Imposta il valore della proprietà taxData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTaxDataSP }
     *     
     */
    public void setTaxData(DTTaxDataSP value) {
        this.taxData = value;
    }

    /**
     * Recupera il valore della proprietà append.
     * 
     * @return
     *     possible object is
     *     {@link DTCentralDataAppendSP }
     *     
     */
    public DTCentralDataAppendSP getAppend() {
        return append;
    }

    /**
     * Imposta il valore della proprietà append.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCentralDataAppendSP }
     *     
     */
    public void setAppend(DTCentralDataAppendSP value) {
        this.append = value;
    }

    /**
     * Recupera il valore della proprietà cbpModel.
     * 
     * @return
     *     possible object is
     *     {@link DTCBPModelSP }
     *     
     */
    public DTCBPModelSP getCBPModel() {
        return cbpModel;
    }

    /**
     * Imposta il valore della proprietà cbpModel.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCBPModelSP }
     *     
     */
    public void setCBPModel(DTCBPModelSP value) {
        this.cbpModel = value;
    }

    /**
     * Recupera il valore della proprietà communicationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationTime() {
        return communicationTime;
    }

    /**
     * Imposta il valore della proprietà communicationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationTime(String value) {
        this.communicationTime = value;
    }

}
