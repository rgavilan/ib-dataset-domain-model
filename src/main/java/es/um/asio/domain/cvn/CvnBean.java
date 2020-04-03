package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnBean", propOrder = {
    "code"
})
@XmlSeeAlso({
    CvnEntityBean.class,
    CvnDuration.class,
    CvnDateYear.class,
    CvnTitleBean.class,
    CvnDateMonthYear.class,
    CvnString.class,
    CvnPhoneBean.class,
    CvnPageBean.class,
    CvnAuthorBean.class,
    CvnDouble.class,
    CvnFamilyNameBean.class,
    CvnBoolean.class,
    CvnDateDayMonthYear.class,
    CvnVolumeBean.class,
    CvnPhotoBean.class,
    CvnExternalPKBean.class,
    CvnItemBean.class
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnBean extends DataSetDataBase {

    /**
     * The code.
     */
    @XmlElement(name = "Code")
    private String code;
}
