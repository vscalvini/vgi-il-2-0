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
 * <p>Classe Java per WholesalerIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WholesalerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImporterId" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesalerIdentifierType", propOrder = {
    "importerId"
})
public class WholesalerIdentifierType {

    @XmlElement(name = "ImporterId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String importerId;

    /**
     * Recupera il valore della proprietà importerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporterId() {
        return importerId;
    }

    /**
     * Imposta il valore della proprietà importerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporterId(String value) {
        this.importerId = value;
    }

}
