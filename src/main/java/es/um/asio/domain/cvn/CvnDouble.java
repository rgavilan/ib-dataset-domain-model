package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * The Class CvnDouble.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDouble extends CvnBean
{

    /**
     * The value.
     */
    private Double value;
}
