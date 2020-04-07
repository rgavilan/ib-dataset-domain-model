package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnTitleBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnTitleBean extends CvnBean
{
    
    /**
     * The identification.
     */
    private String identification;
    
    /**
     * The name.
     */
    private String name;
}
