package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DependenciaProyecto.
 */
@Getter
@Setter
@ToString
public class DependenciaProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDEPENDENCIA.
     */
    private String idDependencia;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
