package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnPhoneBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPhoneBean extends CvnBean
{
    
    /**
     * The extension.
     */
    private String extension;
    
    /**
     * The international code.
     */
    private String internationalCode;
    
    /**
     * The number.
     */
    private String number;
    
    /**
     * The type.
     */
    private String type;
}
