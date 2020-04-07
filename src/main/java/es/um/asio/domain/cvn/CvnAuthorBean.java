package es.um.asio.domain.cvn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnAuthorBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnAuthorBean extends CvnBean
{
    
    /**
     * The cvn family name bean.
     */   
    private CvnFamilyNameBean cvnFamilyNameBean;
    
    /**
     * The given name.
     */
    private String givenName;
    
    /**
     * The signature.
     */
    private String signature;
    
    /**
     * The signature order.
     */
    private Integer signatureOrder;
}
