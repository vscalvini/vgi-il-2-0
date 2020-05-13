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
 * Detailed product data, without product instance data
 * 
 * <p>Classe Java per ProductDataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductPartNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductPrice" type="{http://volkswagen.de/xi/kuba/KISS}ProductPriceType" minOccurs="0"/>
 *         &lt;element name="ProductType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductDescription" type="{http://volkswagen.de/xi/kuba/KISS}ProductDescriptionType" minOccurs="0"/>
 *         &lt;element name="LinkProductBundle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
@XmlType(name = "ProductDataType", propOrder = {
    "productPartNumber",
    "prNumber",
    "productPrice",
    "productType",
    "productDescription",
    "linkProductBundle"
})
public class ProductDataType {

    @XmlElement(name = "ProductPartNumber")
    protected String productPartNumber;
    @XmlElement(name = "PRNumber")
    protected String prNumber;
    @XmlElement(name = "ProductPrice")
    protected ProductPriceType productPrice;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "ProductDescription")
    protected ProductDescriptionType productDescription;
    @XmlElement(name = "LinkProductBundle")
    protected String linkProductBundle;

    /**
     * Recupera il valore della proprietà productPartNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPartNumber() {
        return productPartNumber;
    }

    /**
     * Imposta il valore della proprietà productPartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPartNumber(String value) {
        this.productPartNumber = value;
    }

    /**
     * Recupera il valore della proprietà prNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRNumber() {
        return prNumber;
    }

    /**
     * Imposta il valore della proprietà prNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRNumber(String value) {
        this.prNumber = value;
    }

    /**
     * Recupera il valore della proprietà productPrice.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceType }
     *     
     */
    public ProductPriceType getProductPrice() {
        return productPrice;
    }

    /**
     * Imposta il valore della proprietà productPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceType }
     *     
     */
    public void setProductPrice(ProductPriceType value) {
        this.productPrice = value;
    }

    /**
     * Recupera il valore della proprietà productType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Imposta il valore della proprietà productType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Recupera il valore della proprietà productDescription.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescriptionType }
     *     
     */
    public ProductDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Imposta il valore della proprietà productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescriptionType }
     *     
     */
    public void setProductDescription(ProductDescriptionType value) {
        this.productDescription = value;
    }

    /**
     * Recupera il valore della proprietà linkProductBundle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkProductBundle() {
        return linkProductBundle;
    }

    /**
     * Imposta il valore della proprietà linkProductBundle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkProductBundle(String value) {
        this.linkProductBundle = value;
    }

}
