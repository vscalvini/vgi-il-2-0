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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Connect data origin concerning the online/web contact of a customer - service provider (SP)
 * 
 * <p>Classe Java per ConnectDataOriginSPType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectDataOriginSPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Program" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TouchPoint" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectDataOriginSPType", propOrder = {
    "program",
    "touchPoint",
    "contactType",
    "contactTime"
})
public class ConnectDataOriginSPType {

    @XmlElement(name = "Program")
    protected String program;
    @XmlElement(name = "TouchPoint")
    protected String touchPoint;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "ContactTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contactTime;

    /**
     * Recupera il valore della proprietà program.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Imposta il valore della proprietà program.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Recupera il valore della proprietà touchPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouchPoint() {
        return touchPoint;
    }

    /**
     * Imposta il valore della proprietà touchPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouchPoint(String value) {
        this.touchPoint = value;
    }

    /**
     * Recupera il valore della proprietà contactType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Imposta il valore della proprietà contactType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Recupera il valore della proprietà contactTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactTime() {
        return contactTime;
    }

    /**
     * Imposta il valore della proprietà contactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactTime(XMLGregorianCalendar value) {
        this.contactTime = value;
    }

}
