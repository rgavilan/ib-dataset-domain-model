package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoActividad.
 */
@Getter
@Setter
@ToString
public class TipoActividad extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOACTIVIDAD.
     */
    private String codTipoActividad;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
