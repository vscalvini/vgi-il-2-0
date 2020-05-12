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
 * Information about the desired car
 * 
 * <p>Classe Java per DT_DesiredCar complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_DesiredCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModelAttributes" type="{http://volkswagen.de/xi/kuba/KISS}DT_ModelAttributesDesiredCar"/>
 *         &lt;element name="FinancialInformation" type="{http://volkswagen.de/xi/kuba/KISS}DT_FinancialInfoDesiredCar" minOccurs="0"/>
 *         &lt;element name="TestDriveInformation" type="{http://volkswagen.de/xi/kuba/KISS}DT_TestDriveInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_DesiredCar", propOrder = {
    "modelAttributes",
    "financialInformation",
    "testDriveInformation"
})
public class DTDesiredCar {

    @XmlElement(name = "ModelAttributes", required = true)
    protected DTModelAttributesDesiredCar modelAttributes;
    @XmlElement(name = "FinancialInformation")
    protected DTFinancialInfoDesiredCar financialInformation;
    @XmlElement(name = "TestDriveInformation")
    protected DTTestDriveInformation testDriveInformation;

    /**
     * Recupera il valore della proprietà modelAttributes.
     * 
     * @return
     *     possible object is
     *     {@link DTModelAttributesDesiredCar }
     *     
     */
    public DTModelAttributesDesiredCar getModelAttributes() {
        return modelAttributes;
    }

    /**
     * Imposta il valore della proprietà modelAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTModelAttributesDesiredCar }
     *     
     */
    public void setModelAttributes(DTModelAttributesDesiredCar value) {
        this.modelAttributes = value;
    }

    /**
     * Recupera il valore della proprietà financialInformation.
     * 
     * @return
     *     possible object is
     *     {@link DTFinancialInfoDesiredCar }
     *     
     */
    public DTFinancialInfoDesiredCar getFinancialInformation() {
        return financialInformation;
    }

    /**
     * Imposta il valore della proprietà financialInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link DTFinancialInfoDesiredCar }
     *     
     */
    public void setFinancialInformation(DTFinancialInfoDesiredCar value) {
        this.financialInformation = value;
    }

    /**
     * Recupera il valore della proprietà testDriveInformation.
     * 
     * @return
     *     possible object is
     *     {@link DTTestDriveInformation }
     *     
     */
    public DTTestDriveInformation getTestDriveInformation() {
        return testDriveInformation;
    }

    /**
     * Imposta il valore della proprietà testDriveInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTestDriveInformation }
     *     
     */
    public void setTestDriveInformation(DTTestDriveInformation value) {
        this.testDriveInformation = value;
    }

}
