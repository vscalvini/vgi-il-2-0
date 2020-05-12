//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Pricing data of a the course order
 * 
 * <p>Classe Java per OrderPricingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrderPricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCurrency" minOccurs="0"/>
 *         &lt;element name="PriceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PaymentTerms" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tax" type="{http://volkswagen.de/xi/kuba/KISS}OrderPricingTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPricingType", propOrder = {
    "currency",
    "priceDate",
    "paymentTerms",
    "tax",
    "paymentMethod"
})
public class OrderPricingType {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PriceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceDate;
    @XmlElement(name = "PaymentTerms")
    protected String paymentTerms;
    @XmlElement(name = "Tax")
    protected List<OrderPricingTaxType> tax;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;

    /**
     * Recupera il valore della proprietà currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della proprietà currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Recupera il valore della proprietà priceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceDate() {
        return priceDate;
    }

    /**
     * Imposta il valore della proprietà priceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceDate(XMLGregorianCalendar value) {
        this.priceDate = value;
    }

    /**
     * Recupera il valore della proprietà paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Imposta il valore della proprietà paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerms(String value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPricingTaxType }
     * 
     * 
     */
    public List<OrderPricingTaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<OrderPricingTaxType>();
        }
        return this.tax;
    }

    /**
     * Recupera il valore della proprietà paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Imposta il valore della proprietà paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

}
