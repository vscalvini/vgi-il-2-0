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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Purchase information regarding the desired car of the customer
 * 
 * <p>Classe Java per DT_FinancialInfoDesiredCar complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_FinancialInfoDesiredCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedPurchaseDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TypeOfPurchase" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedUsage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedFinancingType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedPriceRange" minOccurs="0">
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
@XmlType(name = "DT_FinancialInfoDesiredCar", propOrder = {
    "purchaseDate",
    "plannedPurchaseDate",
    "typeOfPurchase",
    "plannedUsage",
    "plannedFinancingType",
    "plannedPriceRange"
})
public class DTFinancialInfoDesiredCar {

    @XmlElement(name = "PurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "PlannedPurchaseDate")
    protected String plannedPurchaseDate;
    @XmlElement(name = "TypeOfPurchase")
    protected String typeOfPurchase;
    @XmlElement(name = "PlannedUsage")
    protected String plannedUsage;
    @XmlElement(name = "PlannedFinancingType")
    protected String plannedFinancingType;
    @XmlElement(name = "PlannedPriceRange")
    protected String plannedPriceRange;

    /**
     * Recupera il valore della proprietà purchaseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Imposta il valore della proprietà purchaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Recupera il valore della proprietà plannedPurchaseDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedPurchaseDate() {
        return plannedPurchaseDate;
    }

    /**
     * Imposta il valore della proprietà plannedPurchaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedPurchaseDate(String value) {
        this.plannedPurchaseDate = value;
    }

    /**
     * Recupera il valore della proprietà typeOfPurchase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPurchase() {
        return typeOfPurchase;
    }

    /**
     * Imposta il valore della proprietà typeOfPurchase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPurchase(String value) {
        this.typeOfPurchase = value;
    }

    /**
     * Recupera il valore della proprietà plannedUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedUsage() {
        return plannedUsage;
    }

    /**
     * Imposta il valore della proprietà plannedUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedUsage(String value) {
        this.plannedUsage = value;
    }

    /**
     * Recupera il valore della proprietà plannedFinancingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedFinancingType() {
        return plannedFinancingType;
    }

    /**
     * Imposta il valore della proprietà plannedFinancingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedFinancingType(String value) {
        this.plannedFinancingType = value;
    }

    /**
     * Recupera il valore della proprietà plannedPriceRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedPriceRange() {
        return plannedPriceRange;
    }

    /**
     * Imposta il valore della proprietà plannedPriceRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedPriceRange(String value) {
        this.plannedPriceRange = value;
    }

}
