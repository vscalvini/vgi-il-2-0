//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package com.volkswagenag.xmldefs.dd.businesspartner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.volkswagenag.xmldefs.dd.basictypes.IdentifierType;


/**
 * <p>Classe Java per PartnerIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartnerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerUID" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ApplicationIdentifiers" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}ApplicationIdentifiersType" minOccurs="0"/>
 *         &lt;element name="BusinessIdentifiers" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}BusinessIdentifiersType" minOccurs="0"/>
 *         &lt;element name="DealerIdentifier" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}DealerIdentifierType" minOccurs="0"/>
 *         &lt;element name="CustomerIdentifier" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}CustomerIdentifierType" minOccurs="0"/>
 *         &lt;element name="SalesPersonIdentifier" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}SalesPersonIdentifierType" minOccurs="0"/>
 *         &lt;element name="WholesalerIdentifier" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}WholesalerIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerIdentifierType", propOrder = {
    "partnerUID",
    "applicationIdentifiers",
    "businessIdentifiers",
    "dealerIdentifier",
    "customerIdentifier",
    "salesPersonIdentifier",
    "wholesalerIdentifier"
})
public class PartnerIdentifierType {

    @XmlElement(name = "PartnerUID")
    protected IdentifierType partnerUID;
    @XmlElement(name = "ApplicationIdentifiers")
    protected ApplicationIdentifiersType applicationIdentifiers;
    @XmlElement(name = "BusinessIdentifiers")
    protected BusinessIdentifiersType businessIdentifiers;
    @XmlElement(name = "DealerIdentifier")
    protected DealerIdentifierType dealerIdentifier;
    @XmlElement(name = "CustomerIdentifier")
    protected CustomerIdentifierType customerIdentifier;
    @XmlElement(name = "SalesPersonIdentifier")
    protected SalesPersonIdentifierType salesPersonIdentifier;
    @XmlElement(name = "WholesalerIdentifier")
    protected WholesalerIdentifierType wholesalerIdentifier;

    /**
     * Recupera il valore della proprietà partnerUID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPartnerUID() {
        return partnerUID;
    }

    /**
     * Imposta il valore della proprietà partnerUID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPartnerUID(IdentifierType value) {
        this.partnerUID = value;
    }

    /**
     * Recupera il valore della proprietà applicationIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationIdentifiersType }
     *     
     */
    public ApplicationIdentifiersType getApplicationIdentifiers() {
        return applicationIdentifiers;
    }

    /**
     * Imposta il valore della proprietà applicationIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationIdentifiersType }
     *     
     */
    public void setApplicationIdentifiers(ApplicationIdentifiersType value) {
        this.applicationIdentifiers = value;
    }

    /**
     * Recupera il valore della proprietà businessIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link BusinessIdentifiersType }
     *     
     */
    public BusinessIdentifiersType getBusinessIdentifiers() {
        return businessIdentifiers;
    }

    /**
     * Imposta il valore della proprietà businessIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessIdentifiersType }
     *     
     */
    public void setBusinessIdentifiers(BusinessIdentifiersType value) {
        this.businessIdentifiers = value;
    }

    /**
     * Recupera il valore della proprietà dealerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link DealerIdentifierType }
     *     
     */
    public DealerIdentifierType getDealerIdentifier() {
        return dealerIdentifier;
    }

    /**
     * Imposta il valore della proprietà dealerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerIdentifierType }
     *     
     */
    public void setDealerIdentifier(DealerIdentifierType value) {
        this.dealerIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public CustomerIdentifierType getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Imposta il valore della proprietà customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public void setCustomerIdentifier(CustomerIdentifierType value) {
        this.customerIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà salesPersonIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonIdentifierType }
     *     
     */
    public SalesPersonIdentifierType getSalesPersonIdentifier() {
        return salesPersonIdentifier;
    }

    /**
     * Imposta il valore della proprietà salesPersonIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonIdentifierType }
     *     
     */
    public void setSalesPersonIdentifier(SalesPersonIdentifierType value) {
        this.salesPersonIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà wholesalerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link WholesalerIdentifierType }
     *     
     */
    public WholesalerIdentifierType getWholesalerIdentifier() {
        return wholesalerIdentifier;
    }

    /**
     * Imposta il valore della proprietà wholesalerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesalerIdentifierType }
     *     
     */
    public void setWholesalerIdentifier(WholesalerIdentifierType value) {
        this.wholesalerIdentifier = value;
    }

}
