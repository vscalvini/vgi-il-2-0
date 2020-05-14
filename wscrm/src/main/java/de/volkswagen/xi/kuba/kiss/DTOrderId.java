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
 * Data type for 1order objects
 * 
 * <p>Classe Java per DT_OrderId complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_OrderId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalId" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SearchPrio" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d+"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OrderID" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="36"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OrderIDType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OrderIDSystem" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "DT_OrderId", propOrder = {
    "externalId"
})
public class DTOrderId {

    @XmlElement(name = "ExternalId")
    protected List<DTOrderId.ExternalId> externalId;

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTOrderId.ExternalId }
     * 
     * 
     */
    public List<DTOrderId.ExternalId> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<DTOrderId.ExternalId>();
        }
        return this.externalId;
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
     *         &lt;element name="SearchPrio" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d+"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OrderID" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="36"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OrderIDType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OrderIDSystem" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="40"/>
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
    @XmlType(name = "", propOrder = {
        "searchPrio",
        "orderID",
        "orderIDType",
        "orderIDSystem"
    })
    public static class ExternalId {

        @XmlElement(name = "SearchPrio")
        protected String searchPrio;
        @XmlElement(name = "OrderID")
        protected String orderID;
        @XmlElement(name = "OrderIDType")
        protected String orderIDType;
        @XmlElement(name = "OrderIDSystem")
        protected String orderIDSystem;

        /**
         * Recupera il valore della proprietà searchPrio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchPrio() {
            return searchPrio;
        }

        /**
         * Imposta il valore della proprietà searchPrio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchPrio(String value) {
            this.searchPrio = value;
        }

        /**
         * Recupera il valore della proprietà orderID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * Imposta il valore della proprietà orderID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * Recupera il valore della proprietà orderIDType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderIDType() {
            return orderIDType;
        }

        /**
         * Imposta il valore della proprietà orderIDType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderIDType(String value) {
            this.orderIDType = value;
        }

        /**
         * Recupera il valore della proprietà orderIDSystem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderIDSystem() {
            return orderIDSystem;
        }

        /**
         * Imposta il valore della proprietà orderIDSystem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderIDSystem(String value) {
            this.orderIDSystem = value;
        }

    }

}
