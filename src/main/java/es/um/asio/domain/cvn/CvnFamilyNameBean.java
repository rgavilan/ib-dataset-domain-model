//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.07 at 12:34:08 p. m. CEST 
//


package es.um.asio.domain.cvn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CvnFamilyNameBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CvnFamilyNameBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://codes.cvn.fecyt.es/beans}CvnBean">
 *       &lt;sequence>
 *         &lt;element name="FirstFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnFamilyNameBean", propOrder = {
    "firstFamilyName",
    "secondFamilyName"
})
public class CvnFamilyNameBean
    extends CvnBean
{

    @XmlElement(name = "FirstFamilyName")
    protected String firstFamilyName;
    @XmlElement(name = "SecondFamilyName")
    protected String secondFamilyName;

    /**
     * Gets the value of the firstFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFamilyName() {
        return firstFamilyName;
    }

    /**
     * Sets the value of the firstFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFamilyName(String value) {
        this.firstFamilyName = value;
    }

    /**
     * Gets the value of the secondFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondFamilyName() {
        return secondFamilyName;
    }

    /**
     * Sets the value of the secondFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondFamilyName(String value) {
        this.secondFamilyName = value;
    }

}
