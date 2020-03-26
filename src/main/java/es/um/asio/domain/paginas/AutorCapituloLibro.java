package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class AutorCapituloLibro.
 */
@Getter
@Setter
@ToString
public class AutorCapituloLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field ACAP_LIBR_ISBN.
     */
    private String acapLibrIsbn;
    
    /**
     * Mapping of field ACAP_CAPV_NUMERO.
     */
    private String acapCapvNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ACAP_ORDEN.
     */
    private long acapOrden;
}
