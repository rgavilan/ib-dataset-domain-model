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
 * The Class CvnDouble.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnDouble", propOrder = { "value" })
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDouble extends CvnBean
{
    
    /**
     * The value.
     */
    @XmlElement(name = "Value")
    private Double value;
}
