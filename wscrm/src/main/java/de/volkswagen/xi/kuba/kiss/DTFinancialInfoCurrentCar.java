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
 * Data type for current car information in interest
 * 
 * <p>Classe Java per DT_FinancialInfoCurrentCar complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_FinancialInfoCurrentCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DateOfRegistration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CarValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinanceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndOfFinanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_FinancialInfoCurrentCar", propOrder = {
    "purchaseDate",
    "dateOfRegistration",
    "carValue",
    "financeType",
    "endOfFinanceDate"
})
public class DTFinancialInfoCurrentCar {

    @XmlElement(name = "PurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "DateOfRegistration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfRegistration;
    @XmlElement(name = "CarValue")
    protected String carValue;
    @XmlElement(name = "FinanceType")
    protected String financeType;
    @XmlElement(name = "EndOfFinanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endOfFinanceDate;

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
     * Recupera il valore della proprietà dateOfRegistration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfRegistration() {
        return dateOfRegistration;
    }

    /**
     * Imposta il valore della proprietà dateOfRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfRegistration(XMLGregorianCalendar value) {
        this.dateOfRegistration = value;
    }

    /**
     * Recupera il valore della proprietà carValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarValue() {
        return carValue;
    }

    /**
     * Imposta il valore della proprietà carValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarValue(String value) {
        this.carValue = value;
    }

    /**
     * Recupera il valore della proprietà financeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceType() {
        return financeType;
    }

    /**
     * Imposta il valore della proprietà financeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceType(String value) {
        this.financeType = value;
    }

    /**
     * Recupera il valore della proprietà endOfFinanceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfFinanceDate() {
        return endOfFinanceDate;
    }

    /**
     * Imposta il valore della proprietà endOfFinanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfFinanceDate(XMLGregorianCalendar value) {
        this.endOfFinanceDate = value;
    }

}
