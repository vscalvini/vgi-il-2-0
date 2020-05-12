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
 * Address of a business partner
 * 
 * <p>Classe Java per DT_AddressSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_AddressSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" type="{http://volkswagen.de/xi/kuba/KISS}DT_Method" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressId" minOccurs="0"/>
 *         &lt;element name="AddressNo" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressNoFramework" minOccurs="0"/>
 *         &lt;element name="PersNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsStandard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CareOf" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetAbbr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HouseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HouseNumberCompletion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HouseNumberRange" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="District" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCodeExp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="City" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DifferingCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TimeZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOCountry" minOccurs="0"/>
 *         &lt;element name="Building" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Floor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RoomNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxJurCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransportZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LanguageISO" type="{http://volkswagen.de/xi/kuba/KISS}DT_ISOLanguage" minOccurs="0"/>
 *         &lt;element name="ExternalAddressNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DontUsePOBox" type="{http://volkswagen.de/xi/kuba/KISS}DT_DontUsePOBox" minOccurs="0"/>
 *         &lt;element name="DontUseStreet" type="{http://volkswagen.de/xi/kuba/KISS}DT_DontUseStreet" minOccurs="0"/>
 *         &lt;element name="CommunicationType" type="{http://volkswagen.de/xi/kuba/KISS}DT_CommunicationType" minOccurs="0"/>
 *         &lt;element name="Remark" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POBox" type="{http://volkswagen.de/xi/kuba/KISS}DT_POBoxSP" minOccurs="0"/>
 *         &lt;element name="Usages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Usage" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressUsageSP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddressCode" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressCode" minOccurs="0"/>
 *         &lt;element name="AddressCodingType" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressCodingType" minOccurs="0"/>
 *         &lt;element name="AddressCodingSource" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressCodingSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_AddressSP", propOrder = {
    "method",
    "addressId",
    "addressNo",
    "persNo",
    "isStandard",
    "careOf",
    "street",
    "streetAbbr",
    "houseNumber",
    "houseNumberCompletion",
    "houseNumberRange",
    "street2",
    "street3",
    "street4",
    "street5",
    "district",
    "postalCode",
    "postalCodeExp",
    "city",
    "differingCity",
    "region",
    "timeZone",
    "countryISO",
    "building",
    "floor",
    "roomNumber",
    "taxJurCode",
    "transportZone",
    "languageISO",
    "externalAddressNo",
    "dontUsePOBox",
    "dontUseStreet",
    "communicationType",
    "remark",
    "poBox",
    "usages",
    "addressCode",
    "addressCodingType",
    "addressCodingSource"
})
public class DTAddressSP {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "AddressNo")
    protected String addressNo;
    @XmlElement(name = "PersNo")
    protected String persNo;
    @XmlElement(name = "IsStandard")
    protected Boolean isStandard;
    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "StreetAbbr")
    protected String streetAbbr;
    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "HouseNumberCompletion")
    protected String houseNumberCompletion;
    @XmlElement(name = "HouseNumberRange")
    protected String houseNumberRange;
    @XmlElement(name = "Street2")
    protected String street2;
    @XmlElement(name = "Street3")
    protected String street3;
    @XmlElement(name = "Street4")
    protected String street4;
    @XmlElement(name = "Street5")
    protected String street5;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostalCodeExp")
    protected String postalCodeExp;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "DifferingCity")
    protected String differingCity;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "CountryISO")
    protected String countryISO;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    @XmlElement(name = "TaxJurCode")
    protected String taxJurCode;
    @XmlElement(name = "TransportZone")
    protected String transportZone;
    @XmlElement(name = "LanguageISO")
    protected String languageISO;
    @XmlElement(name = "ExternalAddressNo")
    protected String externalAddressNo;
    @XmlElement(name = "DontUsePOBox")
    protected String dontUsePOBox;
    @XmlElement(name = "DontUseStreet")
    protected String dontUseStreet;
    @XmlElement(name = "CommunicationType")
    protected String communicationType;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "POBox")
    protected DTPOBoxSP poBox;
    @XmlElement(name = "Usages")
    protected DTAddressSP.Usages usages;
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "AddressCodingType")
    protected String addressCodingType;
    @XmlElement(name = "AddressCodingSource")
    protected String addressCodingSource;

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
     * Recupera il valore della proprietà addressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Imposta il valore della proprietà addressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Recupera il valore della proprietà addressNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * Imposta il valore della proprietà addressNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNo(String value) {
        this.addressNo = value;
    }

    /**
     * Recupera il valore della proprietà persNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersNo() {
        return persNo;
    }

    /**
     * Imposta il valore della proprietà persNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersNo(String value) {
        this.persNo = value;
    }

    /**
     * Recupera il valore della proprietà isStandard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandard() {
        return isStandard;
    }

    /**
     * Imposta il valore della proprietà isStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandard(Boolean value) {
        this.isStandard = value;
    }

    /**
     * Recupera il valore della proprietà careOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Imposta il valore della proprietà careOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Recupera il valore della proprietà street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietà street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Recupera il valore della proprietà streetAbbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAbbr() {
        return streetAbbr;
    }

    /**
     * Imposta il valore della proprietà streetAbbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAbbr(String value) {
        this.streetAbbr = value;
    }

    /**
     * Recupera il valore della proprietà houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Imposta il valore della proprietà houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Recupera il valore della proprietà houseNumberCompletion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberCompletion() {
        return houseNumberCompletion;
    }

    /**
     * Imposta il valore della proprietà houseNumberCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberCompletion(String value) {
        this.houseNumberCompletion = value;
    }

    /**
     * Recupera il valore della proprietà houseNumberRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberRange() {
        return houseNumberRange;
    }

    /**
     * Imposta il valore della proprietà houseNumberRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberRange(String value) {
        this.houseNumberRange = value;
    }

    /**
     * Recupera il valore della proprietà street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Imposta il valore della proprietà street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Recupera il valore della proprietà street3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet3() {
        return street3;
    }

    /**
     * Imposta il valore della proprietà street3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet3(String value) {
        this.street3 = value;
    }

    /**
     * Recupera il valore della proprietà street4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet4() {
        return street4;
    }

    /**
     * Imposta il valore della proprietà street4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet4(String value) {
        this.street4 = value;
    }

    /**
     * Recupera il valore della proprietà street5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet5() {
        return street5;
    }

    /**
     * Imposta il valore della proprietà street5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet5(String value) {
        this.street5 = value;
    }

    /**
     * Recupera il valore della proprietà district.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Imposta il valore della proprietà district.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Recupera il valore della proprietà postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Imposta il valore della proprietà postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Recupera il valore della proprietà postalCodeExp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeExp() {
        return postalCodeExp;
    }

    /**
     * Imposta il valore della proprietà postalCodeExp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeExp(String value) {
        this.postalCodeExp = value;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà differingCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifferingCity() {
        return differingCity;
    }

    /**
     * Imposta il valore della proprietà differingCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifferingCity(String value) {
        this.differingCity = value;
    }

    /**
     * Recupera il valore della proprietà region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Imposta il valore della proprietà region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Recupera il valore della proprietà timeZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Imposta il valore della proprietà timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Recupera il valore della proprietà countryISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO() {
        return countryISO;
    }

    /**
     * Imposta il valore della proprietà countryISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO(String value) {
        this.countryISO = value;
    }

    /**
     * Recupera il valore della proprietà building.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Imposta il valore della proprietà building.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Recupera il valore della proprietà floor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Imposta il valore della proprietà floor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Recupera il valore della proprietà roomNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Imposta il valore della proprietà roomNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Recupera il valore della proprietà taxJurCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxJurCode() {
        return taxJurCode;
    }

    /**
     * Imposta il valore della proprietà taxJurCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxJurCode(String value) {
        this.taxJurCode = value;
    }

    /**
     * Recupera il valore della proprietà transportZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportZone() {
        return transportZone;
    }

    /**
     * Imposta il valore della proprietà transportZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportZone(String value) {
        this.transportZone = value;
    }

    /**
     * Recupera il valore della proprietà languageISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISO() {
        return languageISO;
    }

    /**
     * Imposta il valore della proprietà languageISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISO(String value) {
        this.languageISO = value;
    }

    /**
     * Recupera il valore della proprietà externalAddressNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAddressNo() {
        return externalAddressNo;
    }

    /**
     * Imposta il valore della proprietà externalAddressNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAddressNo(String value) {
        this.externalAddressNo = value;
    }

    /**
     * Recupera il valore della proprietà dontUsePOBox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontUsePOBox() {
        return dontUsePOBox;
    }

    /**
     * Imposta il valore della proprietà dontUsePOBox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontUsePOBox(String value) {
        this.dontUsePOBox = value;
    }

    /**
     * Recupera il valore della proprietà dontUseStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontUseStreet() {
        return dontUseStreet;
    }

    /**
     * Imposta il valore della proprietà dontUseStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontUseStreet(String value) {
        this.dontUseStreet = value;
    }

    /**
     * Recupera il valore della proprietà communicationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationType() {
        return communicationType;
    }

    /**
     * Imposta il valore della proprietà communicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationType(String value) {
        this.communicationType = value;
    }

    /**
     * Recupera il valore della proprietà remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Imposta il valore della proprietà remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Recupera il valore della proprietà poBox.
     * 
     * @return
     *     possible object is
     *     {@link DTPOBoxSP }
     *     
     */
    public DTPOBoxSP getPOBox() {
        return poBox;
    }

    /**
     * Imposta il valore della proprietà poBox.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPOBoxSP }
     *     
     */
    public void setPOBox(DTPOBoxSP value) {
        this.poBox = value;
    }

    /**
     * Recupera il valore della proprietà usages.
     * 
     * @return
     *     possible object is
     *     {@link DTAddressSP.Usages }
     *     
     */
    public DTAddressSP.Usages getUsages() {
        return usages;
    }

    /**
     * Imposta il valore della proprietà usages.
     * 
     * @param value
     *     allowed object is
     *     {@link DTAddressSP.Usages }
     *     
     */
    public void setUsages(DTAddressSP.Usages value) {
        this.usages = value;
    }

    /**
     * Recupera il valore della proprietà addressCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Imposta il valore della proprietà addressCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Recupera il valore della proprietà addressCodingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCodingType() {
        return addressCodingType;
    }

    /**
     * Imposta il valore della proprietà addressCodingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCodingType(String value) {
        this.addressCodingType = value;
    }

    /**
     * Recupera il valore della proprietà addressCodingSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCodingSource() {
        return addressCodingSource;
    }

    /**
     * Imposta il valore della proprietà addressCodingSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCodingSource(String value) {
        this.addressCodingSource = value;
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
     *         &lt;element name="Usage" type="{http://volkswagen.de/xi/kuba/KISS}DT_AddressUsageSP" maxOccurs="unbounded" minOccurs="0"/>
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
        "usage"
    })
    public static class Usages {

        @XmlElement(name = "Usage")
        protected List<DTAddressUsageSP> usage;

        /**
         * Gets the value of the usage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTAddressUsageSP }
         * 
         * 
         */
        public List<DTAddressUsageSP> getUsage() {
            if (usage == null) {
                usage = new ArrayList<DTAddressUsageSP>();
            }
            return this.usage;
        }

    }

}
