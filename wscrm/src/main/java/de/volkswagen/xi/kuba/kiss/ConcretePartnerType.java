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
import javax.xml.bind.annotation.XmlType;


/**
 * Structure used for partners within a given function
 * 
 * <p>Classe Java per ConcretePartnerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConcretePartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="RefPartnerHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="PartnerNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerNumberType" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerNumberType" minOccurs="0"/>
 *         &lt;element name="DisplayType" type="{http://volkswagen.de/xi/kuba/KISS}DT_PartnerNumberType" minOccurs="0"/>
 *         &lt;element name="KindOfEntry" type="{http://volkswagen.de/xi/kuba/KISS}DT_KindOfEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcretePartnerType", propOrder = {
    "method",
    "refPartnerHandle",
    "partnerNumber",
    "partnerNumberType",
    "displayType",
    "kindOfEntry"
})
public class ConcretePartnerType {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "RefPartnerHandle")
    protected String refPartnerHandle;
    @XmlElement(name = "PartnerNumber")
    protected String partnerNumber;
    @XmlElement(name = "PartnerNumberType")
    protected String partnerNumberType;
    @XmlElement(name = "DisplayType")
    protected String displayType;
    @XmlElement(name = "KindOfEntry")
    protected String kindOfEntry;

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
     * Recupera il valore della proprietà refPartnerHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPartnerHandle() {
        return refPartnerHandle;
    }

    /**
     * Imposta il valore della proprietà refPartnerHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPartnerHandle(String value) {
        this.refPartnerHandle = value;
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

    /**
     * Recupera il valore della proprietà partnerNumberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNumberType() {
        return partnerNumberType;
    }

    /**
     * Imposta il valore della proprietà partnerNumberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNumberType(String value) {
        this.partnerNumberType = value;
    }

    /**
     * Recupera il valore della proprietà displayType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Imposta il valore della proprietà displayType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Recupera il valore della proprietà kindOfEntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindOfEntry() {
        return kindOfEntry;
    }

    /**
     * Imposta il valore della proprietà kindOfEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindOfEntry(String value) {
        this.kindOfEntry = value;
    }

}
