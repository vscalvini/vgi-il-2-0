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
 * Business partner: additional data
 * 
 * <p>Classe Java per DT_AdditionalBPData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_AdditionalBPData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationTyp" type="{http://volkswagen.de/xi/kuba/KISS}DT_IdentificationType" minOccurs="0"/>
 *         &lt;element name="IdentificationNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResponsibleDestrict" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CompanyRegister" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SocietyRegister" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CooperativeRegister" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateOfRegisterEntry" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_AdditionalBPData", propOrder = {
    "identificationTyp",
    "identificationNo",
    "responsibleDestrict",
    "companyRegister",
    "societyRegister",
    "cooperativeRegister",
    "dateOfRegisterEntry"
})
public class DTAdditionalBPData {

    @XmlElement(name = "IdentificationTyp")
    protected String identificationTyp;
    @XmlElement(name = "IdentificationNo")
    protected String identificationNo;
    @XmlElement(name = "ResponsibleDestrict")
    protected String responsibleDestrict;
    @XmlElement(name = "CompanyRegister")
    protected String companyRegister;
    @XmlElement(name = "SocietyRegister")
    protected String societyRegister;
    @XmlElement(name = "CooperativeRegister")
    protected String cooperativeRegister;
    @XmlElement(name = "DateOfRegisterEntry")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfRegisterEntry;

    /**
     * Recupera il valore della proprietà identificationTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationTyp() {
        return identificationTyp;
    }

    /**
     * Imposta il valore della proprietà identificationTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationTyp(String value) {
        this.identificationTyp = value;
    }

    /**
     * Recupera il valore della proprietà identificationNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNo() {
        return identificationNo;
    }

    /**
     * Imposta il valore della proprietà identificationNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNo(String value) {
        this.identificationNo = value;
    }

    /**
     * Recupera il valore della proprietà responsibleDestrict.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleDestrict() {
        return responsibleDestrict;
    }

    /**
     * Imposta il valore della proprietà responsibleDestrict.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleDestrict(String value) {
        this.responsibleDestrict = value;
    }

    /**
     * Recupera il valore della proprietà companyRegister.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegister() {
        return companyRegister;
    }

    /**
     * Imposta il valore della proprietà companyRegister.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegister(String value) {
        this.companyRegister = value;
    }

    /**
     * Recupera il valore della proprietà societyRegister.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocietyRegister() {
        return societyRegister;
    }

    /**
     * Imposta il valore della proprietà societyRegister.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocietyRegister(String value) {
        this.societyRegister = value;
    }

    /**
     * Recupera il valore della proprietà cooperativeRegister.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCooperativeRegister() {
        return cooperativeRegister;
    }

    /**
     * Imposta il valore della proprietà cooperativeRegister.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCooperativeRegister(String value) {
        this.cooperativeRegister = value;
    }

    /**
     * Recupera il valore della proprietà dateOfRegisterEntry.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfRegisterEntry() {
        return dateOfRegisterEntry;
    }

    /**
     * Imposta il valore della proprietà dateOfRegisterEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfRegisterEntry(XMLGregorianCalendar value) {
        this.dateOfRegisterEntry = value;
    }

}
