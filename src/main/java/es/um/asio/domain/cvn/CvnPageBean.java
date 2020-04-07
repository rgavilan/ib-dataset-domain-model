package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnPageBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnPageBean extends CvnBean
{
    
    /**
     * The final page.
     */
    private String finalPage;
    
    /**
     * The initial page.
     */
    private String initialPage;
}
