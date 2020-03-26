package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoGastoUnidadAyuda.
 */
@Getter
@Setter
@ToString
public class TipoGastoUnidadAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field IDTIPOGASTOAYUDA.
     */
    private long idTipoGastoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field PERMITIDO.
     */
    private String permitido;
}
