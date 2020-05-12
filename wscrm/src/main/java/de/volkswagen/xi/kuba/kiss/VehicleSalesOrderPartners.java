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
 * Partners linked to a single vehicle sales order
 * 
 * <p>Classe Java per VehicleSalesOrderPartners complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSalesOrderPartners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityPartner" type="{http://volkswagen.de/xi/kuba/KISS}ConcretePartnerType"/>
 *         &lt;element name="ContactPartner" type="{http://volkswagen.de/xi/kuba/KISS}ConcretePartnerType"/>
 *         &lt;element name="SoldToParty" type="{http://volkswagen.de/xi/kuba/KISS}ConcretePartnerType"/>
 *         &lt;element name="SalesDealer" type="{http://volkswagen.de/xi/kuba/KISS}ConcretePartnerType" minOccurs="0"/>
 *         &lt;element name="AdditionalPartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Partner" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderPartner" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "VehicleSalesOrderPartners", propOrder = {
    "activityPartner",
    "contactPartner",
    "soldToParty",
    "salesDealer",
    "additionalPartners"
})
public class VehicleSalesOrderPartners {

    @XmlElement(name = "ActivityPartner", required = true)
    protected ConcretePartnerType activityPartner;
    @XmlElement(name = "ContactPartner", required = true)
    protected ConcretePartnerType contactPartner;
    @XmlElement(name = "SoldToParty", required = true)
    protected ConcretePartnerType soldToParty;
    @XmlElement(name = "SalesDealer")
    protected ConcretePartnerType salesDealer;
    @XmlElement(name = "AdditionalPartners")
    protected VehicleSalesOrderPartners.AdditionalPartners additionalPartners;

    /**
     * Recupera il valore della proprietà activityPartner.
     * 
     * @return
     *     possible object is
     *     {@link ConcretePartnerType }
     *     
     */
    public ConcretePartnerType getActivityPartner() {
        return activityPartner;
    }

    /**
     * Imposta il valore della proprietà activityPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcretePartnerType }
     *     
     */
    public void setActivityPartner(ConcretePartnerType value) {
        this.activityPartner = value;
    }

    /**
     * Recupera il valore della proprietà contactPartner.
     * 
     * @return
     *     possible object is
     *     {@link ConcretePartnerType }
     *     
     */
    public ConcretePartnerType getContactPartner() {
        return contactPartner;
    }

    /**
     * Imposta il valore della proprietà contactPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcretePartnerType }
     *     
     */
    public void setContactPartner(ConcretePartnerType value) {
        this.contactPartner = value;
    }

    /**
     * Recupera il valore della proprietà soldToParty.
     * 
     * @return
     *     possible object is
     *     {@link ConcretePartnerType }
     *     
     */
    public ConcretePartnerType getSoldToParty() {
        return soldToParty;
    }

    /**
     * Imposta il valore della proprietà soldToParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcretePartnerType }
     *     
     */
    public void setSoldToParty(ConcretePartnerType value) {
        this.soldToParty = value;
    }

    /**
     * Recupera il valore della proprietà salesDealer.
     * 
     * @return
     *     possible object is
     *     {@link ConcretePartnerType }
     *     
     */
    public ConcretePartnerType getSalesDealer() {
        return salesDealer;
    }

    /**
     * Imposta il valore della proprietà salesDealer.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcretePartnerType }
     *     
     */
    public void setSalesDealer(ConcretePartnerType value) {
        this.salesDealer = value;
    }

    /**
     * Recupera il valore della proprietà additionalPartners.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSalesOrderPartners.AdditionalPartners }
     *     
     */
    public VehicleSalesOrderPartners.AdditionalPartners getAdditionalPartners() {
        return additionalPartners;
    }

    /**
     * Imposta il valore della proprietà additionalPartners.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSalesOrderPartners.AdditionalPartners }
     *     
     */
    public void setAdditionalPartners(VehicleSalesOrderPartners.AdditionalPartners value) {
        this.additionalPartners = value;
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
     *         &lt;element name="Partner" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderPartner" maxOccurs="unbounded"/>
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
    public static class AdditionalPartners {

        @XmlElement(name = "Partner", required = true)
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
