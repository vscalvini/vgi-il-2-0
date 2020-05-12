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
 * Contact notification
 * 
 * <p>Classe Java per DT_ContactSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ContactSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControlData" type="{http://volkswagen.de/xi/kuba/KISS}BO_ControlDataSP"/>
 *         &lt;element name="BusinessPartners">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessPartner" type="{http://volkswagen.de/xi/kuba/KISS}BO_BusinessPartnersSP" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PartnerRelations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartnerRelation" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerRelationSP" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicles" type="{http://volkswagen.de/xi/kuba/KISS}BO_VehiclesSP" minOccurs="0"/>
 *         &lt;element name="Interests" type="{http://volkswagen.de/xi/kuba/KISS}DT_InterestsSP" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://volkswagen.de/xi/kuba/KISS}DT_ContactType" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{http://volkswagen.de/xi/kuba/KISS}DT_Transaction" minOccurs="0"/>
 *         &lt;element name="BrochureOrders" type="{http://volkswagen.de/xi/kuba/KISS}DT_BrochureOrders" minOccurs="0"/>
 *         &lt;element name="Requests" type="{http://volkswagen.de/xi/kuba/KISS}DT_Requests" minOccurs="0"/>
 *         &lt;element name="CampaignResponses" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignResponses" minOccurs="0"/>
 *         &lt;element name="Leads" type="{http://volkswagen.de/xi/kuba/KISS}DT_Leads" minOccurs="0"/>
 *         &lt;element name="RoadsideAssistances" type="{http://volkswagen.de/xi/kuba/KISS}DT_RoadsideAssistances" minOccurs="0"/>
 *         &lt;element name="VehicleSalesOrders" type="{http://volkswagen.de/xi/kuba/KISS}VehicleSalesOrdersType" minOccurs="0"/>
 *         &lt;element name="CourseOrders" type="{http://volkswagen.de/xi/kuba/KISS}CourseOrdersType" minOccurs="0"/>
 *         &lt;element name="MarketingContacts" type="{http://volkswagen.de/xi/kuba/KISS}MarketingContactsType" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://volkswagen.de/xi/kuba/KISS}ProductsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ContactSP", propOrder = {
    "controlData",
    "businessPartners",
    "partnerRelations",
    "vehicles",
    "interests",
    "contact",
    "transaction",
    "brochureOrders",
    "requests",
    "campaignResponses",
    "leads",
    "roadsideAssistances",
    "vehicleSalesOrders",
    "courseOrders",
    "marketingContacts",
    "products"
})
public class DTContactSP {

    @XmlElement(name = "ControlData", required = true)
    protected BOControlDataSP controlData;
    @XmlElement(name = "BusinessPartners", required = true)
    protected DTContactSP.BusinessPartners businessPartners;
    @XmlElement(name = "PartnerRelations")
    protected DTContactSP.PartnerRelations partnerRelations;
    @XmlElement(name = "Vehicles")
    protected BOVehiclesSP vehicles;
    @XmlElement(name = "Interests")
    protected DTInterestsSP interests;
    @XmlElement(name = "Contact")
    protected DTContactType contact;
    @XmlElement(name = "Transaction")
    protected DTTransaction transaction;
    @XmlElement(name = "BrochureOrders")
    protected DTBrochureOrders brochureOrders;
    @XmlElement(name = "Requests")
    protected DTRequests requests;
    @XmlElement(name = "CampaignResponses")
    protected DTCampaignResponses campaignResponses;
    @XmlElement(name = "Leads")
    protected DTLeads leads;
    @XmlElement(name = "RoadsideAssistances")
    protected DTRoadsideAssistances roadsideAssistances;
    @XmlElement(name = "VehicleSalesOrders")
    protected VehicleSalesOrdersType vehicleSalesOrders;
    @XmlElement(name = "CourseOrders")
    protected CourseOrdersType courseOrders;
    @XmlElement(name = "MarketingContacts")
    protected MarketingContactsType marketingContacts;
    @XmlElement(name = "Products")
    protected ProductsType products;

