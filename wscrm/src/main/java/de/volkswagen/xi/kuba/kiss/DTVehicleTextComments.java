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
 * Texts and comments concerning vehicles
 * 
 * <p>Classe Java per DT_VehicleTextComments complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleTextComments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="ColorOuter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ColorInner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Comment1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Comment2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
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
@XmlType(name = "DT_VehicleTextComments", propOrder = {
    "method",
    "colorOuter",
    "colorInner",
    "feature1",
    "feature2",
    "feature3",
    "feature4",
    "feature5",
    "comment1",
    "comment2"
})
public class DTVehicleTextComments {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "ColorOuter")
    protected String colorOuter;
    @XmlElement(name = "ColorInner")
    protected String colorInner;
    @XmlElement(name = "Feature1")
    protected String feature1;
    @XmlElement(name = "Feature2")
    protected String feature2;
    @XmlElement(name = "Feature3")
    protected String feature3;
    @XmlElement(name = "Feature4")
    protected String feature4;
    @XmlElement(name = "Feature5")
    protected String feature5;
    @XmlElement(name = "Comment1")
    protected String comment1;
    @XmlElement(name = "Comment2")
    protected String comment2;

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
     * Recupera il valore della proprietà colorOuter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorOuter() {
        return colorOuter;
    }

    /**
     * Imposta il valore della proprietà colorOuter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorOuter(String value) {
        this.colorOuter = value;
    }

    /**
     * Recupera il valore della proprietà colorInner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInner() {
        return colorInner;
    }

    /**
     * Imposta il valore della proprietà colorInner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInner(String value) {
        this.colorInner = value;
    }

    /**
     * Recupera il valore della proprietà feature1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature1() {
        return feature1;
    }

    /**
     * Imposta il valore della proprietà feature1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature1(String value) {
        this.feature1 = value;
    }

    /**
     * Recupera il valore della proprietà feature2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature2() {
        return feature2;
    }

    /**
     * Imposta il valore della proprietà feature2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature2(String value) {
        this.feature2 = value;
    }

    /**
     * Recupera il valore della proprietà feature3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature3() {
        return feature3;
    }

    /**
     * Imposta il valore della proprietà feature3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature3(String value) {
        this.feature3 = value;
    }

    /**
     * Recupera il valore della proprietà feature4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature4() {
        return feature4;
    }

    /**
     * Imposta il valore della proprietà feature4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature4(String value) {
        this.feature4 = value;
    }

    /**
     * Recupera il valore della proprietà feature5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature5() {
        return feature5;
    }

    /**
     * Imposta il valore della proprietà feature5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature5(String value) {
        this.feature5 = value;
    }

    /**
     * Recupera il valore della proprietà comment1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * Imposta il valore della proprietà comment1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment1(String value) {
        this.comment1 = value;
    }

    /**
     * Recupera il valore della proprietà comment2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * Imposta il valore della proprietà comment2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment2(String value) {
        this.comment2 = value;
    }

}
