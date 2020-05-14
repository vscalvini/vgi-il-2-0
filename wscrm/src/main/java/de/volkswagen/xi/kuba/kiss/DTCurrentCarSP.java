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
 * Data type for current car information in interest
 * 
 * <p>Classe Java per DT_CurrentCarSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_CurrentCarSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModelAttributes" type="{http://volkswagen.de/xi/kuba/KISS}DT_ModelAttributesCurrentCar" minOccurs="0"/>
 *         &lt;element name="FinancialInformation" type="{http://volkswagen.de/xi/kuba/KISS}DT_FinancialInfoCurrentCar" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_CurrentCarSP", propOrder = {
    "modelAttributes",
    "financialInformation"
})
public class DTCurrentCarSP {

    @XmlElement(name = "ModelAttributes")
    protected DTModelAttributesCurrentCar modelAttributes;
    @XmlElement(name = "FinancialInformation")
    protected DTFinancialInfoCurrentCar financialInformation;

    /**
     * Recupera il valore della proprietà modelAttributes.
     * 
     * @return
     *     possible object is
     *     {@link DTModelAttributesCurrentCar }
     *     
     */
    public DTModelAttributesCurrentCar getModelAttributes() {
        return modelAttributes;
    }

    /**
     * Imposta il valore della proprietà modelAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTModelAttributesCurrentCar }
     *     
     */
    public void setModelAttributes(DTModelAttributesCurrentCar value) {
        this.modelAttributes = value;
    }

    /**
     * Recupera il valore della proprietà financialInformation.
     * 
     * @return
     *     possible object is
     *     {@link DTFinancialInfoCurrentCar }
     *     
     */
    public DTFinancialInfoCurrentCar getFinancialInformation() {
        return financialInformation;
    }

    /**
     * Imposta il valore della proprietà financialInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link DTFinancialInfoCurrentCar }
     *     
     */
    public void setFinancialInformation(DTFinancialInfoCurrentCar value) {
        this.financialInformation = value;
    }

}
