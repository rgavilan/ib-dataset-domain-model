package es.um.asio.domain.exitStatus;

import es.um.asio.domain.DataSetData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ExitStatus implements DataSetData {

    private ExitStatusCodeEnum exitStatusCode;

}
