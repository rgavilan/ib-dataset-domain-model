package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class AutorLibro.
 */
@Getter
@Setter
@ToString
public class AutorLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field ALIB_LIBR_ISBN.
     */
    private String alibLibrIsbn;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ALIB_ORDEN.
     */
    private long alibOrden;
}
