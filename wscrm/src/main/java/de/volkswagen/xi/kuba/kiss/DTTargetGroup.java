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
 * Data type containing information of BP assignments to Target groups
 * 
 * <p>Classe Java per DT_TargetGroup complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_TargetGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfileSet" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="72"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GroupId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="72"/>
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
@XmlType(name = "DT_TargetGroup", propOrder = {
    "segmentType",
    "profileSet",
    "groupId"
})
public class DTTargetGroup {

    @XmlElement(name = "SegmentType", required = true)
    protected String segmentType;
    @XmlElement(name = "ProfileSet")
    protected String profileSet;
    @XmlElement(name = "GroupId", required = true)
    protected String groupId;

    /**
     * Recupera il valore della proprietà segmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * Imposta il valore della proprietà segmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentType(String value) {
        this.segmentType = value;
    }

    /**
     * Recupera il valore della proprietà profileSet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileSet() {
        return profileSet;
    }

    /**
     * Imposta il valore della proprietà profileSet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileSet(String value) {
        this.profileSet = value;
    }

    /**
     * Recupera il valore della proprietà groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Imposta il valore della proprietà groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

}
