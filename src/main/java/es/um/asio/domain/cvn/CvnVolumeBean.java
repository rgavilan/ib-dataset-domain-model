package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnVolumeBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnVolumeBean extends CvnBean
{
    
    /**
     * The number.
     */
    private String number;
    
    /**
     * The volume.
     */
    private String volume;
}
