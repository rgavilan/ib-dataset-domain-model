package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos ayudas.xml"
 */
@Getter
@Setter
@ToString
public class TipoAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOAYUDA.
     */
    private String codTipoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
