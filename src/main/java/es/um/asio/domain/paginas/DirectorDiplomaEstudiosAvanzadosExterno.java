package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DirectorDiplomaEstudiosAvanzadosExterno.
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
