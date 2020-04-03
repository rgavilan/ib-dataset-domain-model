package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Cvn.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVN", propOrder = { "cvnItemBean" })
@XmlRootElement(name="CVN") 
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Cvn extends DataSetDataBase
{
    
    /**
     * The cvn item bean.
     */
    @XmlElement(name = "CvnItemBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnItemBean> cvnItemBean; 
}
