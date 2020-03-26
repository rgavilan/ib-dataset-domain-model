package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class InvestigadorProyectoCooperacionInternacional.
 */
@Getter
@Setter
@ToString
public class InvestigadorProyectoCooperacionInternacional extends DataSetDataBase {  
    
    /**
     * Mapping of field PROYECTO.
     */
    private long proyecto;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
}