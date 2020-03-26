package es.um.asio.domain.importResult;

import es.um.asio.domain.DataSetDataBase;
import es.um.asio.domain.exitStatus.ExitStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ImportResult.
 */
@Getter
@Setter
@NoArgsConstructor
public class ImportResult extends DataSetDataBase {    
    
    /**
     * Instantiates a new {@link ImportResult}.
     *
     * @param exitStatus the exit status
     */
    public ImportResult(ExitStatus exitStatus) {
        this.exitStatus = exitStatus;
        this.setVersion(exitStatus.getVersion());
        this.date = System.currentTimeMillis();
    }
    
    /**
     * The date of result.
     */
    private Long date;
    
    /**
     * The exit status.
     */
    private ExitStatus exitStatus;
}
