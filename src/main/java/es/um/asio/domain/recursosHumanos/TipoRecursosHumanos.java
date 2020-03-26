package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoRecursosHumanos.
 */
@Getter
@Setter
@ToString
public class TipoRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPORECURSOHUMANO.
     */
    private String codTipoRecursoHumano;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
