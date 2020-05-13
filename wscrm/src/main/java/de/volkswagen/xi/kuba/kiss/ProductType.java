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
 * One single Product
 * 
 * <p>Classe Java per ProductType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle"/>
 *         &lt;element name="ProductGUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectFamily" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductInstanceExternalID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExternalId" type="{http://volkswagen.de/xi/kuba/KISS}ProductExternalIdType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductInstanceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductInstanceLicence" type="{http://volkswagen.de/xi/kuba/KISS}ProductLicenceType" minOccurs="0"/>
 *         &lt;element name="ExternalOrder" type="{http://volkswagen.de/xi/kuba/KISS}ExternalOrderType" minOccurs="0"/>
 *         &lt;element name="ProductData" type="{http://volkswagen.de/xi/kuba/KISS}ProductDataType" minOccurs="0"/>
 *         &lt;element name="ProductPartners" type="{http://volkswagen.de/xi/kuba/KISS}ProductPartnersType" minOccurs="0"/>
 *         &lt;element name="VehicleRefHandles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded"/>
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
@XmlType(name = "ProductType", propOrder = {
    "referenceHandle",
    "productGUID",
    "objectFamily",
    "productInstanceExternalID",
    "externalIds",
    "productInstanceStatus",
    "productInstanceLicence",
    "externalOrder",
    "productData",
    "productPartners",
    "vehicleRefHandles"
})
public class ProductType {

    @XmlElement(name = "ReferenceHandle", required = true)
    protected String referenceHandle;
    @XmlElement(name = "ProductGUID")
    protected String productGUID;
    @XmlElement(name = "ObjectFamily")
    protected String objectFamily;
    @XmlElement(name = "ProductInstanceExternalID")
    protected String productInstanceExternalID;
    @XmlElement(name = "ExternalIds")
    protected ProductType.ExternalIds externalIds;
    @XmlElement(name = "ProductInstanceStatus")
    protected String productInstanceStatus;
    @XmlElement(name = "ProductInstanceLicence")
    protected ProductLicenceType productInstanceLicence;
    @XmlElement(name = "ExternalOrder")
    protected ExternalOrderType externalOrder;
    @XmlElement(name = "ProductData")
    protected ProductDataType productData;
    @XmlElement(name = "ProductPartners")
    protected ProductPartnersType productPartners;
    @XmlElement(name = "VehicleRefHandles")
    protected ProductType.VehicleRefHandles vehicleRefHandles;

    /**
     * Recupera il valore della proprietà referenceHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceHandle() {
        return referenceHandle;
    }

    /**
     * Imposta il valore della proprietà referenceHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceHandle(String value) {
        this.referenceHandle = value;
    }

    /**
     * Recupera il valore della proprietà productGUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGUID() {
        return productGUID;
    }

    /**
     * Imposta il valore della proprietà productGUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGUID(String value) {
        this.productGUID = value;
    }

    /**
     * Recupera il valore della proprietà objectFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectFamily() {
        return objectFamily;
    }

    /**
     * Imposta il valore della proprietà objectFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectFamily(String value) {
        this.objectFamily = value;
    }

    /**
     * Recupera il valore della proprietà productInstanceExternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInstanceExternalID() {
        return productInstanceExternalID;
    }

    /**
     * Imposta il valore della proprietà productInstanceExternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInstanceExternalID(String value) {
        this.productInstanceExternalID = value;
    }

    /**
     * Recupera il valore della proprietà externalIds.
     * 
     * @return
     *     possible object is
     *     {@link ProductType.ExternalIds }
     *     
     */
    public ProductType.ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * Imposta il valore della proprietà externalIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType.ExternalIds }
     *     
     */
    public void setExternalIds(ProductType.ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Recupera il valore della proprietà productInstanceStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInstanceStatus() {
        return productInstanceStatus;
    }

    /**
     * Imposta il valore della proprietà productInstanceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInstanceStatus(String value) {
        this.productInstanceStatus = value;
    }

    /**
     * Recupera il valore della proprietà productInstanceLicence.
     * 
     * @return
     *     possible object is
     *     {@link ProductLicenceType }
     *     
     */
    public ProductLicenceType getProductInstanceLicence() {
        return productInstanceLicence;
    }

    /**
     * Imposta il valore della proprietà productInstanceLicence.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLicenceType }
     *     
     */
    public void setProductInstanceLicence(ProductLicenceType value) {
        this.productInstanceLicence = value;
    }

    /**
     * Recupera il valore della proprietà externalOrder.
     * 
     * @return
     *     possible object is
     *     {@link ExternalOrderType }
     *     
     */
    public ExternalOrderType getExternalOrder() {
        return externalOrder;
    }

    /**
     * Imposta il valore della proprietà externalOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalOrderType }
     *     
     */
    public void setExternalOrder(ExternalOrderType value) {
        this.externalOrder = value;
    }

    /**
     * Recupera il valore della proprietà productData.
     * 
     * @return
     *     possible object is
     *     {@link ProductDataType }
     *     
     */
    public ProductDataType getProductData() {
        return productData;
    }

    /**
     * Imposta il valore della proprietà productData.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDataType }
     *     
     */
    public void setProductData(ProductDataType value) {
        this.productData = value;
    }

    /**
     * Recupera il valore della proprietà productPartners.
     * 
     * @return
     *     possible object is
     *     {@link ProductPartnersType }
     *     
     */
    public ProductPartnersType getProductPartners() {
        return productPartners;
    }

    /**
     * Imposta il valore della proprietà productPartners.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPartnersType }
     *     
     */
    public void setProductPartners(ProductPartnersType value) {
        this.productPartners = value;
    }

    /**
     * Recupera il valore della proprietà vehicleRefHandles.
     * 
     * @return
     *     possible object is
     *     {@link ProductType.VehicleRefHandles }
     *     
     */
    public ProductType.VehicleRefHandles getVehicleRefHandles() {
        return vehicleRefHandles;
    }

    /**
     * Imposta il valore della proprietà vehicleRefHandles.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType.VehicleRefHandles }
     *     
     */
    public void setVehicleRefHandles(ProductType.VehicleRefHandles value) {
        this.vehicleRefHandles = value;
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
     *         &lt;element name="ExternalId" type="{http://volkswagen.de/xi/kuba/KISS}ProductExternalIdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "externalId"
    })
    public static class ExternalIds {

        @XmlElement(name = "ExternalId")
        protected List<ProductExternalIdType> externalId;

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
         * {@link ProductExternalIdType }
         * 
         * 
         */
        public List<ProductExternalIdType> getExternalId() {
            if (externalId == null) {
                externalId = new ArrayList<ProductExternalIdType>();
            }
            return this.externalId;
        }

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
     *         &lt;element name="VehicleRefHandle" type="{http://volkswagen.de/xi/kuba/KISS}DT_ReferenceHandle" maxOccurs="unbounded"/>
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
        "vehicleRefHandle"
    })
    public static class VehicleRefHandles {

        @XmlElement(name = "VehicleRefHandle", required = true)
        protected List<String> vehicleRefHandle;

        /**
         * Gets the value of the vehicleRefHandle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRefHandle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRefHandle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVehicleRefHandle() {
            if (vehicleRefHandle == null) {
                vehicleRefHandle = new ArrayList<String>();
            }
            return this.vehicleRefHandle;
        }

    }

}
