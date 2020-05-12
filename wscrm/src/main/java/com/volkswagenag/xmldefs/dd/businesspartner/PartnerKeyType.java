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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.volkswagenag.xmldefs.dd.basictypes.CodeType;
import com.volkswagenag.xmldefs.dd.basictypes.CountryCodeType;


/**
 * <p>Classe Java per PartnerKeyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartnerKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="PartnerNumber" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerKeyType", propOrder = {
    "country",
    "brand",
    "partnerNumber"
})
public class PartnerKeyType {

    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "Brand")
    protected CodeType brand;
    @XmlElement(name = "PartnerNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partnerNumber;

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà brand.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBrand() {
        return brand;
    }

    /**
     * Imposta il valore della proprietà brand.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBrand(CodeType value) {
        this.brand = value;
    }

    /**
     * Recupera il valore della proprietà partnerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNumber() {
        return partnerNumber;
    }

    /**
     * Imposta il valore della proprietà partnerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNumber(String value) {
        this.partnerNumber = value;
    }

}
