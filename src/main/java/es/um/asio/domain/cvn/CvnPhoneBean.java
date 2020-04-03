package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnPhoneBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnPhoneBean", propOrder = {
    "extension",
    "internationalCode",
    "number",
    "type"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPhoneBean extends CvnBean
{
    /**
     * The extension.
     */
    @XmlElement(name = "Extension")
    private String extension;
    
    /**
     * The international code.
     */
    @XmlElement(name = "InternationalCode")
    private String internationalCode;
    
    /**
     * The number.
     */
    @XmlElement(name = "Number")
    private String number;
    
    /**
     * The type.
     */
    @XmlElement(name = "Type")
    private String type;
}
