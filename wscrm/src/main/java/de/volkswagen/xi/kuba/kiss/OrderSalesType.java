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
 * Sales data
 * 
 * <p>Classe Java per OrderSalesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrderSalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRefNoClient" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalRefDateClient" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderSalesType", propOrder = {
    "externalRefNoClient",
    "externalRefDateClient"
})
public class OrderSalesType {

    @XmlElement(name = "ExternalRefNoClient")
    protected String externalRefNoClient;
    @XmlElement(name = "ExternalRefDateClient")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar externalRefDateClient;

    /**
     * Recupera il valore della proprietà externalRefNoClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefNoClient() {
        return externalRefNoClient;
    }

    /**
     * Imposta il valore della proprietà externalRefNoClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefNoClient(String value) {
        this.externalRefNoClient = value;
    }

    /**
     * Recupera il valore della proprietà externalRefDateClient.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExternalRefDateClient() {
        return externalRefDateClient;
    }

    /**
     * Imposta il valore della proprietà externalRefDateClient.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExternalRefDateClient(XMLGregorianCalendar value) {
        this.externalRefDateClient = value;
    }

}
