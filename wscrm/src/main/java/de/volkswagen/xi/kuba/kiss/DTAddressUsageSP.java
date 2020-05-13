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
 * Address usage
 * 
 * <p>Classe Java per DT_AddressUsageSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_AddressUsageSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsStandard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressUsageType" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressUsageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_AddressUsageSP", propOrder = {
    "isStandard",
    "addressUsageType"
})
public class DTAddressUsageSP {

    @XmlElement(name = "IsStandard")
    protected Boolean isStandard;
    @XmlElement(name = "AddressUsageType")
    protected String addressUsageType;

    /**
     * Recupera il valore della proprietà isStandard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandard() {
        return isStandard;
    }

    /**
     * Imposta il valore della proprietà isStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandard(Boolean value) {
        this.isStandard = value;
    }

    /**
     * Recupera il valore della proprietà addressUsageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressUsageType() {
        return addressUsageType;
    }

    /**
     * Imposta il valore della proprietà addressUsageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressUsageType(String value) {
        this.addressUsageType = value;
    }

}
