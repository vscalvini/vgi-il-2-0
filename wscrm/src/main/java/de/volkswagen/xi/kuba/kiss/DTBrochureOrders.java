//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Brochure orders
 * 
 * <p>Classe Java per DT_BrochureOrders complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_BrochureOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrochureOrder" type="{http://volkswagen.de/xi/kuba/KISS}DT_BrochureOrder" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BrochureOrders", propOrder = {
    "brochureOrder"
})
public class DTBrochureOrders {

    @XmlElement(name = "BrochureOrder", required = true)
    protected List<DTBrochureOrder> brochureOrder;

    /**
     * Gets the value of the brochureOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brochureOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrochureOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTBrochureOrder }
     * 
     * 
     */
    public List<DTBrochureOrder> getBrochureOrder() {
        if (brochureOrder == null) {
            brochureOrder = new ArrayList<DTBrochureOrder>();
        }
        return this.brochureOrder;
    }

}
