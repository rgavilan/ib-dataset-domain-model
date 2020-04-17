package es.um.asio.domain.cvn;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnAuthorBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnAuthorBean extends CvnBean
{
    
    /**
     * The cvn family name bean.
     */   
    @OneToOne(cascade = CascadeType.ALL)
    private CvnFamilyNameBean cvnFamilyNameBean;
    
    /**
     * The given name.
     */
    @Lob
    private String givenName;
    
    /**
     * The signature.
     */
    @Lob
    private String signature;
    
    /**
     * The signature order.
     */
    private Integer signatureOrder;
}
