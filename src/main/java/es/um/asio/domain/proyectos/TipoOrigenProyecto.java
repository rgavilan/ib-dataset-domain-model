package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos origenes proyectos.xml"
 */
@Getter
@Setter
@ToString
public class TipoOrigenProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOORIGEN.
     */
    private String codTipoOrigen;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
