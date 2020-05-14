//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Appointments of an order
 * 
 * <p>Classe Java per DT_OrderAppointmentSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_OrderAppointmentSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentType" type="{http://volkswagen.de/xi/kuba/KISS}DT_AppointmentType" minOccurs="0"/>
 *         &lt;element name="TimestampFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TimestampTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="IsDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_OrderAppointmentSP", propOrder = {
    "appointmentType",
    "timestampFrom",
    "timestampTo",
    "duration",
    "isDuration"
})
public class DTOrderAppointmentSP {

    @XmlElement(name = "AppointmentType")
    protected String appointmentType;
    @XmlElement(name = "TimestampFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampFrom;
    @XmlElement(name = "TimestampTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampTo;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "IsDuration")
    protected Boolean isDuration;

    /**
     * Recupera il valore della proprietà appointmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentType() {
        return appointmentType;
    }

    /**
     * Imposta il valore della proprietà appointmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentType(String value) {
        this.appointmentType = value;
    }

    /**
     * Recupera il valore della proprietà timestampFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampFrom() {
        return timestampFrom;
    }

    /**
     * Imposta il valore della proprietà timestampFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampFrom(XMLGregorianCalendar value) {
        this.timestampFrom = value;
    }

    /**
     * Recupera il valore della proprietà timestampTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampTo() {
        return timestampTo;
    }

    /**
     * Imposta il valore della proprietà timestampTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampTo(XMLGregorianCalendar value) {
        this.timestampTo = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà isDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDuration() {
        return isDuration;
    }

    /**
     * Imposta il valore della proprietà isDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuration(Boolean value) {
        this.isDuration = value;
    }

}
