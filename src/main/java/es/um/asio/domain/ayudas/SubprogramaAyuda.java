package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class SubprogramaAyuda.
 */
@Getter
@Setter
@ToString
public class SubprogramaAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDCONVOCATORIAAYUDA.
     */
    private long idConvocatoriaAyuda;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private long idSubprograma;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field RESUMEN.
     */
    private String resumen;
    
    /**
     * Mapping of field FECHARESOLUCION.
     */
    private String fechaResolucion;
    
    /**
     * Mapping of field FECHAALEGACION.
     */
    private String fechaAlegacion;
}
