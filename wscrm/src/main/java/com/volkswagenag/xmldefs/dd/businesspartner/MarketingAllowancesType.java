//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package com.volkswagenag.xmldefs.dd.businesspartner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Allowances and blockades for marketing material
 * 
 * <p>Classe Java per MarketingAllowancesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MarketingAllowancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAllowance" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}MarketingAllowanceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingAllowancesType", propOrder = {
    "marketingAllowance"
})
public class MarketingAllowancesType {

    @XmlElement(name = "MarketingAllowance", required = true)
    protected List<MarketingAllowanceType> marketingAllowance;

    /**
     * Gets the value of the marketingAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingAllowanceType }
     * 
     * 
     */
    public List<MarketingAllowanceType> getMarketingAllowance() {
        if (marketingAllowance == null) {
            marketingAllowance = new ArrayList<MarketingAllowanceType>();
        }
        return this.marketingAllowance;
    }

}
