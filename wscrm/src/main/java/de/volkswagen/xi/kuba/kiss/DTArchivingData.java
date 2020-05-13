//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Archieving data
 * 
 * <p>Classe Java per DT_ArchivingData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ArchivingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ArchLocation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ArchId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "DT_ArchivingData", propOrder = {
    "archDate",
    "archLocation",
    "archId"
})
public class DTArchivingData {

    @XmlElement(name = "ArchDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archDate;
    @XmlElement(name = "ArchLocation", required = true)
    protected String archLocation;
    @XmlElement(name = "ArchId", required = true)
    protected String archId;

    /**
     * Recupera il valore della proprietà archDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchDate() {
        return archDate;
    }

    /**
     * Imposta il valore della proprietà archDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchDate(XMLGregorianCalendar value) {
        this.archDate = value;
    }

    /**
     * Recupera il valore della proprietà archLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchLocation() {
        return archLocation;
    }

    /**
     * Imposta il valore della proprietà archLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchLocation(String value) {
        this.archLocation = value;
    }

    /**
     * Recupera il valore della proprietà archId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchId() {
        return archId;
    }

    /**
     * Imposta il valore della proprietà archId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchId(String value) {
        this.archId = value;
    }

}
