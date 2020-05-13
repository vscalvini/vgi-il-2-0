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
 * A single course order
 * 
 * <p>Classe Java per CourseOrderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CourseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="METHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="ProcessType" type="{http://volkswagen.de/xi/kuba/KISS}DT_ProcessType" minOccurs="0"/>
 *         &lt;element name="Subject" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalCourseOrderIds" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderId" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://volkswagen.de/xi/kuba/KISS}DT_OrderStatusSP" minOccurs="0"/>
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
 *         &lt;element name="Items" type="{http://volkswagen.de/xi/kuba/KISS}OrderItemsType" minOccurs="0"/>
 *         &lt;element name="Pricing" type="{http://volkswagen.de/xi/kuba/KISS}OrderPricingType" minOccurs="0"/>
 *         &lt;element name="Sales" type="{http://volkswagen.de/xi/kuba/KISS}OrderSalesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseOrderType", propOrder = {
    "method",
    "referenceHandle",
    "processType",
    "subject",
    "externalCourseOrderIds",
    "status",
    "texts",
    "appointments",
    "partners",
    "items",
    "pricing",
    "sales"
})
public class CourseOrderType {

    @XmlElement(name = "METHOD")
    protected String method;
    @XmlElement(name = "ReferenceHandle")
    protected String referenceHandle;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "ExternalCourseOrderIds")
    protected DTOrderId externalCourseOrderIds;
    @XmlElement(name = "Status")
    protected DTOrderStatusSP status;
    @XmlElement(name = "Texts")
    protected CourseOrderType.Texts texts;
    @XmlElement(name = "Appointments")
    protected CourseOrderType.Appointments appointments;
    @XmlElement(name = "Partners")
    protected CourseOrderType.Partners partners;
    @XmlElement(name = "Items")
    protected OrderItemsType items;
    @XmlElement(name = "Pricing")
    protected OrderPricingType pricing;
    @XmlElement(name = "Sales")
    protected OrderSalesType sales;

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
     * Recupera il valore della proprietà externalCourseOrderIds.
     * 
     * @return
     *     possible object is
     *     {@link DTOrderId }
     *     
     */
    public DTOrderId getExternalCourseOrderIds() {
        return externalCourseOrderIds;
    }

    /**
     * Imposta il valore della proprietà externalCourseOrderIds.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOrderId }
     *     
     */
    public void setExternalCourseOrderIds(DTOrderId value) {
        this.externalCourseOrderIds = value;
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
     * Recupera il valore della proprietà texts.
     * 
     * @return
     *     possible object is
     *     {@link CourseOrderType.Texts }
     *     
     */
    public CourseOrderType.Texts getTexts() {
        return texts;
    }

    /**
     * Imposta il valore della proprietà texts.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOrderType.Texts }
     *     
     */
    public void setTexts(CourseOrderType.Texts value) {
        this.texts = value;
    }

    /**
     * Recupera il valore della proprietà appointments.
     * 
     * @return
     *     possible object is
     *     {@link CourseOrderType.Appointments }
     *     
     */
    public CourseOrderType.Appointments getAppointments() {
        return appointments;
    }

    /**
     * Imposta il valore della proprietà appointments.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOrderType.Appointments }
     *     
     */
    public void setAppointments(CourseOrderType.Appointments value) {
        this.appointments = value;
    }

    /**
     * Recupera il valore della proprietà partners.
     * 
     * @return
     *     possible object is
     *     {@link CourseOrderType.Partners }
     *     
     */
    public CourseOrderType.Partners getPartners() {
        return partners;
    }

    /**
     * Imposta il valore della proprietà partners.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOrderType.Partners }
     *     
     */
    public void setPartners(CourseOrderType.Partners value) {
        this.partners = value;
    }

    /**
     * Recupera il valore della proprietà items.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemsType }
     *     
     */
    public OrderItemsType getItems() {
        return items;
    }

    /**
     * Imposta il valore della proprietà items.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemsType }
     *     
     */
    public void setItems(OrderItemsType value) {
        this.items = value;
    }

    /**
     * Recupera il valore della proprietà pricing.
     * 
     * @return
     *     possible object is
     *     {@link OrderPricingType }
     *     
     */
    public OrderPricingType getPricing() {
        return pricing;
    }

    /**
     * Imposta il valore della proprietà pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPricingType }
     *     
     */
    public void setPricing(OrderPricingType value) {
        this.pricing = value;
    }

    /**
     * Recupera il valore della proprietà sales.
     * 
     * @return
     *     possible object is
     *     {@link OrderSalesType }
     *     
     */
    public OrderSalesType getSales() {
        return sales;
    }

    /**
     * Imposta il valore della proprietà sales.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSalesType }
     *     
     */
    public void setSales(OrderSalesType value) {
        this.sales = value;
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
