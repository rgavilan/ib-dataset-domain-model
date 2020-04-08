package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnItemBean.
 */
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
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnAuthorBean> cvnAuthorBean;
    
    /**
     * The cvn boolean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnBoolean> cvnBoolean;
    
    /**
     * The cvn code group.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnCodeGroup> cvnCodeGroup;
    
    /**
     * The cvn date day month year.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateDayMonthYear> cvnDateDayMonthYear;
    
    /**
     * The cvn date month year.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateMonthYear> cvnDateMonthYear;
    
    /**
     * The cvn date year.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDateYear> cvnDateYear;
    
    /**
     * The cvn double.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDouble> cvnDouble;
    
    /**
     * The cvn duration.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnDuration> cvnDuration;
    
    /**
     * The cvn entity bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnEntityBean> cvnEntityBean;
    
    /**
     * The cvn external PK bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnExternalPKBean> cvnExternalPKBean;
    
    /**
     * The cvn family name bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnFamilyNameBean> cvnFamilyNameBean;
    
    /**
     * The cvn page bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPageBean> cvnPageBean;
    
    /**
     * The cvn phone bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPhoneBean> cvnPhoneBean;
    
    /**
     * The cvn photo bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnPhotoBean> cvnPhotoBean;
    
    /**
     * The cvn rich text.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnRichText> cvnRichText;
    
    /**
     * The cvn string.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnString> cvnString;
    
    /**
     * The cvn title bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnTitleBean> cvnTitleBean;
    
    /**
     * The cvn volume bean.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<CvnVolumeBean> cvnVolumeBean;
}
