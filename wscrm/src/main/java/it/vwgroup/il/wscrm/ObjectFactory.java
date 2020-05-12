//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.03.30 alle 03:19:26 PM CEST 
//


package it.vwgroup.il.wscrm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.vwgroup.il.wscrm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthHeader_QNAME = new QName("http://il.vwgroup.it/wscrm", "AuthHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.vwgroup.il.wscrm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveXmlResponse }
     * 
     */
    public SaveXmlResponse createSaveXmlResponse() {
        return new SaveXmlResponse();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link SaveXmlRequest }
     * 
     */
    public SaveXmlRequest createSaveXmlRequest() {
        return new SaveXmlRequest();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://il.vwgroup.it/wscrm", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

}
