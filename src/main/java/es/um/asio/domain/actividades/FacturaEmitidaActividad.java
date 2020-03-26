package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class FacturaEmitidaActividad.
 */
@Getter
@Setter
@ToString
public class FacturaEmitidaActividad extends DataSetDataBase {  
    
    /**
     * Mapping of field IDACTIVIDAD.
     */
    private long idActividad;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;  
    
    /**
     * Mapping of field IDFACTURAEMITIDA.
     */
    private String idFacturaEmitida;
}
