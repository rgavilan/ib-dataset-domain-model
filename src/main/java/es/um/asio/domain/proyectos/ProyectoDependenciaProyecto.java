package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ProyectoDependenciaProyecto.
 */
@Getter
@Setter
@ToString
public class ProyectoDependenciaProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDEPENDENCIA.
     */
    private String idDependencia;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
}
