package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores diploma estudios avanzados externo.xml"
 */
@Getter
@Setter
@ToString
public class DirectorDiplomaEstudiosAvanzadosExterno extends DataSetDataBase {  
    
    /**
     * Mapping of field DTNA_TINA_CODIGO.
     */
    private long dtnaTinaCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field DTNA_ORDEN.
     */
    private long dtnaOrden;
}
