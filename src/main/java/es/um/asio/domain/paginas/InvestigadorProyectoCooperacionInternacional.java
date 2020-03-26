package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Investigadores proyectos cooperacion internacional.xml"
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