package es.um.asio.domain.importResult;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ExitStatus.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ExitStatus extends DataSetDataBase {

    /**
     * The code of exit status.
     */
    private ExitStatusCode code;

}
