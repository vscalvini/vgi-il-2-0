//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.03.30 alle 03:19:26 PM CEST 
//


package it.vwgroup.il.wscrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pingResult"
})
@XmlRootElement(name = "PingResponse")
public class PingResponse {

    @XmlElement(name = "PingResult")
    protected String pingResult;

    /**
     * Recupera il valore della proprietà pingResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingResult() {
        return pingResult;
    }

    /**
     * Imposta il valore della proprietà pingResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingResult(String value) {
        this.pingResult = value;
    }

}
