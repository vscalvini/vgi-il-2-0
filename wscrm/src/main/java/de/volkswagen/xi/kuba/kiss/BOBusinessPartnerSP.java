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
import com.volkswagenag.xmldefs.dd.businesspartner.MarketingAllowancesType;


/**
 * Business partner data
 * 
 * <p>Classe Java per BO_BusinessPartnerSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BO_BusinessPartnerSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerId" type="{http://volkswagen.de/xi/kuba/KISS}DT_BusinessPartnerId" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerGuid" type="{http://volkswagen.de/xi/kuba/KISS}DT_Guid32" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerType" type="{http://volkswagen.de/xi/kuba/KISS}DT_BusinessPartnerType" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerGroup" type="{http://volkswagen.de/xi/kuba/KISS}DT_BusinessPartnerGroup" minOccurs="0"/>
 *         &lt;element name="CentralData" type="{http://volkswagen.de/xi/kuba/KISS}DT_CentralDataSP" minOccurs="0"/>
 *         &lt;element name="PartnerPerson" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerPersonSP" minOccurs="0"/>
 *         &lt;element name="PartnerOrganisation" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerOrganizationSP" minOccurs="0"/>
 *         &lt;element name="AdditionalData" type="{http://volkswagen.de/xi/kuba/KISS}DT_AdditionalBPData" minOccurs="0"/>
 *         &lt;element name="Addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CommunicationChannels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommunicationChannel" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationChannelSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SalesClassification" type="{http://volkswagen.de/xi/kuba/KISS}DT_SalesClassificationSP" minOccurs="0"/>
 *         &lt;element name="Identifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification" type="{http://volkswagen.de/xi/kuba/KISS}DT_Identification" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Role" type="{http://volkswagen.de/xi/kuba/KISS}DT_RoleLine" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarketingProfile" type="{http://volkswagen.de/xi/kuba/KISS}DT_MarketingProfile" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InterestCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InterestCategory" type="{http://volkswagen.de/xi/kuba/KISS}DT_InterestCategory" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="BankArrangements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BankArrangement" type="{http://volkswagen.de/xi/kuba/KISS}DT_BankingArrangementSP" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentCards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentCard" type="{http://volkswagen.de/xi/kuba/KISS}DT_PaymentCardSP" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TargetGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TargetGroup" type="{http://volkswagen.de/xi/kuba/KISS}DT_TargetGroup" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingAllowances" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}MarketingAllowancesType" minOccurs="0"/>
 *         &lt;element name="VIPData" type="{http://volkswagen.de/xi/kuba/KISS}VIPDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BO_BusinessPartnerSP", propOrder = {
    "referenceHandle",
    "businessPartnerId",
    "businessPartnerGuid",
    "businessPartnerType",
    "businessPartnerGroup",
    "centralData",
    "partnerPerson",
    "partnerOrganisation",
    "additionalData",
    "addresses",
    "communicationChannels",
    "salesClassification",
    "identifications",
    "roles",
    "marketingProfiles",
    "interestCategories",
    "texts",
    "bankArrangements",
    "paymentCards",
    "targetGroups",
    "marketingAllowances",
    "vipData"
})
public class BOBusinessPartnerSP {

    @XmlElement(name = "ReferenceHandle")
    protected String referenceHandle;
    @XmlElement(name = "BusinessPartnerId")
    protected String businessPartnerId;
    @XmlElement(name = "BusinessPartnerGuid")
    protected String businessPartnerGuid;
    @XmlElement(name = "BusinessPartnerType")
    protected String businessPartnerType;
    @XmlElement(name = "BusinessPartnerGroup")
    protected String businessPartnerGroup;
    @XmlElement(name = "CentralData")
    protected DTCentralDataSP centralData;
    @XmlElement(name = "PartnerPerson")
    protected DTPartnerPersonSP partnerPerson;
    @XmlElement(name = "PartnerOrganisation")
    protected DTPartnerOrganizationSP partnerOrganisation;
    @XmlElement(name = "AdditionalData")
    protected DTAdditionalBPData additionalData;
    @XmlElement(name = "Addresses")
    protected BOBusinessPartnerSP.Addresses addresses;
    @XmlElement(name = "CommunicationChannels")
    protected BOBusinessPartnerSP.CommunicationChannels communicationChannels;
    @XmlElement(name = "SalesClassification")
    protected DTSalesClassificationSP salesClassification;
    @XmlElement(name = "Identifications")
    protected BOBusinessPartnerSP.Identifications identifications;
    @XmlElement(name = "Roles")
    protected BOBusinessPartnerSP.Roles roles;
    @XmlElement(name = "MarketingProfiles")
    protected BOBusinessPartnerSP.MarketingProfiles marketingProfiles;
    @XmlElement(name = "InterestCategories")
    protected BOBusinessPartnerSP.InterestCategories interestCategories;
    @XmlElement(name = "Texts")
    protected BOBusinessPartnerSP.Texts texts;
    @XmlElement(name = "BankArrangements")
    protected BOBusinessPartnerSP.BankArrangements bankArrangements;
    @XmlElement(name = "PaymentCards")
    protected BOBusinessPartnerSP.PaymentCards paymentCards;
    @XmlElement(name = "TargetGroups")
    protected BOBusinessPartnerSP.TargetGroups targetGroups;
    @XmlElement(name = "MarketingAllowances")
    protected MarketingAllowancesType marketingAllowances;
    @XmlElement(name = "VIPData")
    protected VIPDataType vipData;

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
     * Recupera il valore della proprietà businessPartnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerId() {
        return businessPartnerId;
    }

    /**
     * Imposta il valore della proprietà businessPartnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerId(String value) {
        this.businessPartnerId = value;
    }

    /**
     * Recupera il valore della proprietà businessPartnerGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerGuid() {
        return businessPartnerGuid;
    }

    /**
     * Imposta il valore della proprietà businessPartnerGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerGuid(String value) {
        this.businessPartnerGuid = value;
    }

    /**
     * Recupera il valore della proprietà businessPartnerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerType() {
        return businessPartnerType;
    }

    /**
     * Imposta il valore della proprietà businessPartnerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerType(String value) {
        this.businessPartnerType = value;
    }

    /**
     * Recupera il valore della proprietà businessPartnerGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerGroup() {
        return businessPartnerGroup;
    }

    /**
     * Imposta il valore della proprietà businessPartnerGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerGroup(String value) {
        this.businessPartnerGroup = value;
    }

    /**
     * Recupera il valore della proprietà centralData.
     * 
     * @return
     *     possible object is
     *     {@link DTCentralDataSP }
     *     
     */
    public DTCentralDataSP getCentralData() {
        return centralData;
    }

    /**
     * Imposta il valore della proprietà centralData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCentralDataSP }
     *     
     */
    public void setCentralData(DTCentralDataSP value) {
        this.centralData = value;
    }

    /**
     * Recupera il valore della proprietà partnerPerson.
     * 
     * @return
     *     possible object is
     *     {@link DTPartnerPersonSP }
     *     
     */
    public DTPartnerPersonSP getPartnerPerson() {
        return partnerPerson;
    }

    /**
     * Imposta il valore della proprietà partnerPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPartnerPersonSP }
     *     
     */
    public void setPartnerPerson(DTPartnerPersonSP value) {
        this.partnerPerson = value;
    }

    /**
     * Recupera il valore della proprietà partnerOrganisation.
     * 
     * @return
     *     possible object is
     *     {@link DTPartnerOrganizationSP }
     *     
     */
    public DTPartnerOrganizationSP getPartnerOrganisation() {
        return partnerOrganisation;
    }

    /**
     * Imposta il valore della proprietà partnerOrganisation.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPartnerOrganizationSP }
     *     
     */
    public void setPartnerOrganisation(DTPartnerOrganizationSP value) {
        this.partnerOrganisation = value;
    }

    /**
     * Recupera il valore della proprietà additionalData.
     * 
     * @return
     *     possible object is
     *     {@link DTAdditionalBPData }
     *     
     */
    public DTAdditionalBPData getAdditionalData() {
        return additionalData;
    }

    /**
     * Imposta il valore della proprietà additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link DTAdditionalBPData }
     *     
     */
    public void setAdditionalData(DTAdditionalBPData value) {
        this.additionalData = value;
    }

    /**
     * Recupera il valore della proprietà addresses.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.Addresses }
     *     
     */
    public BOBusinessPartnerSP.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Imposta il valore della proprietà addresses.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.Addresses }
     *     
     */
    public void setAddresses(BOBusinessPartnerSP.Addresses value) {
        this.addresses = value;
    }

    /**
     * Recupera il valore della proprietà communicationChannels.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.CommunicationChannels }
     *     
     */
    public BOBusinessPartnerSP.CommunicationChannels getCommunicationChannels() {
        return communicationChannels;
    }

    /**
     * Imposta il valore della proprietà communicationChannels.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.CommunicationChannels }
     *     
     */
    public void setCommunicationChannels(BOBusinessPartnerSP.CommunicationChannels value) {
        this.communicationChannels = value;
    }

    /**
     * Recupera il valore della proprietà salesClassification.
     * 
     * @return
     *     possible object is
     *     {@link DTSalesClassificationSP }
     *     
     */
    public DTSalesClassificationSP getSalesClassification() {
        return salesClassification;
    }

    /**
     * Imposta il valore della proprietà salesClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSalesClassificationSP }
     *     
     */
    public void setSalesClassification(DTSalesClassificationSP value) {
        this.salesClassification = value;
    }

    /**
     * Recupera il valore della proprietà identifications.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.Identifications }
     *     
     */
    public BOBusinessPartnerSP.Identifications getIdentifications() {
        return identifications;
    }

    /**
     * Imposta il valore della proprietà identifications.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.Identifications }
     *     
     */
    public void setIdentifications(BOBusinessPartnerSP.Identifications value) {
        this.identifications = value;
    }

    /**
     * Recupera il valore della proprietà roles.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.Roles }
     *     
     */
    public BOBusinessPartnerSP.Roles getRoles() {
        return roles;
    }

    /**
     * Imposta il valore della proprietà roles.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.Roles }
     *     
     */
    public void setRoles(BOBusinessPartnerSP.Roles value) {
        this.roles = value;
    }

    /**
     * Recupera il valore della proprietà marketingProfiles.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.MarketingProfiles }
     *     
     */
    public BOBusinessPartnerSP.MarketingProfiles getMarketingProfiles() {
        return marketingProfiles;
    }

    /**
     * Imposta il valore della proprietà marketingProfiles.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.MarketingProfiles }
     *     
     */
    public void setMarketingProfiles(BOBusinessPartnerSP.MarketingProfiles value) {
        this.marketingProfiles = value;
    }

    /**
     * Recupera il valore della proprietà interestCategories.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.InterestCategories }
     *     
     */
    public BOBusinessPartnerSP.InterestCategories getInterestCategories() {
        return interestCategories;
    }

    /**
     * Imposta il valore della proprietà interestCategories.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.InterestCategories }
     *     
     */
    public void setInterestCategories(BOBusinessPartnerSP.InterestCategories value) {
        this.interestCategories = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.Texts }
     *     
     */
    public BOBusinessPartnerSP.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.Texts }
     *     
     */
    public void setTexts(BOBusinessPartnerSP.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà bankArrangements.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.BankArrangements }
     *     
     */
    public BOBusinessPartnerSP.BankArrangements getBankArrangements() {
        return bankArrangements;
    }

    /**
     * Imposta il valore della proprietà bankArrangements.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.BankArrangements }
     *     
     */
    public void setBankArrangements(BOBusinessPartnerSP.BankArrangements value) {
        this.bankArrangements = value;
    }

    /**
     * Recupera il valore della proprietà paymentCards.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.PaymentCards }
     *     
     */
    public BOBusinessPartnerSP.PaymentCards getPaymentCards() {
        return paymentCards;
    }

    /**
     * Imposta il valore della proprietà paymentCards.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.PaymentCards }
     *     
     */
    public void setPaymentCards(BOBusinessPartnerSP.PaymentCards value) {
        this.paymentCards = value;
    }

    /**
     * Recupera il valore della proprietà targetGroups.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP.TargetGroups }
     *     
     */
    public BOBusinessPartnerSP.TargetGroups getTargetGroups() {
        return targetGroups;
    }

    /**
     * Imposta il valore della proprietà targetGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP.TargetGroups }
     *     
     */
    public void setTargetGroups(BOBusinessPartnerSP.TargetGroups value) {
        this.targetGroups = value;
    }

    /**
     * Recupera il valore della proprietà marketingAllowances.
     * 
     * @return
     *     possible object is
     *     {@link MarketingAllowancesType }
     *     
     */
    public MarketingAllowancesType getMarketingAllowances() {
        return marketingAllowances;
    }

    /**
     * Imposta il valore della proprietà marketingAllowances.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAllowancesType }
     *     
     */
    public void setMarketingAllowances(MarketingAllowancesType value) {
        this.marketingAllowances = value;
    }

    /**
     * Recupera il valore della proprietà vipData.
     * 
     * @return
     *     possible object is
     *     {@link VIPDataType }
     *     
     */
    public VIPDataType getVIPData() {
        return vipData;
    }

    /**
     * Imposta il valore della proprietà vipData.
     * 
     * @param value
     *     allowed object is
     *     {@link VIPDataType }
     *     
     */
    public void setVIPData(VIPDataType value) {
        this.vipData = value;
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
     *         &lt;element name="Address" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressSP" maxOccurs="unbounded" minOccurs="0"/>
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address")
        protected List<DTAddressSP> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTAddressSP }
         * 
         * 
         */
        public List<DTAddressSP> getAddress() {
            if (address == null) {
                address = new ArrayList<DTAddressSP>();
            }
            return this.address;
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
     *         &lt;element name="BankArrangement" type="{http://volkswagen.de/xi/kuba/KISS}DT_BankingArrangementSP" minOccurs="0"/>
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
        "bankArrangement"
    })
    public static class BankArrangements {

        @XmlElement(name = "BankArrangement")
        protected DTBankingArrangementSP bankArrangement;

        /**
         * Recupera il valore della proprietà bankArrangement.
         * 
         * @return
         *     possible object is
         *     {@link DTBankingArrangementSP }
         *     
         */
        public DTBankingArrangementSP getBankArrangement() {
            return bankArrangement;
        }

        /**
         * Imposta il valore della proprietà bankArrangement.
         * 
         * @param value
         *     allowed object is
         *     {@link DTBankingArrangementSP }
         *     
         */
        public void setBankArrangement(DTBankingArrangementSP value) {
            this.bankArrangement = value;
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
     *         &lt;element name="CommunicationChannel" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationChannelSP" maxOccurs="unbounded" minOccurs="0"/>
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
        "communicationChannel"
    })
    public static class CommunicationChannels {

        @XmlElement(name = "CommunicationChannel")
        protected List<DTCommunicationChannelSP> communicationChannel;

        /**
         * Gets the value of the communicationChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the communicationChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommunicationChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTCommunicationChannelSP }
         * 
         * 
         */
        public List<DTCommunicationChannelSP> getCommunicationChannel() {
            if (communicationChannel == null) {
                communicationChannel = new ArrayList<DTCommunicationChannelSP>();
            }
            return this.communicationChannel;
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
     *         &lt;element name="Identification" type="{http://volkswagen.de/xi/kuba/KISS}DT_Identification" maxOccurs="unbounded" minOccurs="0"/>
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
        "identification"
    })
    public static class Identifications {

        @XmlElement(name = "Identification")
        protected List<DTIdentification> identification;

        /**
         * Gets the value of the identification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTIdentification }
         * 
         * 
         */
        public List<DTIdentification> getIdentification() {
            if (identification == null) {
                identification = new ArrayList<DTIdentification>();
            }
            return this.identification;
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
     *         &lt;element name="InterestCategory" type="{http://volkswagen.de/xi/kuba/KISS}DT_InterestCategory" maxOccurs="unbounded" minOccurs="0"/>
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
        "interestCategory"
    })
    public static class InterestCategories {

        @XmlElement(name = "InterestCategory")
        protected List<DTInterestCategory> interestCategory;

        /**
         * Gets the value of the interestCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interestCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterestCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTInterestCategory }
         * 
         * 
         */
        public List<DTInterestCategory> getInterestCategory() {
            if (interestCategory == null) {
                interestCategory = new ArrayList<DTInterestCategory>();
            }
            return this.interestCategory;
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
     *         &lt;element name="MarketingProfile" type="{http://volkswagen.de/xi/kuba/KISS}DT_MarketingProfile" maxOccurs="unbounded" minOccurs="0"/>
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
        "marketingProfile"
    })
    public static class MarketingProfiles {

        @XmlElement(name = "MarketingProfile")
        protected List<DTMarketingProfile> marketingProfile;

        /**
         * Gets the value of the marketingProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marketingProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarketingProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTMarketingProfile }
         * 
         * 
         */
        public List<DTMarketingProfile> getMarketingProfile() {
            if (marketingProfile == null) {
                marketingProfile = new ArrayList<DTMarketingProfile>();
            }
            return this.marketingProfile;
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
     *         &lt;element name="PaymentCard" type="{http://volkswagen.de/xi/kuba/KISS}DT_PaymentCardSP" minOccurs="0"/>
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
        "paymentCard"
    })
    public static class PaymentCards {

        @XmlElement(name = "PaymentCard")
        protected DTPaymentCardSP paymentCard;

        /**
         * Recupera il valore della proprietà paymentCard.
         * 
         * @return
         *     possible object is
         *     {@link DTPaymentCardSP }
         *     
         */
        public DTPaymentCardSP getPaymentCard() {
            return paymentCard;
        }

        /**
         * Imposta il valore della proprietà paymentCard.
         * 
         * @param value
         *     allowed object is
         *     {@link DTPaymentCardSP }
         *     
         */
        public void setPaymentCard(DTPaymentCardSP value) {
            this.paymentCard = value;
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
     *         &lt;element name="Role" type="{http://volkswagen.de/xi/kuba/KISS}DT_RoleLine" maxOccurs="unbounded" minOccurs="0"/>
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
        "role"
    })
    public static class Roles {

        @XmlElement(name = "Role")
        protected List<DTRoleLine> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTRoleLine }
         * 
         * 
         */
        public List<DTRoleLine> getRole() {
            if (role == null) {
                role = new ArrayList<DTRoleLine>();
            }
            return this.role;
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
     *         &lt;element name="TargetGroup" type="{http://volkswagen.de/xi/kuba/KISS}DT_TargetGroup" maxOccurs="unbounded"/>
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
        "targetGroup"
    })
    public static class TargetGroups {

        @XmlElement(name = "TargetGroup", required = true)
        protected List<DTTargetGroup> targetGroup;

        /**
         * Gets the value of the targetGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTTargetGroup }
         * 
         * 
         */
        public List<DTTargetGroup> getTargetGroup() {
            if (targetGroup == null) {
                targetGroup = new ArrayList<DTTargetGroup>();
            }
            return this.targetGroup;
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
