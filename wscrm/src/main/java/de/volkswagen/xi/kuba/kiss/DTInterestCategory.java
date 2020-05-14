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
 * Category of interest
 * 
 * <p>Classe Java per DT_InterestCategory complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_InterestCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="InterestCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InterestSubCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description" minOccurs="0">
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
@XmlType(name = "DT_InterestCategory", propOrder = {
    "method",
    "interestCategory",
    "interestSubCategory",
    "description"
})
public class DTInterestCategory {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "InterestCategory")
    protected String interestCategory;
    @XmlElement(name = "InterestSubCategory")
    protected String interestSubCategory;
    @XmlElement(name = "Description")
    protected String description;

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
     * Recupera il valore della proprietà interestCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCategory() {
        return interestCategory;
    }

    /**
     * Imposta il valore della proprietà interestCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCategory(String value) {
        this.interestCategory = value;
    }

    /**
     * Recupera il valore della proprietà interestSubCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestSubCategory() {
        return interestSubCategory;
    }

    /**
     * Imposta il valore della proprietà interestSubCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestSubCategory(String value) {
        this.interestSubCategory = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
