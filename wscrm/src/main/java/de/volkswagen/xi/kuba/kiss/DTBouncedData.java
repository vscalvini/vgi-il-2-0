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
 * Unzustellbarkeitsdaten zu Kampagnen
 * 
 * <p>Classe Java per DT_BouncedData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BouncedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bounced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RetReason" minOccurs="0">
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
@XmlType(name = "DT_BouncedData", propOrder = {
    "bounced",
    "retReason"
})
public class DTBouncedData {

    @XmlElement(name = "Bounced")
    protected Boolean bounced;
    @XmlElement(name = "RetReason")
    protected String retReason;

    /**
     * Recupera il valore della proprietà bounced.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBounced() {
        return bounced;
    }

    /**
     * Imposta il valore della proprietà bounced.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBounced(Boolean value) {
        this.bounced = value;
    }

    /**
     * Recupera il valore della proprietà retReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetReason() {
        return retReason;
    }

    /**
     * Imposta il valore della proprietà retReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetReason(String value) {
        this.retReason = value;
    }

}
