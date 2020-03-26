package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class MeritosSolicitudRecursosHumanos.
 */
@Getter
@Setter
@ToString
public class MeritosSolicitudRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
