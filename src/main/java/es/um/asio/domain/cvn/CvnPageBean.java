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
 * The Class CvnPageBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnPageBean", propOrder = {
    "finalPage",
    "initialPage"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPageBean extends CvnBean
{

    /**
     * The final page.
     */
    @XmlElement(name = "FinalPage")
    private String finalPage;
    
    /**
     * The initial page.
     */
    @XmlElement(name = "InitialPage")
    private String initialPage;
}
