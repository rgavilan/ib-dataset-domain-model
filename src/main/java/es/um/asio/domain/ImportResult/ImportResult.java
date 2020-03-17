package es.um.asio.domain.ImportResult;

import es.um.asio.domain.DataSetData;
import es.um.asio.domain.exitStatus.ExitStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Import Result data set POJO
 */
@Getter
@Setter
@AllArgsConstructor
public class ImportResult implements DataSetData {    
    /**
     * Número de versión de la importación
     */
    private Integer version;
    
    /**
     * Fecha de realización 
     */
    private Long date;
    
    /**
     * Resultado de la importación
     */
    private ExitStatus exitStatus;
}
