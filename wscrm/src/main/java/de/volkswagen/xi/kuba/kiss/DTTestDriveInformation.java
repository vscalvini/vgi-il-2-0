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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The customer is interested to make a test drive with the desired car. Here the needed information of the Test drive is transferred.
 * 
 * <p>Classe Java per DT_TestDriveInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_TestDriveInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferredTestDriveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PreferredTestDriveTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
@XmlType(name = "DT_TestDriveInformation", propOrder = {
    "preferredTestDriveDate",
    "preferredTestDriveTime",
    "licenseNumber"
})
public class DTTestDriveInformation {

    @XmlElement(name = "PreferredTestDriveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preferredTestDriveDate;
    @XmlElement(name = "PreferredTestDriveTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar preferredTestDriveTime;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;

    /**
     * Recupera il valore della proprietà preferredTestDriveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferredTestDriveDate() {
        return preferredTestDriveDate;
    }

    /**
     * Imposta il valore della proprietà preferredTestDriveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferredTestDriveDate(XMLGregorianCalendar value) {
        this.preferredTestDriveDate = value;
    }

    /**
     * Recupera il valore della proprietà preferredTestDriveTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferredTestDriveTime() {
        return preferredTestDriveTime;
    }

    /**
     * Imposta il valore della proprietà preferredTestDriveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferredTestDriveTime(XMLGregorianCalendar value) {
        this.preferredTestDriveTime = value;
    }

    /**
     * Recupera il valore della proprietà licenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Imposta il valore della proprietà licenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

}
