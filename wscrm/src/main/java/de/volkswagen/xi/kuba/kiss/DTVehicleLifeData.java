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
 * <p>Classe Java per DT_VehicleLifeData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleLifeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Warranties" type="{http://volkswagen.de/xi/kuba/KISS}DT_Warranties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_VehicleLifeData", propOrder = {
    "warranties"
})
public class DTVehicleLifeData {

    @XmlElement(name = "Warranties")
    protected DTWarranties warranties;

    /**
     * Recupera il valore della proprietà warranties.
     * 
     * @return
     *     possible object is
     *     {@link DTWarranties }
     *     
     */
    public DTWarranties getWarranties() {
        return warranties;
    }

    /**
     * Imposta il valore della proprietà warranties.
     * 
     * @param value
     *     allowed object is
     *     {@link DTWarranties }
     *     
     */
    public void setWarranties(DTWarranties value) {
        this.warranties = value;
    }

}
