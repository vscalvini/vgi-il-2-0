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
 * Address data of business partner relation 'Contact partner'
 * 
 * <p>Classe Java per DT_PR_AddressDataSP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DT_PR_AddressDataSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Buildung" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *         &lt;element name="InitsSIG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InhouseMail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommunicationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Department" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Function" minOccurs="0">
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
@XmlType(name = "DT_PR_AddressDataSP", propOrder = {
    "standardAddressFlag",
    "buildung",
    "floor",
    "roomNumber",
    "initsSIG",
    "inhouseMail",
    "communicationType",
    "department",
    "function"
})
public class DTPRAddressDataSP {

    @XmlElement(name = "StandardAddressFlag")
    protected Boolean standardAddressFlag;
    @XmlElement(name = "Buildung")
    protected String buildung;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    @XmlElement(name = "InitsSIG")
    protected String initsSIG;
    @XmlElement(name = "InhouseMail")
    protected String inhouseMail;
    @XmlElement(name = "CommunicationType")
    protected String communicationType;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Function")
    protected String function;

    /**
     * Recupera il valore della proprietà standardAddressFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardAddressFlag() {
        return standardAddressFlag;
    }

    /**
     * Imposta il valore della proprietà standardAddressFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardAddressFlag(Boolean value) {
        this.standardAddressFlag = value;
    }

    /**
     * Recupera il valore della proprietà buildung.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildung() {
        return buildung;
    }

    /**
     * Imposta il valore della proprietà buildung.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildung(String value) {
        this.buildung = value;
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
     * Recupera il valore della proprietà initsSIG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitsSIG() {
        return initsSIG;
    }

    /**
     * Imposta il valore della proprietà initsSIG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitsSIG(String value) {
        this.initsSIG = value;
    }

    /**
     * Recupera il valore della proprietà inhouseMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Imposta il valore della proprietà inhouseMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhouseMail(String value) {
        this.inhouseMail = value;
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

}
