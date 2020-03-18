package es.um.asio.domain.ImportResult;

import es.um.asio.domain.DataSetDataBase;
import es.um.asio.domain.exitStatus.ExitStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Import Result data set POJO
 */
@Getter
@Setter
@NoArgsConstructor
public class ImportResult extends DataSetDataBase {    
    
    public ImportResult(ExitStatus exitStatus) {
        this.exitStatus = exitStatus;
        this.setVersion(exitStatus.getVersion());
        this.date = System.currentTimeMillis();
    }
    
    /**
     * Fecha de realización 
     */
    private Long date;
    
    /**
     * Resultado de la importación
     */
    private ExitStatus exitStatus;
}
