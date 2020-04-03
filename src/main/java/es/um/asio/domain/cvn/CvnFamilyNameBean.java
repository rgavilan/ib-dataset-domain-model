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
 * The Class CvnFamilyNameBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnFamilyNameBean", propOrder = {
    "firstFamilyName",
    "secondFamilyName"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnFamilyNameBean extends CvnBean
{
    
    /**
     * The first family name.
     */
    @XmlElement(name = "FirstFamilyName")
    private String firstFamilyName;
    
    /**
     * The second family name.
     */
    @XmlElement(name = "SecondFamilyName")
    private String secondFamilyName;
}
