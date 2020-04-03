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
 * The Class CvnTitleBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnTitleBean", propOrder = {
    "identification",
    "name"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnTitleBean extends CvnBean
{

    /**
     * The identification.
     */
    @XmlElement(name = "Identification")
    private String identification;
    
    /**
     * The name.
     */
    @XmlElement(name = "Name")
    private String name;
}
