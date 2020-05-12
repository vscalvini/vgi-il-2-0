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
 * Central data of business partner relation 'Contact partner'
 * 
 * <p>Classe Java per DT_PR_CentralData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PR_CentralData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Function" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartmentName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Department" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Authority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VIP" type="{http://volkswagen.de/xi/kuba/KISS}DT_VIP" minOccurs="0"/>
 *         &lt;element name="Comment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TelNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TelNoExt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FaxNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FaxNoExt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="241"/>
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
@XmlType(name = "DT_PR_CentralData", propOrder = {
    "functionName",
    "function",
    "departmentName",
    "department",
    "authority",
    "vip",
    "comment",
    "telNo",
    "telNoExt",
    "faxNo",
    "faxNoExt",
    "email"
})
public class DTPRCentralData {

    @XmlElement(name = "FunctionName")
    protected String functionName;
    @XmlElement(name = "Function")
    protected String function;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Authority")
    protected String authority;
    @XmlElement(name = "VIP")
    protected String vip;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "TelNo")
    protected String telNo;
    @XmlElement(name = "TelNoExt")
    protected String telNoExt;
    @XmlElement(name = "FaxNo")
    protected String faxNo;
    @XmlElement(name = "FaxNoExt")
    protected String faxNoExt;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Recupera il valore della proprietà functionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * Imposta il valore della proprietà functionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionName(String value) {
        this.functionName = value;
    }

    /**
     * Recupera il valore della proprietà function.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Imposta il valore della proprietà function.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Recupera il valore della proprietà departmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Imposta il valore della proprietà departmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Recupera il valore della proprietà department.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Imposta il valore della proprietà department.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Recupera il valore della proprietà authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Imposta il valore della proprietà authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Recupera il valore della proprietà vip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIP() {
        return vip;
    }

    /**
     * Imposta il valore della proprietà vip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIP(String value) {
        this.vip = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Recupera il valore della proprietà telNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * Imposta il valore della proprietà telNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNo(String value) {
        this.telNo = value;
    }

    /**
     * Recupera il valore della proprietà telNoExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNoExt() {
        return telNoExt;
    }

    /**
     * Imposta il valore della proprietà telNoExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNoExt(String value) {
        this.telNoExt = value;
    }

    /**
     * Recupera il valore della proprietà faxNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Imposta il valore della proprietà faxNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
    }

    /**
     * Recupera il valore della proprietà faxNoExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNoExt() {
        return faxNoExt;
    }

    /**
     * Imposta il valore della proprietà faxNoExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNoExt(String value) {
        this.faxNoExt = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
