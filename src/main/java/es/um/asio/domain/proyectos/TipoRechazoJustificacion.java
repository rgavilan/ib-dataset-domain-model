package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoRechazoJustificacion.
 */
@Getter
@Setter
@ToString
public class TipoRechazoJustificacion extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPORECHAZO.
     */
    private String codTipoRechazo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
