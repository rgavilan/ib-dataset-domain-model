package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Equipos contratos proyectos.xml"
 */
@Getter
@Setter
@ToString
public class EquipoContratoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDPERSONACOLABORADOR.
     */
    private Long idPersonaColaborador;
    
    /**
     * Mapping of field CODIGOTIPOPARTICIPACION.
     */
    private String codigoTipoParticipacion;
}
