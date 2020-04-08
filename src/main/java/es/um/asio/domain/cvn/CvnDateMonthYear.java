package es.um.asio.domain.cvn;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnDateMonthYear.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnDateMonthYear extends CvnBean
{
    
    /**
     * The value.
     */
    private Date value;
}
