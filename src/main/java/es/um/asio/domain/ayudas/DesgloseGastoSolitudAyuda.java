package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DesgloseGastoSolitudAyuda.
 */
@Getter
@Setter
@ToString
public class DesgloseGastoSolitudAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field NUMERO.
     */
    private Long numero;
    
    /**
     * Mapping of field IDTIPOGASTOAYUDA.
     */
    private Long idTipoGastoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field PERMITIDO.
     */
    private String permitido;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
