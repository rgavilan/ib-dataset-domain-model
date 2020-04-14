package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnAuthorBean> cvnAuthorBean;
    
    /**
     * The cvn boolean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnBoolean> cvnBoolean;
    
    /**
     * The cvn code group.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnCodeGroup> cvnCodeGroup;
    
    /**
     * The cvn date day month year.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnDateDayMonthYear> cvnDateDayMonthYear;
    
    /**
     * The cvn date month year.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnDateMonthYear> cvnDateMonthYear;
    
    /**
     * The cvn date year.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnDateYear> cvnDateYear;
    
    /**
     * The cvn double.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnDouble> cvnDouble;
    
    /**
     * The cvn duration.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnDuration> cvnDuration;
    
    /**
     * The cvn entity bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnEntityBean> cvnEntityBean;
    
    /**
     * The cvn external PK bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnExternalPKBean> cvnExternalPKBean;
    
    /**
     * The cvn family name bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnFamilyNameBean> cvnFamilyNameBean;
    
    /**
     * The cvn page bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnPageBean> cvnPageBean;
    
    /**
     * The cvn phone bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnPhoneBean> cvnPhoneBean;
    
    /**
     * The cvn photo bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnPhotoBean> cvnPhotoBean;
    
    /**
     * The cvn rich text.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnRichText> cvnRichText;
    
    /**
     * The cvn string.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnString> cvnString;
    
    /**
     * The cvn title bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnTitleBean> cvnTitleBean;
    
    /**
     * The cvn volume bean.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CvnVolumeBean> cvnVolumeBean;
}
