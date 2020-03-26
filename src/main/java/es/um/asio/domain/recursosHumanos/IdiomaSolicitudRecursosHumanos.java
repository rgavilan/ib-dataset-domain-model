package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class IdiomaSolicitudRecursosHumanos.
 */
@Getter
@Setter
@ToString
public class IdiomaSolicitudRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field CODIGO.
     */
    private String codigo;
    
    /**
     * Mapping of field NIVEL.
     */
    private String nivel;
}
