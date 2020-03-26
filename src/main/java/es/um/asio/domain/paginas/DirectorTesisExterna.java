package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores tesis externas.xml"
 */
@Getter
@Setter
@ToString
public class DirectorTesisExterna extends DataSetDataBase {  
    
    /**
     * Mapping of field DIRE_TESI_CODIGO.
     */
    private long direTesiCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
}
