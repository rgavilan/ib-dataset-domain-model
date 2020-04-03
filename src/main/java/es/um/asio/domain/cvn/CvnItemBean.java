package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnItemBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnItemBean", propOrder = { "cvnAuthorBean", "cvnBoolean", "cvnCodeGroup",
        "cvnDateDayMonthYear", "cvnDateMonthYear", "cvnDateYear", "cvnDouble", "cvnDuration",
        "cvnEntityBean", "cvnExternalPKBean", "cvnFamilyNameBean", "cvnPageBean", "cvnPhoneBean",
        "cvnPhotoBean", "cvnString", "cvnTitleBean", "cvnVolumeBean","cvnLanguage" })
@XmlSeeAlso({ CvnCodeGroup.class })
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnItemBean extends CvnBean
{
    
    /**
     * The cvn author bean.
     */
    @XmlElement(name = "CvnAuthorBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnAuthorBean> cvnAuthorBean;
    
    /**
     * The cvn boolean.
     */
    @XmlElement(name = "CvnBoolean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnBoolean> cvnBoolean;
    
    /**
     * The cvn code group.
     */
    @XmlElement(name = "CvnCodeGroup")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnCodeGroup> cvnCodeGroup;
    
    /**
     * The cvn date day month year.
     */
    @XmlElement(name = "CvnDateDayMonthYear")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateDayMonthYear> cvnDateDayMonthYear;
    
    /**
     * The cvn date month year.
     */
    @XmlElement(name = "CvnDateMonthYear")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateMonthYear> cvnDateMonthYear;
    
    /**
     * The cvn date year.
     */
    @XmlElement(name = "CvnDateYear")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateYear> cvnDateYear;
    
    /**
     * The cvn double.
     */
    @XmlElement(name = "CvnDouble")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDouble> cvnDouble;
    
    /**
     * The cvn duration.
     */
    @XmlElement(name = "CvnDuration")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDuration> cvnDuration;
    
    /**
     * The cvn entity bean.
     */
    @XmlElement(name = "CvnEntityBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnEntityBean> cvnEntityBean;
    
    /**
     * The cvn external PK bean.
     */
    @XmlElement(name = "CvnExternalPKBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnExternalPKBean> cvnExternalPKBean;
    
    /**
     * The cvn family name bean.
     */
    @XmlElement(name = "CvnFamilyNameBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnFamilyNameBean> cvnFamilyNameBean;
    
    /**
     * The cvn page bean.
     */
    @XmlElement(name = "CvnPageBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPageBean> cvnPageBean;
    
    /**
     * The cvn phone bean.
     */
    @XmlElement(name = "CvnPhoneBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPhoneBean> cvnPhoneBean;
    
    /**
     * The cvn photo bean.
     */
    @XmlElement(name = "CvnPhotoBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPhotoBean> cvnPhotoBean;
    
    /**
     * The cvn string.
     */
    @XmlElement(name = "CvnString")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnString> cvnString;
    
    /**
     * The cvn title bean.
     */
    @XmlElement(name = "CvnTitleBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnTitleBean> cvnTitleBean;
    
    /**
     * The cvn volume bean.
     */
    @XmlElement(name = "CvnVolumeBean")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnVolumeBean> cvnVolumeBean;
    
    /**
     * The cvn language.
     */
    @XmlElement(name = "CvnLanguage")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnLanguage> cvnLanguage;
}
