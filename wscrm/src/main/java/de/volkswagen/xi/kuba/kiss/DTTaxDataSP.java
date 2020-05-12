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
import javax.xml.bind.annotation.XmlType;


/**
 * Tax-relevant data
 * 
 * <p>Classe Java per DT_TaxDataSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_TaxDataSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxForBP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxNumber" type="{http://volkswagen.de/xi/kuba/KISS}DT_TaxNumber" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "DT_TaxDataSP", propOrder = {
    "taxForBP",
    "taxNumbers"
})
public class DTTaxDataSP {

    @XmlElement(name = "TaxForBP")
    protected Boolean taxForBP;
    @XmlElement(name = "TaxNumbers")
    protected DTTaxDataSP.TaxNumbers taxNumbers;

    /**
     * Recupera il valore della proprietà taxForBP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxForBP() {
        return taxForBP;
    }

    /**
     * Imposta il valore della proprietà taxForBP.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxForBP(Boolean value) {
        this.taxForBP = value;
    }

    /**
     * Recupera il valore della proprietà taxNumbers.
     * 
     * @return
     *     possible object is
     *     {@link DTTaxDataSP.TaxNumbers }
     *     
     */
    public DTTaxDataSP.TaxNumbers getTaxNumbers() {
        return taxNumbers;
    }

    /**
     * Imposta il valore della proprietà taxNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTaxDataSP.TaxNumbers }
     *     
     */
    public void setTaxNumbers(DTTaxDataSP.TaxNumbers value) {
        this.taxNumbers = value;
    }


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
     *         &lt;element name="TaxNumber" type="{http://volkswagen.de/xi/kuba/KISS}DT_TaxNumber" maxOccurs="unbounded" minOccurs="0"/>
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
        "taxNumber"
    })
    public static class TaxNumbers {

        @XmlElement(name = "TaxNumber")
        protected List<DTTaxNumber> taxNumber;

        /**
         * Gets the value of the taxNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTTaxNumber }
         * 
         * 
         */
        public List<DTTaxNumber> getTaxNumber() {
            if (taxNumber == null) {
                taxNumber = new ArrayList<DTTaxNumber>();
            }
            return this.taxNumber;
        }

    }

}
