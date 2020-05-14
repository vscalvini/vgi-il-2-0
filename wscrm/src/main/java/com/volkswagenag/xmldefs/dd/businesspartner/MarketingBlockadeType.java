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
 * Marketing blockade
 * 
 * <p>Classe Java per MarketingBlockadeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MarketingBlockadeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockType" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="BlockedIND" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}DateType" minOccurs="0"/>
 *         &lt;element name="LastChangeBy" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}LastChangeByType" minOccurs="0"/>
 *         &lt;element name="InboundChannel" type="{http://xmldefs.volkswagenag.com/DD/BasicTypes}CodeType" minOccurs="0"/>
 *         &lt;element name="DealerRef" type="{http://xmldefs.volkswagenag.com/DD/BusinessPartner}PartnerIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingBlockadeType", propOrder = {
    "blockType",
    "blockedIND",
    "lastChangeDate",
    "lastChangeBy",
    "inboundChannel",
    "dealerRef"
})
public class MarketingBlockadeType {

    @XmlElement(name = "BlockType")
    protected CodeType blockType;
    @XmlElement(name = "BlockedIND")
    protected Boolean blockedIND;
    @XmlElement(name = "LastChangeDate")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(name = "LastChangeBy")
    protected LastChangeByType lastChangeBy;
    @XmlElement(name = "InboundChannel")
    protected CodeType inboundChannel;
    @XmlElement(name = "DealerRef")
    protected PartnerIdentifierType dealerRef;

    /**
     * Recupera il valore della proprietà blockType.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBlockType() {
        return blockType;
    }

    /**
     * Imposta il valore della proprietà blockType.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBlockType(CodeType value) {
        this.blockType = value;
    }

    /**
     * Recupera il valore della proprietà blockedIND.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockedIND() {
        return blockedIND;
    }

    /**
     * Imposta il valore della proprietà blockedIND.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockedIND(Boolean value) {
        this.blockedIND = value;
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
     * Recupera il valore della proprietà dealerRef.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public PartnerIdentifierType getDealerRef() {
        return dealerRef;
    }

    /**
     * Imposta il valore della proprietà dealerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public void setDealerRef(PartnerIdentifierType value) {
        this.dealerRef = value;
    }

}
