package es.um.asio.domain.cvn;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnAuthorBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnAuthorBean", propOrder = {
    "cvnFamilyNameBean",
    "givenName",
    "signature",
    "signatureOrder"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnAuthorBean extends CvnBean
{
    
    /**
     * The cvn family name bean.
     */
    @XmlElement(name = "CvnFamilyNameBean")
    @OneToOne(cascade = CascadeType.ALL)
    private CvnFamilyNameBean cvnFamilyNameBean;
    
    /**
     * The given name.
     */
    @XmlElement(name = "GivenName")
    private String givenName;
    
    /**
     * The signature.
     */
    @XmlElement(name = "Signature")
    private String signature;
    
    /**
     * The signature order.
     */
    @XmlElement(name = "SignatureOrder")
    private Integer signatureOrder;

}
