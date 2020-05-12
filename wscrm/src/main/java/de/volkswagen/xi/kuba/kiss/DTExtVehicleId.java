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
 * External numbers for identifying OneOrders
 * 
 * <p>Classe Java per DT_ExtVehicleId complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ExtVehicleId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleIDSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ExtVehicleId", propOrder = {
    "vehicleID",
    "vehicleIDType",
    "vehicleIDSystem"
})
public class DTExtVehicleId {

    @XmlElement(name = "VehicleID")
    protected String vehicleID;
    @XmlElement(name = "VehicleIDType")
    protected String vehicleIDType;
    @XmlElement(name = "VehicleIDSystem")
    protected String vehicleIDSystem;

    /**
     * Recupera il valore della proprietà vehicleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Imposta il valore della proprietà vehicleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Recupera il valore della proprietà vehicleIDType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIDType() {
        return vehicleIDType;
    }

    /**
     * Imposta il valore della proprietà vehicleIDType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIDType(String value) {
        this.vehicleIDType = value;
    }

    /**
     * Recupera il valore della proprietà vehicleIDSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIDSystem() {
        return vehicleIDSystem;
    }

    /**
     * Imposta il valore della proprietà vehicleIDSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIDSystem(String value) {
        this.vehicleIDSystem = value;
    }

}
