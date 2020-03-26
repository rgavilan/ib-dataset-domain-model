package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos auditorias proyectos.xml"
 */
@Getter
@Setter
@ToString
public class TipoAuditoriaProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOAUDITORIA.
     */
    private String codTipoAuditoria;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
