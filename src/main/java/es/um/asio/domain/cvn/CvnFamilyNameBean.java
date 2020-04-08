package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnFamilyNameBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
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
