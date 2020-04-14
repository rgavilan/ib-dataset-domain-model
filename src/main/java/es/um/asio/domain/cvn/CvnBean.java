package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnBean.
 */
@MappedSuperclass
@Getter
@Setter
@ToString(includeFieldNames = true)
public abstract class CvnBean extends DataSetDataBase {

    /**
     * The code.
     */
    private String code;
}
