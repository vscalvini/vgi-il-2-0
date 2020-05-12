//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package com.volkswagenag.xmldefs.dd.businesspartner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.volkswagenag.xmldefs.dd.basictypes.IdentifierType;


/**
 * <p>Classe Java per CustomerIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNumber" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentifierType", propOrder = {
    "customerNumber"
})
public class CustomerIdentifierType {

    @XmlElement(name = "CustomerNumber")
    protected IdentifierType customerNumber;

    /**
     * Recupera il valore della proprietà customerNumber.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Imposta il valore della proprietà customerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setCustomerNumber(IdentifierType value) {
        this.customerNumber = value;
    }

}
