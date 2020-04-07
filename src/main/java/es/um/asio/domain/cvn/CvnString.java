package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnString.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnString extends CvnBean
{
    /**
     * The value.
     */
    private String value;

}
