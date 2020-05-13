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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SalesPersonIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalesPersonIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeNumber" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *         &lt;element name="SalesPersonNumber" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesPersonIdentifierType", propOrder = {
    "employeeNumber",
    "salesPersonNumber"
})
public class SalesPersonIdentifierType {

    @XmlElement(name = "EmployeeNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String employeeNumber;
    @XmlElement(name = "SalesPersonNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String salesPersonNumber;

    /**
     * Recupera il valore della proprietà employeeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Imposta il valore della proprietà employeeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Recupera il valore della proprietà salesPersonNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPersonNumber() {
        return salesPersonNumber;
    }

    /**
     * Imposta il valore della proprietà salesPersonNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPersonNumber(String value) {
        this.salesPersonNumber = value;
    }

}
