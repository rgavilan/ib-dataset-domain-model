package es.um.asio.domain.investigationCenter;

import es.um.asio.domain.DataSetData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class GroupContactData implements DataSetData {
    /**
     * Investigation Group ID
     */
    private String investigationGroupId;

    /**
     * número
     */
    private Long number;

    /**
     * código del tipo de forma de contacto
     */
    private String wayTypeContactCode;

    /**
     * valor
     */
    private String value;
}
