package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnExternalPKBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnExternalPKBean extends CvnBean
{
    
    /**
     * The type.
     */
    private String type;
    
    /**
     * The value.
     */
    private String value;
    
    /**
     * The others.
     */
    private String others;
}
