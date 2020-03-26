package es.um.asio.domain.exitStatus;

import es.um.asio.domain.DataSetDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ExitStatus.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ExitStatus extends DataSetDataBase {

    /**
     * The code of exit status.
     */
    private ExitStatusCodeEnum exitStatusCode;

}
