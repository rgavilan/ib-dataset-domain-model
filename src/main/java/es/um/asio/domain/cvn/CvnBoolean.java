package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnBoolean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnBoolean extends CvnBean
{
    
    /**
     * The value.
     */
    private Boolean value;
}
