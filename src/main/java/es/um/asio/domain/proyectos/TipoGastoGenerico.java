package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos gastos genericos.xml"
 */
@Getter
@Setter
@ToString
public class TipoGastoGenerico extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOGASTOGENERICO.
     */
    private String codTipoGastoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
