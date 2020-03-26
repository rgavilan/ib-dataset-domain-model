package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoGastoGenerico.
 */
@Getter
@Setter
@ToString
public class TipoGastoGenerico extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOGASTOGENERICO.
     */
    private String codTipoGastoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
