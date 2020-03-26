package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class PalabraClaveLibro.
 */
@Getter
@Setter
@ToString
public class PalabraClaveLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field PC_LIBR_ISBN.
     */
    private String pcLibrIsbn;
    
    /**
     * Mapping of field PC_PALABRA.
     */
    private String pcPalabra;
}