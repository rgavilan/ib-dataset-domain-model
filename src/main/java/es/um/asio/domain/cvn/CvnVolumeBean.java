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
 * The Class CvnVolumeBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnVolumeBean", propOrder = {
    "number",
    "volume"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnVolumeBean extends CvnBean
{
    
    /**
     * The number.
     */
    @XmlElement(name = "Number")
    private String number;
    
    /**
     * The volume.
     */
    @XmlElement(name = "Volume")
    private String volume;
}
