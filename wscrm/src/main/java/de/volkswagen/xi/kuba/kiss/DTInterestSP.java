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
 * Data type for interest data
 * 
 * <p>Classe Java per DT_InterestSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_InterestSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" minOccurs="0"/>
 *         &lt;element name="DesiredCar" type="{http://volkswagen.de/xi/kuba/KISS}DT_DesiredCar"/>
 *         &lt;element name="CurrentCar" type="{http://volkswagen.de/xi/kuba/KISS}DT_CurrentCarSP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_InterestSP", propOrder = {
    "referenceHandle",
    "desiredCar",
    "currentCar"
})
public class DTInterestSP {

    @XmlElement(name = "ReferenceHandle")
    protected String referenceHandle;
    @XmlElement(name = "DesiredCar", required = true)
    protected DTDesiredCar desiredCar;
    @XmlElement(name = "CurrentCar")
    protected DTCurrentCarSP currentCar;

    /**
     * Recupera il valore della proprietà referenceHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceHandle() {
        return referenceHandle;
    }

    /**
     * Imposta il valore della proprietà referenceHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceHandle(String value) {
        this.referenceHandle = value;
    }

    /**
     * Recupera il valore della proprietà desiredCar.
     * 
     * @return
     *     possible object is
     *     {@link DTDesiredCar }
     *     
     */
    public DTDesiredCar getDesiredCar() {
        return desiredCar;
    }

    /**
     * Imposta il valore della proprietà desiredCar.
     * 
     * @param value
     *     allowed object is
     *     {@link DTDesiredCar }
     *     
     */
    public void setDesiredCar(DTDesiredCar value) {
        this.desiredCar = value;
    }

    /**
     * Recupera il valore della proprietà currentCar.
     * 
     * @return
     *     possible object is
     *     {@link DTCurrentCarSP }
     *     
     */
    public DTCurrentCarSP getCurrentCar() {
        return currentCar;
    }

    /**
     * Imposta il valore della proprietà currentCar.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCurrentCarSP }
     *     
     */
    public void setCurrentCar(DTCurrentCarSP value) {
        this.currentCar = value;
    }

}
