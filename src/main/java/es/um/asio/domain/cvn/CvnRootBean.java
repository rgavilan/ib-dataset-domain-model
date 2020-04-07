package es.um.asio.domain.cvn;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnRootBean.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class CvnRootBean {

    /**
     * The cvn item bean.
     */
    private List<CvnItemBean> cvnItemBean;

}
