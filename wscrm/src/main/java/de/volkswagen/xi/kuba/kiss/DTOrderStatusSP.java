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
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for status informations for the KISS interface
 * 
 * <p>Classe Java per DT_OrderStatusSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_OrderStatusSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusReason" type="{http://volkswagen.de/xi/kuba/KISS}DT_StatusResult" minOccurs="0"/>
 *         &lt;element name="ProcessResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LostReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OfferType" minOccurs="0">
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
@XmlType(name = "DT_OrderStatusSP", propOrder = {
    "userStatus",
    "statusReason",
    "processResult",
    "lostReason",
    "offerType"
})
public class DTOrderStatusSP {

    @XmlElement(name = "UserStatus")
    protected String userStatus;
    @XmlElement(name = "StatusReason")
    protected DTStatusResult statusReason;
    @XmlElement(name = "ProcessResult")
    protected String processResult;
    @XmlElement(name = "LostReason")
    protected String lostReason;
    @XmlElement(name = "OfferType")
    protected String offerType;

    /**
     * Recupera il valore della proprietà userStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Imposta il valore della proprietà userStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Recupera il valore della proprietà statusReason.
     * 
     * @return
     *     possible object is
     *     {@link DTStatusResult }
     *     
     */
    public DTStatusResult getStatusReason() {
        return statusReason;
    }

    /**
     * Imposta il valore della proprietà statusReason.
     * 
     * @param value
     *     allowed object is
     *     {@link DTStatusResult }
     *     
     */
    public void setStatusReason(DTStatusResult value) {
        this.statusReason = value;
    }

    /**
     * Recupera il valore della proprietà processResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessResult() {
        return processResult;
    }

    /**
     * Imposta il valore della proprietà processResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessResult(String value) {
        this.processResult = value;
    }

    /**
     * Recupera il valore della proprietà lostReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostReason() {
        return lostReason;
    }

    /**
     * Imposta il valore della proprietà lostReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostReason(String value) {
        this.lostReason = value;
    }

    /**
     * Recupera il valore della proprietà offerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Imposta il valore della proprietà offerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferType(String value) {
        this.offerType = value;
    }

}
