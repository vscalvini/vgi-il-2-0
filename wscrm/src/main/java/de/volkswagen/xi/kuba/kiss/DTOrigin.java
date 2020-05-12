//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.05.05 alle 10:59:22 AM CEST 
//


package de.volkswagen.xi.kuba.kiss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DT_Origin.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DT_Origin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CIC"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="DLG"/>
 *     &lt;enumeration value="DMA"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FFL"/>
 *     &lt;enumeration value="IKP"/>
 *     &lt;enumeration value="KON"/>
 *     &lt;enumeration value="KZH"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="NWB"/>
 *     &lt;enumeration value="OPF"/>
 *     &lt;enumeration value="Q7"/>
 *     &lt;enumeration value="RSA"/>
 *     &lt;enumeration value="SCF"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="LEA"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="RTD"/>
 *     &lt;enumeration value="MIG"/>
 *     &lt;maxLength value="3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DT_Origin")
@XmlEnum
public enum DTOrigin {

    CC("CC"),
    CIC("CIC"),
    DL("DL"),
    DLG("DLG"),
    DMA("DMA"),
    EP("EP"),
    ET("ET"),
    FFL("FFL"),
    IKP("IKP"),
    KON("KON"),
    KZH("KZH"),
    NEW("NEW"),
    NWB("NWB"),
    OPF("OPF"),
    @XmlEnumValue("Q7")
    Q_7("Q7"),
    RSA("RSA"),
    SCF("SCF"),
    WEB("WEB"),
    LEA("LEA"),
    TT("TT"),
    RTD("RTD"),
    MIG("MIG");
    private final String value;

    DTOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTOrigin fromValue(String v) {
        for (DTOrigin c: DTOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
