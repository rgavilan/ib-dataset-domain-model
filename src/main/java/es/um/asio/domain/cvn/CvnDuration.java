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
 * The Class CvnDuration.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnDuration", propOrder = {
    "value"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDuration extends CvnBean
{
    
    /**
     * The value.
     */
    @XmlElement(name = "Value")
    private String value;
}
