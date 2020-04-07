package es.um.asio.domain.cvn;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnItemBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnItemBean extends CvnBean
{
    
    /**
     * The cvn author bean.
     */
    private List<CvnAuthorBean> cvnAuthorBean;
    
    /**
     * The cvn boolean.
     */
    private List<CvnBoolean> cvnBoolean;
    
    /**
     * The cvn code group.
     */
    private List<CvnCodeGroup> cvnCodeGroup;
    
    /**
     * The cvn date day month year.
     */
    private List<CvnDateDayMonthYear> cvnDateDayMonthYear;
    
    /**
     * The cvn date month year.
     */
    private List<CvnDateMonthYear> cvnDateMonthYear;
    
    /**
     * The cvn date year.
     */
    private List<CvnDateYear> cvnDateYear;
    
    /**
     * The cvn double.
     */
    private List<CvnDouble> cvnDouble;
    
    /**
     * The cvn duration.
     */
    private List<CvnDuration> cvnDuration;
    
    /**
     * The cvn entity bean.
     */
    private List<CvnEntityBean> cvnEntityBean;
    
    /**
     * The cvn external PK bean.
     */
    private List<CvnExternalPKBean> cvnExternalPKBean;
    
    /**
     * The cvn family name bean.
     */
    private List<CvnFamilyNameBean> cvnFamilyNameBean;
    
    /**
     * The cvn page bean.
     */
    private List<CvnPageBean> cvnPageBean;
    
    /**
     * The cvn phone bean.
     */
    private List<CvnPhoneBean> cvnPhoneBean;
    
    /**
     * The cvn photo bean.
     */
    private List<CvnPhotoBean> cvnPhotoBean;
    
    /**
     * The cvn rich text.
     */
    private List<CvnRichText> cvnRichText;
    
    /**
     * The cvn string.
     */
    private List<CvnString> cvnString;
    
    /**
     * The cvn title bean.
     */
    private List<CvnTitleBean> cvnTitleBean;
    
    /**
     * The cvn volume bean.
     */
    private List<CvnVolumeBean> cvnVolumeBean;
}
