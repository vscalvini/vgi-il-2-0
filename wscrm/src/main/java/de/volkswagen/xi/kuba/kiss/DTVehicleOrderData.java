//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vehicle order data
 * 
 * <p>Classe Java per DT_VehicleOrderData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_VehicleOrderData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="CommissionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommissionYear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentificationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DispatchType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationStation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeliverDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CollectLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CollectDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CollectTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="FinanceRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinanceCurrency" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCurrency" minOccurs="0"/>
 *         &lt;element name="FinanceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinanceTypeDetail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinanceCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinancePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DurationUnit" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FinanceMonthlyAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehiclePrice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="8"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Currency" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCurrency" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EndOfLease" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndOfWarranty" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="KindOfSale" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EffectiveDeliveryDate" type="{http://volkswagen.de/xi/kuba/KISS}DT_EffectiveDeliveryDate" minOccurs="0"/>
 *         &lt;element name="BoughtOffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ServiceOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InsuranceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartCoverageDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndCoverageDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ServiceCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TypeOfWarranty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancingCompany" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "DT_VehicleOrderData", propOrder = {
    "method",
    "commissionNumber",
    "commissionYear",
    "orderNumber",
    "identificationNumber",
    "dispatchType",
    "destinationStation",
    "deliverDate",
    "collectLocation",
    "collectDate",
    "collectTime",
    "financeRate",
    "financeCurrency",
    "financeType",
    "financeTypeDetail",
    "financeCategory",
    "financeDate",
    "financePeriod",
    "financeMonthlyAmount",
    "vehiclePrice",
    "endOfLease",
    "endOfWarranty",
    "kindOfSale",
    "effectiveDeliveryDate",
    "boughtOffDate",
    "serviceOrigin",
    "insuranceType",
    "serviceCode",
    "startCoverageDate",
    "endCoverageDate",
    "serviceCancelled",
    "typeOfWarranty",
    "financingCompany"
})
public class DTVehicleOrderData {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "CommissionNumber")
    protected String commissionNumber;
    @XmlElement(name = "CommissionYear")
    protected String commissionYear;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "IdentificationNumber")
    protected String identificationNumber;
    @XmlElement(name = "DispatchType")
    protected String dispatchType;
    @XmlElement(name = "DestinationStation")
    protected String destinationStation;
    @XmlElement(name = "DeliverDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliverDate;
    @XmlElement(name = "CollectLocation")
    protected String collectLocation;
    @XmlElement(name = "CollectDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar collectDate;
    @XmlElement(name = "CollectTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar collectTime;
    @XmlElement(name = "FinanceRate")
    protected BigDecimal financeRate;
    @XmlElement(name = "FinanceCurrency")
    protected String financeCurrency;
    @XmlElement(name = "FinanceType")
    protected String financeType;
    @XmlElement(name = "FinanceTypeDetail")
    protected String financeTypeDetail;
    @XmlElement(name = "FinanceCategory")
    protected String financeCategory;
    @XmlElement(name = "FinanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar financeDate;
    @XmlElement(name = "FinancePeriod")
    protected DTVehicleOrderData.FinancePeriod financePeriod;
    @XmlElement(name = "FinanceMonthlyAmount")
    protected BigDecimal financeMonthlyAmount;
    @XmlElement(name = "VehiclePrice")
    protected DTVehicleOrderData.VehiclePrice vehiclePrice;
    @XmlElement(name = "EndOfLease")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endOfLease;
    @XmlElement(name = "EndOfWarranty")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endOfWarranty;
    @XmlElement(name = "KindOfSale")
    protected String kindOfSale;
    @XmlElement(name = "EffectiveDeliveryDate")
    protected XMLGregorianCalendar effectiveDeliveryDate;
    @XmlElement(name = "BoughtOffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar boughtOffDate;
    @XmlElement(name = "ServiceOrigin")
    protected String serviceOrigin;
    @XmlElement(name = "InsuranceType")
    protected String insuranceType;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "StartCoverageDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startCoverageDate;
    @XmlElement(name = "EndCoverageDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endCoverageDate;
    @XmlElement(name = "ServiceCancelled")
    protected Boolean serviceCancelled;
    @XmlElement(name = "TypeOfWarranty")
    protected String typeOfWarranty;
    @XmlElement(name = "FinancingCompany")
    protected String financingCompany;

    /**
     * Recupera il valore della proprietà method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Imposta il valore della proprietà method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Recupera il valore della proprietà commissionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionNumber() {
        return commissionNumber;
    }

    /**
     * Imposta il valore della proprietà commissionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionNumber(String value) {
        this.commissionNumber = value;
    }

    /**
     * Recupera il valore della proprietà commissionYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionYear() {
        return commissionYear;
    }

    /**
     * Imposta il valore della proprietà commissionYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionYear(String value) {
        this.commissionYear = value;
    }

    /**
     * Recupera il valore della proprietà orderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Imposta il valore della proprietà orderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Recupera il valore della proprietà identificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Imposta il valore della proprietà identificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Recupera il valore della proprietà dispatchType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchType() {
        return dispatchType;
    }

    /**
     * Imposta il valore della proprietà dispatchType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchType(String value) {
        this.dispatchType = value;
    }

    /**
     * Recupera il valore della proprietà destinationStation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /**
     * Imposta il valore della proprietà destinationStation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStation(String value) {
        this.destinationStation = value;
    }

    /**
     * Recupera il valore della proprietà deliverDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliverDate() {
        return deliverDate;
    }

    /**
     * Imposta il valore della proprietà deliverDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliverDate(XMLGregorianCalendar value) {
        this.deliverDate = value;
    }

    /**
     * Recupera il valore della proprietà collectLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectLocation() {
        return collectLocation;
    }

    /**
     * Imposta il valore della proprietà collectLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectLocation(String value) {
        this.collectLocation = value;
    }

    /**
     * Recupera il valore della proprietà collectDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectDate() {
        return collectDate;
    }

    /**
     * Imposta il valore della proprietà collectDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectDate(XMLGregorianCalendar value) {
        this.collectDate = value;
    }

    /**
     * Recupera il valore della proprietà collectTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectTime() {
        return collectTime;
    }

    /**
     * Imposta il valore della proprietà collectTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectTime(XMLGregorianCalendar value) {
        this.collectTime = value;
    }

    /**
     * Recupera il valore della proprietà financeRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinanceRate() {
        return financeRate;
    }

    /**
     * Imposta il valore della proprietà financeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinanceRate(BigDecimal value) {
        this.financeRate = value;
    }

    /**
     * Recupera il valore della proprietà financeCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceCurrency() {
        return financeCurrency;
    }

    /**
     * Imposta il valore della proprietà financeCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceCurrency(String value) {
        this.financeCurrency = value;
    }

    /**
     * Recupera il valore della proprietà financeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceType() {
        return financeType;
    }

    /**
     * Imposta il valore della proprietà financeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceType(String value) {
        this.financeType = value;
    }

    /**
     * Recupera il valore della proprietà financeTypeDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceTypeDetail() {
        return financeTypeDetail;
    }

    /**
     * Imposta il valore della proprietà financeTypeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceTypeDetail(String value) {
        this.financeTypeDetail = value;
    }

    /**
     * Recupera il valore della proprietà financeCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceCategory() {
        return financeCategory;
    }

    /**
     * Imposta il valore della proprietà financeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceCategory(String value) {
        this.financeCategory = value;
    }

    /**
     * Recupera il valore della proprietà financeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinanceDate() {
        return financeDate;
    }

    /**
     * Imposta il valore della proprietà financeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinanceDate(XMLGregorianCalendar value) {
        this.financeDate = value;
    }

    /**
     * Recupera il valore della proprietà financePeriod.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleOrderData.FinancePeriod }
     *     
     */
    public DTVehicleOrderData.FinancePeriod getFinancePeriod() {
        return financePeriod;
    }

    /**
     * Imposta il valore della proprietà financePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleOrderData.FinancePeriod }
     *     
     */
    public void setFinancePeriod(DTVehicleOrderData.FinancePeriod value) {
        this.financePeriod = value;
    }

    /**
     * Recupera il valore della proprietà financeMonthlyAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinanceMonthlyAmount() {
        return financeMonthlyAmount;
    }

    /**
     * Imposta il valore della proprietà financeMonthlyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinanceMonthlyAmount(BigDecimal value) {
        this.financeMonthlyAmount = value;
    }

    /**
     * Recupera il valore della proprietà vehiclePrice.
     * 
     * @return
     *     possible object is
     *     {@link DTVehicleOrderData.VehiclePrice }
     *     
     */
    public DTVehicleOrderData.VehiclePrice getVehiclePrice() {
        return vehiclePrice;
    }

    /**
     * Imposta il valore della proprietà vehiclePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVehicleOrderData.VehiclePrice }
     *     
     */
    public void setVehiclePrice(DTVehicleOrderData.VehiclePrice value) {
        this.vehiclePrice = value;
    }

    /**
     * Recupera il valore della proprietà endOfLease.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfLease() {
        return endOfLease;
    }

    /**
     * Imposta il valore della proprietà endOfLease.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfLease(XMLGregorianCalendar value) {
        this.endOfLease = value;
    }

    /**
     * Recupera il valore della proprietà endOfWarranty.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfWarranty() {
        return endOfWarranty;
    }

    /**
     * Imposta il valore della proprietà endOfWarranty.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfWarranty(XMLGregorianCalendar value) {
        this.endOfWarranty = value;
    }

    /**
     * Recupera il valore della proprietà kindOfSale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindOfSale() {
        return kindOfSale;
    }

    /**
     * Imposta il valore della proprietà kindOfSale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindOfSale(String value) {
        this.kindOfSale = value;
    }

    /**
     * Recupera il valore della proprietà effectiveDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDeliveryDate() {
        return effectiveDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà effectiveDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDeliveryDate(XMLGregorianCalendar value) {
        this.effectiveDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà boughtOffDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoughtOffDate() {
        return boughtOffDate;
    }

    /**
     * Imposta il valore della proprietà boughtOffDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoughtOffDate(XMLGregorianCalendar value) {
        this.boughtOffDate = value;
    }

    /**
     * Recupera il valore della proprietà serviceOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrigin() {
        return serviceOrigin;
    }

    /**
     * Imposta il valore della proprietà serviceOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrigin(String value) {
        this.serviceOrigin = value;
    }

    /**
     * Recupera il valore della proprietà insuranceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * Imposta il valore della proprietà insuranceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceType(String value) {
        this.insuranceType = value;
    }

    /**
     * Recupera il valore della proprietà serviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Imposta il valore della proprietà serviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Recupera il valore della proprietà startCoverageDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartCoverageDate() {
        return startCoverageDate;
    }

    /**
     * Imposta il valore della proprietà startCoverageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartCoverageDate(XMLGregorianCalendar value) {
        this.startCoverageDate = value;
    }

    /**
     * Recupera il valore della proprietà endCoverageDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndCoverageDate() {
        return endCoverageDate;
    }

    /**
     * Imposta il valore della proprietà endCoverageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndCoverageDate(XMLGregorianCalendar value) {
        this.endCoverageDate = value;
    }

    /**
     * Recupera il valore della proprietà serviceCancelled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceCancelled() {
        return serviceCancelled;
    }

    /**
     * Imposta il valore della proprietà serviceCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceCancelled(Boolean value) {
        this.serviceCancelled = value;
    }

    /**
     * Recupera il valore della proprietà typeOfWarranty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfWarranty() {
        return typeOfWarranty;
    }

    /**
     * Imposta il valore della proprietà typeOfWarranty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfWarranty(String value) {
        this.typeOfWarranty = value;
    }

    /**
     * Recupera il valore della proprietà financingCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancingCompany() {
        return financingCompany;
    }

    /**
     * Imposta il valore della proprietà financingCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancingCompany(String value) {
        this.financingCompany = value;
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
     *         &lt;element name="Duration" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DurationUnit" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
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
        "duration",
        "durationUnit"
    })
    public static class FinancePeriod {

        @XmlElement(name = "Duration")
        protected BigInteger duration;
        @XmlElement(name = "DurationUnit")
        protected String durationUnit;

        /**
         * Recupera il valore della proprietà duration.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * Imposta il valore della proprietà duration.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * Recupera il valore della proprietà durationUnit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDurationUnit() {
            return durationUnit;
        }

        /**
         * Imposta il valore della proprietà durationUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDurationUnit(String value) {
            this.durationUnit = value;
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
     *         &lt;element name="Value" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="8"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Currency" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCurrency" minOccurs="0"/>
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
        "value",
        "currency"
    })
    public static class VehiclePrice {

        @XmlElement(name = "Value")
        protected BigDecimal value;
        @XmlElement(name = "Currency")
        protected String currency;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà currency.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Imposta il valore della proprietà currency.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

}
