package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoFinanciacion.
 */
@Getter
@Setter
@ToString
public class TipoFinanciacion extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOFINANCIACION.
     */
    private String codTipoFinanciacion;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
