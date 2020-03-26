package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoMotivoCambioFecha.
 */
@Getter
@Setter
@ToString
public class TipoMotivoCambioFecha extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
     */
    private String codTipoMotivoCambioFecha;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
