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
 * Several Roadside assistances
 * 
 * <p>Classe Java per DT_RoadsideAssistances complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_RoadsideAssistances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoadsideAssistance" type="{http://volkswagen.de/xi/kuba/KISS}DT_RoadsideAssistance" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_RoadsideAssistances", propOrder = {
    "roadsideAssistance"
})
public class DTRoadsideAssistances {

    @XmlElement(name = "RoadsideAssistance", required = true)
    protected List<DTRoadsideAssistance> roadsideAssistance;

    /**
     * Gets the value of the roadsideAssistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideAssistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideAssistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTRoadsideAssistance }
     * 
     * 
     */
    public List<DTRoadsideAssistance> getRoadsideAssistance() {
        if (roadsideAssistance == null) {
            roadsideAssistance = new ArrayList<DTRoadsideAssistance>();
        }
        return this.roadsideAssistance;
    }

}
