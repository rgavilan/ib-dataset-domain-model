package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores diseños.xml"
 */
@Getter
@Setter
@ToString
public class AutorDiseno extends DataSetDataBase {  
    
    /**
     * Mapping of field DISE_CODIGO.
     */
    private long diseCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
