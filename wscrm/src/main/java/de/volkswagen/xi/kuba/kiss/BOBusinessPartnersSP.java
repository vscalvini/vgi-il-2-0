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
import javax.xml.bind.annotation.XmlType;


/**
 * Data concernig business partner
 * 
 * <p>Classe Java per BO_BusinessPartnersSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BO_BusinessPartnersSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchOnlyIND" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IndicatorType" minOccurs="0"/>
 *         &lt;element name="BO_BusinessPartner" type="{http://volkswagen.de/xi/kuba/KISS}BO_BusinessPartnerSP"/>
 *         &lt;element name="BPID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDKind" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "BO_BusinessPartnersSP", propOrder = {
    "searchOnlyIND",
    "boBusinessPartner",
    "bpid",
    "idKind"
})
public class BOBusinessPartnersSP {

    @XmlElement(name = "SearchOnlyIND")
    protected Boolean searchOnlyIND;
    @XmlElement(name = "BO_BusinessPartner", required = true)
    protected BOBusinessPartnerSP boBusinessPartner;
    @XmlElement(name = "BPID")
    protected String bpid;
    @XmlElement(name = "IDKind")
    protected String idKind;

    /**
     * Recupera il valore della proprietà searchOnlyIND.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchOnlyIND() {
        return searchOnlyIND;
    }

    /**
     * Imposta il valore della proprietà searchOnlyIND.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchOnlyIND(Boolean value) {
        this.searchOnlyIND = value;
    }

    /**
     * Recupera il valore della proprietà boBusinessPartner.
     * 
     * @return
     *     possible object is
     *     {@link BOBusinessPartnerSP }
     *     
     */
    public BOBusinessPartnerSP getBOBusinessPartner() {
        return boBusinessPartner;
    }

    /**
     * Imposta il valore della proprietà boBusinessPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBusinessPartnerSP }
     *     
     */
    public void setBOBusinessPartner(BOBusinessPartnerSP value) {
        this.boBusinessPartner = value;
    }

    /**
     * Recupera il valore della proprietà bpid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPID() {
        return bpid;
    }

    /**
     * Imposta il valore della proprietà bpid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPID(String value) {
        this.bpid = value;
    }

    /**
     * Recupera il valore della proprietà idKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDKind() {
        return idKind;
    }

    /**
     * Imposta il valore della proprietà idKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDKind(String value) {
        this.idKind = value;
    }

}
