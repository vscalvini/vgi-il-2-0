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
 * Product tax group
 * 
 * <p>Classe Java per OrderItemTaxType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrderItemTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductTaxGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationCountry" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="DestinationRegion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
@XmlType(name = "OrderItemTaxType", propOrder = {
    "productTaxGroup",
    "destinationCountry",
    "destinationRegion",
    "type"
})
public class OrderItemTaxType {

    @XmlElement(name = "ProductTaxGroup")
    protected String productTaxGroup;
    @XmlElement(name = "DestinationCountry")
    protected String destinationCountry;
    @XmlElement(name = "DestinationRegion")
    protected String destinationRegion;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Recupera il valore della proprietà productTaxGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTaxGroup() {
        return productTaxGroup;
    }

    /**
     * Imposta il valore della proprietà productTaxGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTaxGroup(String value) {
        this.productTaxGroup = value;
    }

    /**
     * Recupera il valore della proprietà destinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Imposta il valore della proprietà destinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Recupera il valore della proprietà destinationRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * Imposta il valore della proprietà destinationRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationRegion(String value) {
        this.destinationRegion = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
