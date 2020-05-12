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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Organization data of a business partner
 * 
 * <p>Classe Java per DT_PartnerOrganizationSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PartnerOrganizationSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalForm" type="{http://volkswagen.de/xi/kuba/KISS}DT_LegalForm" minOccurs="0"/>
 *         &lt;element name="IndustrySector" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FoundationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LiqudationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LocNo1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocNo2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CheckDigit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalOrg" type="{http://volkswagen.de/xi/kuba/KISS}DT_LegalOrg" minOccurs="0"/>
 *         &lt;element name="Makes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Make" type="{http://volkswagen.de/xi/kuba/KISS}DT_BrandSP" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_PartnerOrganizationSP", propOrder = {
    "name1",
    "name2",
    "name3",
    "name4",
    "legalForm",
    "industrySector",
    "foundationDate",
    "liqudationDate",
    "locNo1",
    "locNo2",
    "checkDigit",
    "legalOrg",
    "makes"
})
public class DTPartnerOrganizationSP {

    @XmlElement(name = "Name1")
    protected String name1;
    @XmlElement(name = "Name2")
    protected String name2;
    @XmlElement(name = "Name3")
    protected String name3;
    @XmlElement(name = "Name4")
    protected String name4;
    @XmlElement(name = "LegalForm")
    protected String legalForm;
    @XmlElement(name = "IndustrySector")
    protected String industrySector;
    @XmlElement(name = "FoundationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar foundationDate;
    @XmlElement(name = "LiqudationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liqudationDate;
    @XmlElement(name = "LocNo1")
    protected String locNo1;
    @XmlElement(name = "LocNo2")
    protected String locNo2;
    @XmlElement(name = "CheckDigit")
    protected String checkDigit;
    @XmlElement(name = "LegalOrg")
    protected String legalOrg;
    @XmlElement(name = "Makes")
    protected DTPartnerOrganizationSP.Makes makes;

    /**
     * Recupera il valore della proprietà name1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Imposta il valore della proprietà name1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Recupera il valore della proprietà name2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Imposta il valore della proprietà name2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Recupera il valore della proprietà name3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Imposta il valore della proprietà name3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * Recupera il valore della proprietà name4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * Imposta il valore della proprietà name4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * Recupera il valore della proprietà legalForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Imposta il valore della proprietà legalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Recupera il valore della proprietà industrySector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrySector() {
        return industrySector;
    }

    /**
     * Imposta il valore della proprietà industrySector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrySector(String value) {
        this.industrySector = value;
    }

    /**
     * Recupera il valore della proprietà foundationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundationDate() {
        return foundationDate;
    }

    /**
     * Imposta il valore della proprietà foundationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundationDate(XMLGregorianCalendar value) {
        this.foundationDate = value;
    }

    /**
     * Recupera il valore della proprietà liqudationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLiqudationDate() {
        return liqudationDate;
    }

    /**
     * Imposta il valore della proprietà liqudationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLiqudationDate(XMLGregorianCalendar value) {
        this.liqudationDate = value;
    }

    /**
     * Recupera il valore della proprietà locNo1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocNo1() {
        return locNo1;
    }

    /**
     * Imposta il valore della proprietà locNo1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocNo1(String value) {
        this.locNo1 = value;
    }

    /**
     * Recupera il valore della proprietà locNo2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocNo2() {
        return locNo2;
    }

    /**
     * Imposta il valore della proprietà locNo2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocNo2(String value) {
        this.locNo2 = value;
    }

    /**
     * Recupera il valore della proprietà checkDigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDigit() {
        return checkDigit;
    }

    /**
     * Imposta il valore della proprietà checkDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDigit(String value) {
        this.checkDigit = value;
    }

    /**
     * Recupera il valore della proprietà legalOrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalOrg() {
        return legalOrg;
    }

    /**
     * Imposta il valore della proprietà legalOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalOrg(String value) {
        this.legalOrg = value;
    }

    /**
     * Recupera il valore della proprietà makes.
     * 
     * @return
     *     possible object is
     *     {@link DTPartnerOrganizationSP.Makes }
     *     
     */
    public DTPartnerOrganizationSP.Makes getMakes() {
        return makes;
    }

    /**
     * Imposta il valore della proprietà makes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTPartnerOrganizationSP.Makes }
     *     
     */
    public void setMakes(DTPartnerOrganizationSP.Makes value) {
        this.makes = value;
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
     *         &lt;element name="Make" type="{http://volkswagen.de/xi/kuba/KISS}DT_BrandSP" maxOccurs="unbounded" minOccurs="0"/>
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
        "make"
    })
    public static class Makes {

        @XmlElement(name = "Make")
        protected List<DTBrandSP> make;

        /**
         * Gets the value of the make property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the make property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMake().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTBrandSP }
         * 
         * 
         */
        public List<DTBrandSP> getMake() {
            if (make == null) {
                make = new ArrayList<DTBrandSP>();
            }
            return this.make;
        }

    }

}
