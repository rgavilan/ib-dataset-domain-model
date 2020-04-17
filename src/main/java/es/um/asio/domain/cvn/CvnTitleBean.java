package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnTitleBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnTitleBean extends CvnBean
{
    
    /**
     * The identification.
     */
    private String identification;
    
    /**
     * The name.
     */
    @Lob
    private String name;
}
