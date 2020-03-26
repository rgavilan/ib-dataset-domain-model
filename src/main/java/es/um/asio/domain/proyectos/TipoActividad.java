package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos actividades.xml"
 */
@Getter
@Setter
@ToString
public class TipoActividad extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOACTIVIDAD.
     */
    private String codTipoActividad;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
