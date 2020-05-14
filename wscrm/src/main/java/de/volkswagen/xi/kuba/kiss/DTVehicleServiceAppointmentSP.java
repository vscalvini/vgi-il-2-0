//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vehicle service appointments
 * 
 * <p>Classe Java per DT_VehicleServiceAppointmentSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleServiceAppointmentSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="Partner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServicePartner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ServiceDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Reminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceAmountCurr" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_VehicleServiceAppointmentSP", propOrder = {
    "method",
    "partner",
    "servicePartner",
    "serviceId",
    "serviceCategory",
    "serviceDescription",
    "serviceDate",
    "serviceDateEnd",
    "reminder",
    "serviceStatus",
    "invoiceNo",
    "invoiceAmount",
    "invoiceAmountCurr"
})
public class DTVehicleServiceAppointmentSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "Partner")
    protected String partner;
    @XmlElement(name = "ServicePartner")
    protected String servicePartner;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "ServiceCategory")
    protected String serviceCategory;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "ServiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "ServiceDateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDateEnd;
    @XmlElement(name = "Reminder")
    protected Boolean reminder;
    @XmlElement(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlElement(name = "InvoiceNo")
    protected String invoiceNo;
    @XmlElement(name = "InvoiceAmount")
    protected BigDecimal invoiceAmount;
    @XmlElement(name = "InvoiceAmountCurr")
    protected String invoiceAmountCurr;

    /**
     * Recupera il valore della proprietà method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
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
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Recupera il valore della proprietà partner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner() {
        return partner;
    }

    /**
     * Imposta il valore della proprietà partner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner(String value) {
        this.partner = value;
    }

    /**
     * Recupera il valore della proprietà servicePartner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePartner() {
        return servicePartner;
    }

    /**
     * Imposta il valore della proprietà servicePartner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePartner(String value) {
        this.servicePartner = value;
    }

    /**
     * Recupera il valore della proprietà serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Imposta il valore della proprietà serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Recupera il valore della proprietà serviceCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Imposta il valore della proprietà serviceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Recupera il valore della proprietà serviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Imposta il valore della proprietà serviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Recupera il valore della proprietà serviceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Imposta il valore della proprietà serviceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Recupera il valore della proprietà serviceDateEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDateEnd() {
        return serviceDateEnd;
    }

    /**
     * Imposta il valore della proprietà serviceDateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDateEnd(XMLGregorianCalendar value) {
        this.serviceDateEnd = value;
    }

    /**
     * Recupera il valore della proprietà reminder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReminder() {
        return reminder;
    }

    /**
     * Imposta il valore della proprietà reminder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReminder(Boolean value) {
        this.reminder = value;
    }

    /**
     * Recupera il valore della proprietà serviceStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Imposta il valore della proprietà serviceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Recupera il valore della proprietà invoiceNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Imposta il valore della proprietà invoiceNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Recupera il valore della proprietà invoiceAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Imposta il valore della proprietà invoiceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmount(BigDecimal value) {
        this.invoiceAmount = value;
    }

    /**
     * Recupera il valore della proprietà invoiceAmountCurr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAmountCurr() {
        return invoiceAmountCurr;
    }

    /**
     * Imposta il valore della proprietà invoiceAmountCurr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAmountCurr(String value) {
        this.invoiceAmountCurr = value;
    }

}