    /**
     * Recupera il valore della proprietà controlData.
     * 
     * @return
     *     possible object is
     *     {@link BOControlDataSP }
     *     
     */
    public BOControlDataSP getControlData() {
        return controlData;
    }

    /**
     * Imposta il valore della proprietà controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link BOControlDataSP }
     *     
     */
    public void setControlData(BOControlDataSP value) {
        this.controlData = value;
    }

    /**
     * Recupera il valore della proprietà businessPartners.
     * 
     * @return
     *     possible object is
     *     {@link DTContactSP.BusinessPartners }
     *     
     */
    public DTContactSP.BusinessPartners getBusinessPartners() {
        return businessPartners;
    }

    /**
     * Imposta il valore della proprietà businessPartners.
     * 
     * @param value
     *     allowed object is
     *     {@link DTContactSP.BusinessPartners }
     *     
     */
    public void setBusinessPartners(DTContactSP.BusinessPartners value) {
        this.businessPartners = value;
    }

    /**
     * Recupera il valore della proprietà partnerRelations.
     * 
     * @return
     *     possible object is
     *     {@link DTContactSP.PartnerRelations }
     *     
     */
    public DTContactSP.PartnerRelations getPartnerRelations() {
        return partnerRelations;
    }

    /**
     * Imposta il valore della proprietà partnerRelations.
     * 
     * @param value
     *     allowed object is
     *     {@link DTContactSP.PartnerRelations }
     *     
     */
    public void setPartnerRelations(DTContactSP.PartnerRelations value) {
        this.partnerRelations = value;
    }

    /**
     * Recupera il valore della proprietà vehicles.
     * 
     * @return
     *     possible object is
     *     {@link BOVehiclesSP }
     *     
     */
    public BOVehiclesSP getVehicles() {
        return vehicles;
    }

    /**
     * Imposta il valore della proprietà vehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link BOVehiclesSP }
     *     
     */
    public void setVehicles(BOVehiclesSP value) {
        this.vehicles = value;
    }

    /**
     * Recupera il valore della proprietà interests.
     * 
     * @return
     *     possible object is
     *     {@link DTInterestsSP }
     *     
     */
    public DTInterestsSP getInterests() {
        return interests;
    }

