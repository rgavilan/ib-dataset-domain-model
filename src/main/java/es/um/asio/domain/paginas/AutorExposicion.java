package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores exposicion.xml"
 */
@Getter
@Setter
@ToString
public class AutorExposicion extends DataSetDataBase {  
    
    /**
     * Mapping of field EXPO_CODIGO.
     */
    private long expoCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
