package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos ingresos genericos.xml"
 */
@Getter
@Setter
@ToString
public class TipoIngresoGenerico extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOINGRESOGENERICO.
     */
    private String codTipoIngresoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
