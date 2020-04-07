package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnDouble.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnDouble extends CvnBean
{

    /**
     * The value.
     */
    private Double value;
}
