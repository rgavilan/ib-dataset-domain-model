package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class AutorPrologoLibro.
 */
@Getter
@Setter
@ToString
public class AutorPrologoLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field APRO_LIBR_ISBN.
     */
    private String aproLibrIsbn;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field APRO_ORDEN.
     */
    private long aproOrden;
}
