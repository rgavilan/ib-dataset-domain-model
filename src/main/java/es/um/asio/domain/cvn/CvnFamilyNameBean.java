package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnFamilyNameBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnFamilyNameBean extends CvnBean
{
    
    /**
     * The first family name.
     */
    private String firstFamilyName;
    
    /**
     * The second family name.
     */
    private String secondFamilyName;
}
