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
 * External numbers for identifying Products
 * 
 * <p>Classe Java per ProductExternalIdType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProductExternalIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIDSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductExternalIdType", propOrder = {
    "productID",
    "productIDType",
    "productIDSystem"
})
public class ProductExternalIdType {

    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ProductIDType")
    protected String productIDType;
    @XmlElement(name = "ProductIDSystem")
    protected String productIDSystem;

    /**
     * Recupera il valore della proprietà productID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Imposta il valore della proprietà productID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Recupera il valore della proprietà productIDType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIDType() {
        return productIDType;
    }

    /**
     * Imposta il valore della proprietà productIDType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIDType(String value) {
        this.productIDType = value;
    }

    /**
     * Recupera il valore della proprietà productIDSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIDSystem() {
        return productIDSystem;
    }

    /**
     * Imposta il valore della proprietà productIDSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIDSystem(String value) {
        this.productIDSystem = value;
    }

}
