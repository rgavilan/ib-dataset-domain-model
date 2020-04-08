package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnBean extends DataSetDataBase {

    /**
     * The code.
     */
    private String code;
}
