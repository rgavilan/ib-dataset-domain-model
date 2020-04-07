package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnEntityBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnEntityBean extends CvnBean
{
    
    /**
     * The id.
     */
    private String id;
    
    /**
     * The name.
     */
    private String name;
}
