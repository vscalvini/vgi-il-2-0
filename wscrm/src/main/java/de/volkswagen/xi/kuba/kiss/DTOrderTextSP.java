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
 * Text for orders
 * 
 * <p>Classe Java per DT_OrderTextSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_OrderTextSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextLanguage" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage"/>
 *         &lt;element name="TextLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_OrderTextSP", propOrder = {
    "textId",
    "textLanguage",
    "textLine"
})
public class DTOrderTextSP {

    @XmlElement(name = "TextId", required = true)
    protected String textId;
    @XmlElement(name = "TextLanguage", required = true)
    protected String textLanguage;
    @XmlElement(name = "TextLine", required = true)
    protected String textLine;

    /**
     * Recupera il valore della proprietà textId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextId() {
        return textId;
    }

    /**
     * Imposta il valore della proprietà textId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextId(String value) {
        this.textId = value;
    }

    /**
     * Recupera il valore della proprietà textLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLanguage() {
        return textLanguage;
    }

    /**
     * Imposta il valore della proprietà textLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLanguage(String value) {
        this.textLanguage = value;
    }

    /**
     * Recupera il valore della proprietà textLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLine() {
        return textLine;
    }

    /**
     * Imposta il valore della proprietà textLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLine(String value) {
        this.textLine = value;
    }

}
