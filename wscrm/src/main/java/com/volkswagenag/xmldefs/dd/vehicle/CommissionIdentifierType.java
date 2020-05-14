//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package com.volkswagenag.xmldefs.dd.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.volkswagenag.xmldefs.dd.basictypes.IdentifierType;


/**
 * Commission Identifier
 * 
 * <p>Classe Java per CommissionIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommissionIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommissionYear" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}YearType" minOccurs="0"/>
 *         &lt;element name="CommissionNumber" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionIdentifierType", propOrder = {
    "commissionYear",
    "commissionNumber"
})
public class CommissionIdentifierType {

    @XmlElement(name = "CommissionYear")
    protected XMLGregorianCalendar commissionYear;
    @XmlElement(name = "CommissionNumber")
    protected IdentifierType commissionNumber;

    /**
     * Recupera il valore della proprietà commissionYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissionYear() {
        return commissionYear;
    }

    /**
     * Imposta il valore della proprietà commissionYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommissionYear(XMLGregorianCalendar value) {
        this.commissionYear = value;
    }

    /**
     * Recupera il valore della proprietà commissionNumber.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getCommissionNumber() {
        return commissionNumber;
    }

    /**
     * Imposta il valore della proprietà commissionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setCommissionNumber(IdentifierType value) {
        this.commissionNumber = value;
    }

}
