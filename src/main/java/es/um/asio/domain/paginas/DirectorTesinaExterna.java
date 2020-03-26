package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DirectorTesinaExterna.
 */
@Getter
@Setter
@ToString
public class DirectorTesinaExterna extends DataSetDataBase {  
    
    /**
     * Mapping of field TESINA_CODIGO.
     */
    private long tesinaCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
