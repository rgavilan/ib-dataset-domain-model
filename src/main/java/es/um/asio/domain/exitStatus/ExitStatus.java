package es.um.asio.domain.exitStatus;

import es.um.asio.domain.DataSetData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class ExitStatus implements DataSetData {

    private ExitStatusCodeEnum exitStatusCode;

}