    /**
     * Imposta il valore della proprietà interests.
     * 
     * @param value
     *     allowed object is
     *     {@link DTInterestsSP }
     *     
     */
    public void setInterests(DTInterestsSP value) {
        this.interests = value;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link DTContactType }
     *     
     */
    public DTContactType getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link DTContactType }
     *     
     */
    public void setContact(DTContactType value) {
        this.contact = value;
    }

    /**
     * Recupera il valore della proprietà transaction.
     * 
     * @return
     *     possible object is
     *     {@link DTTransaction }
     *     
     */
    public DTTransaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTransaction }
     *     
     */
    public void setTransaction(DTTransaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà brochureOrders.
     * 
     * @return
     *     possible object is
     *     {@link DTBrochureOrders }
     *     
     */
    public DTBrochureOrders getBrochureOrders() {
        return brochureOrders;
    }

    /**
     * Imposta il valore della proprietà brochureOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBrochureOrders }
     *     
     */
    public void setBrochureOrders(DTBrochureOrders value) {
        this.brochureOrders = value;
    }

    /**
     * Recupera il valore della proprietà requests.
     * 
     * @return
     *     possible object is
     *     {@link DTRequests }
     *     
     */
    public DTRequests getRequests() {
        return requests;
    }

    /**
     * Imposta il valore della proprietà requests.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRequests }
     *     
     */
    public void setRequests(DTRequests value) {
        this.requests = value;
    }

    /**
     * Recupera il valore della proprietà campaignResponses.
     * 
     * @return
     *     possible object is
     *     {@link DTCampaignResponses }
     *     
     */
    public DTCampaignResponses getCampaignResponses() {
        return campaignResponses;
    }

    /**
     * Imposta il valore della proprietà campaignResponses.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCampaignResponses }
     *     
     */
    public void setCampaignResponses(DTCampaignResponses value) {
        this.campaignResponses = value;
    }

    /**
     * Recupera il valore della proprietà leads.
     * 
     * @return
     *     possible object is
     *     {@link DTLeads }
     *     
     */
    public DTLeads getLeads() {
        return leads;
    }

    /**
     * Imposta il valore della proprietà leads.
     * 
     * @param value
     *     allowed object is
     *     {@link DTLeads }
     *     
     */
    public void setLeads(DTLeads value) {
        this.leads = value;
    }

    /**
     * Recupera il valore della proprietà roadsideAssistances.
     * 
     * @return
     *     possible object is
     *     {@link DTRoadsideAssistances }
     *     
     */
    public DTRoadsideAssistances getRoadsideAssistances() {
        return roadsideAssistances;
    }

    /**
     * Imposta il valore della proprietà roadsideAssistances.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRoadsideAssistances }
     *     
     */
    public void setRoadsideAssistances(DTRoadsideAssistances value) {
        this.roadsideAssistances = value;
    }

    /**
     * Recupera il valore della proprietà vehicleSalesOrders.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrdersType }
     *     
     */
    public VehicleSalesOrdersType getVehicleSalesOrders() {
        return vehicleSalesOrders;
    }

    /**
     * Imposta il valore della proprietà vehicleSalesOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrdersType }
     *     
     */
    public void setVehicleSalesOrders(VehicleSalesOrdersType value) {
        this.vehicleSalesOrders = value;
    }

    /**
     * Recupera il valore della proprietà courseOrders.
     * 
     * @return
     *     possible object is
     *     {@link CourseOrdersType }
     *     
     */
    public CourseOrdersType getCourseOrders() {
        return courseOrders;
    }

    /**
     * Imposta il valore della proprietà courseOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOrdersType }
     *     
     */
    public void setCourseOrders(CourseOrdersType value) {
        this.courseOrders = value;
    }

    /**
     * Recupera il valore della proprietà marketingContacts.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactsType }
     *     
     */
    public MarketingContactsType getMarketingContacts() {
        return marketingContacts;
    }

    /**
     * Imposta il valore della proprietà marketingContacts.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactsType }
     *     
     */
    public void setMarketingContacts(MarketingContactsType value) {
        this.marketingContacts = value;
    }

    /**
     * Recupera il valore della proprietà products.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProducts() {
        return products;
    }

    /**
     * Imposta il valore della proprietà products.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProducts(ProductsType value) {
        this.products = value;
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
     *         &lt;element name="BusinessPartner" type="{http://volkswagen.de/xi/kuba/KISS}BO_BusinessPartnersSP" maxOccurs="unbounded"/>
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
        "businessPartner"
    })
    public static class BusinessPartners {

        @XmlElement(name = "BusinessPartner", required = true)
        protected List<BOBusinessPartnersSP> businessPartner;

        /**
         * Gets the value of the businessPartner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessPartner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessPartner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BOBusinessPartnersSP }
         * 
         * 
         */
        public List<BOBusinessPartnersSP> getBusinessPartner() {
            if (businessPartner == null) {
                businessPartner = new ArrayList<BOBusinessPartnersSP>();
            }
            return this.businessPartner;
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
     *         &lt;element name="PartnerRelation" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerRelationSP" maxOccurs="unbounded"/>
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
        "partnerRelation"
    })
    public static class PartnerRelations {

        @XmlElement(name = "PartnerRelation", required = true)
        protected List<DTPartnerRelationSP> partnerRelation;

        /**
         * Gets the value of the partnerRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partnerRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartnerRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTPartnerRelationSP }
         * 
         * 
         */
        public List<DTPartnerRelationSP> getPartnerRelation() {
            if (partnerRelation == null) {
                partnerRelation = new ArrayList<DTPartnerRelationSP>();
            }
            return this.partnerRelation;
        }

    }

}
