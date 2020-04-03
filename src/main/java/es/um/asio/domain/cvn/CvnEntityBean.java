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
 * The Class CvnEntityBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnEntityBean", propOrder = {
    "id",
    "name"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnEntityBean extends CvnBean
{
    
    /**
     * The id.
     */
    @XmlElement(name = "Id")
    private String id;
    
    /**
     * The name.
     */
    @XmlElement(name = "Name")
    private String name;
}
