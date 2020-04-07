package es.um.asio.domain.cvn;

import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnDateYear.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnDateYear extends CvnBean
{
    
    /**
     * The value.
     */
    private XMLGregorianCalendar value;   
}
