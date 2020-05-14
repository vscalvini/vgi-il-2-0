//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.13 alle 11:58:48 AM CEST 
//


package com.volkswagenag.xmldefs.dd.businesspartner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.volkswagenag.xmldefs.dd.basictypes.CodeType;


/**
 * Customer agreed to be contacted for marketing purposes
 * 
 * <p>Classe Java per MarketingAllowanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MarketingAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandCode" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="GeneralMarketingAllowanceIND" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateType" minOccurs="0"/>
 *         &lt;element name="LastChangeBy" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}LastChangeByType" minOccurs="0"/>
 *         &lt;element name="InboundChannel" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="MarketingBlockades" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}MarketingBlockadesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingAllowanceType", propOrder = {
    "brandCode",
    "generalMarketingAllowanceIND",
    "lastChangeDate",
    "lastChangeBy",
    "inboundChannel",
    "marketingBlockades"
})
public class MarketingAllowanceType {

    @XmlElement(name = "BrandCode")
    protected CodeType brandCode;
    @XmlElement(name = "GeneralMarketingAllowanceIND")
    protected Boolean generalMarketingAllowanceIND;
    @XmlElement(name = "LastChangeDate")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(name = "LastChangeBy")
    protected LastChangeByType lastChangeBy;
    @XmlElement(name = "InboundChannel")
    protected CodeType inboundChannel;
    @XmlElement(name = "MarketingBlockades")
    protected MarketingBlockadesType marketingBlockades;

    /**
     * Recupera il valore della proprietà brandCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBrandCode() {
        return brandCode;
    }

    /**
     * Imposta il valore della proprietà brandCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBrandCode(CodeType value) {
        this.brandCode = value;
    }

    /**
     * Recupera il valore della proprietà generalMarketingAllowanceIND.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralMarketingAllowanceIND() {
        return generalMarketingAllowanceIND;
    }

    /**
     * Imposta il valore della proprietà generalMarketingAllowanceIND.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralMarketingAllowanceIND(Boolean value) {
        this.generalMarketingAllowanceIND = value;
    }

    /**
     * Recupera il valore della proprietà lastChangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Imposta il valore della proprietà lastChangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Recupera il valore della proprietà lastChangeBy.
     * 
     * @return
     *     possible object is
     *     {@link LastChangeByType }
     *     
     */
    public LastChangeByType getLastChangeBy() {
        return lastChangeBy;
    }

    /**
     * Imposta il valore della proprietà lastChangeBy.
     * 
     * @param value
     *     allowed object is
     *     {@link LastChangeByType }
     *     
     */
    public void setLastChangeBy(LastChangeByType value) {
        this.lastChangeBy = value;
    }

    /**
     * Recupera il valore della proprietà inboundChannel.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInboundChannel() {
        return inboundChannel;
    }

    /**
     * Imposta il valore della proprietà inboundChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInboundChannel(CodeType value) {
        this.inboundChannel = value;
    }

    /**
     * Recupera il valore della proprietà marketingBlockades.
     * 
     * @return
     *     possible object is
     *     {@link MarketingBlockadesType }
     *     
     */
    public MarketingBlockadesType getMarketingBlockades() {
        return marketingBlockades;
    }

    /**
     * Imposta il valore della proprietà marketingBlockades.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingBlockadesType }
     *     
     */
    public void setMarketingBlockades(MarketingBlockadesType value) {
        this.marketingBlockades = value;
    }

}
