package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class AutorArticulo.
 */
@Getter
@Setter
@ToString
public class AutorArticulo extends DataSetDataBase {  
    
    /**
     * Mapping of field ARTI_CODIGO.
     */
    private long artiCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
