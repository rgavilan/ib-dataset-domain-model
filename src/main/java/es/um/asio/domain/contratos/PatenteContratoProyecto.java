package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Patentes contratos proyectos.xml"
 */
@Getter
@Setter
@ToString
public class PatenteContratoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDPATENTE.
     */
    private Long idPatente;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
}
