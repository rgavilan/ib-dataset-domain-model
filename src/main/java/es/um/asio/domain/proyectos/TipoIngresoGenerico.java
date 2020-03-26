package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoIngresoGenerico.
 */
@Getter
@Setter
@ToString
public class TipoIngresoGenerico extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOINGRESOGENERICO.
     */
    private String codTipoIngresoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
