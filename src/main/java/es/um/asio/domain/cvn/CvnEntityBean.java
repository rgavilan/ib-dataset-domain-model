package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnEntityBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnEntityBean extends CvnBean
{
    
    /**
     * The id.
     */
    private String id;
    
    /**
     * The name.
     */
    @Lob
    private String name;
}
