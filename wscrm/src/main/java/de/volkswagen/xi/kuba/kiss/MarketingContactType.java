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
 * Structure containing a single Marketing Contact within a KISS record
 * 
 * <p>Classe Java per MarketingContactType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MarketingContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle"/>
 *         &lt;element name="ProcessType" type="{http://volkswagen.de/xi/kuba/KISS}DT_ProcessType"/>
 *         &lt;element name="Subject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="CampaignElement" type="{http://volkswagen.de/xi/kuba/KISS}DT_CampaignElement" minOccurs="0"/>
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
 *         &lt;element name="COWAIAllowance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
 *         &lt;element name="ProductRefHandles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingContactType", propOrder = {
    "referenceHandle",
    "processType",
    "subject",
    "externalIds",
    "campaignElement",
    "connectDataOrigin",
    "dealerID",
    "shopID",
    "cowaiAllowance",
    "partners",
    "appointments",
    "texts",
    "status",
    "productRefHandles",
    "vehicleRefHandles"
})
public class MarketingContactType {

    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProcessType", required = true)
    protected String processType;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "ExternalIds")
    protected DTOrderId externalIds;
    @XmlElement(name = "CampaignElement")
    protected String campaignElement;
    @XmlElement(name = "ConnectDataOrigin")
    protected ConnectDataOriginSPType connectDataOrigin;
    @XmlElement(name = "DealerID")
    protected String dealerID;
    @XmlElement(name = "ShopID")
    protected String shopID;
    @XmlElement(name = "COWAIAllowance")
    protected String cowaiAllowance;
    @XmlElement(name = "Partners")
    protected MarketingContactType.Partners partners;
    @XmlElement(name = "Appointments")
    protected MarketingContactType.Appointments appointments;
    @XmlElement(name = "Texts")
    protected MarketingContactType.Texts texts;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "ProductRefHandles")
    protected MarketingContactType.ProductRefHandles productRefHandles;
    @XmlElement(name = "VehicleRefHandles")
    protected MarketingContactType.VehicleRefHandles vehicleRefHandles;

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
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà externalIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalIds() {
        return externalIds;
    }

    /**
     * Imposta il valore della proprietà externalIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalIds(DTOrderId value) {
        this.externalIds = value;
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
     * Recupera il valore della proprietà cowaiAllowance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOWAIAllowance() {
        return cowaiAllowance;
    }

    /**
     * Imposta il valore della proprietà cowaiAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOWAIAllowance(String value) {
        this.cowaiAllowance = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactType.Partners }
     *     
     */
    public MarketingContactType.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactType.Partners }
     *     
     */
    public void setPartners(MarketingContactType.Partners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactType.Appointments }
     *     
     */
    public MarketingContactType.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactType.Appointments }
     *     
     */
    public void setAppointments(MarketingContactType.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactType.Texts }
     *     
     */
    public MarketingContactType.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactType.Texts }
     *     
     */
    public void setTexts(MarketingContactType.Texts value) {
        this.texts = value;
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
     * Recupera il valore della proprietà productRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactType.ProductRefHandles }
     *     
     */
    public MarketingContactType.ProductRefHandles getProductRefHandles() {
        return productRefHandles;
    }

    /**
     * Imposta il valore della proprietà productRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactType.ProductRefHandles }
     *     
     */
    public void setProductRefHandles(MarketingContactType.ProductRefHandles value) {
        this.productRefHandles = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContactType.VehicleRefHandles }
     *     
     */
    public MarketingContactType.VehicleRefHandles getVehicleRefHandles() {
        return vehicleRefHandles;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContactType.VehicleRefHandles }
     *     
     */
    public void setVehicleRefHandles(MarketingContactType.VehicleRefHandles value) {
        this.vehicleRefHandles = value;
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
     *         &lt;element name="ProductRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded" minOccurs="0"/>
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
        "productRefHandle"
    })
    public static class ProductRefHandles {

        @XmlElement(name = "ProductRefHandle")
        protected List<String> productRefHandle;

        /**
         * Gets the value of the productRefHandle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productRefHandle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductRefHandle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getProductRefHandle() {
            if (productRefHandle == null) {
                productRefHandle = new ArrayList<String>();
            }
            return this.productRefHandle;
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
