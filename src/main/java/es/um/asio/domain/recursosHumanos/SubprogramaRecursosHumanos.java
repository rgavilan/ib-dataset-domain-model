package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class SubprogramaRecursosHumanos.
 */
@Getter
@Setter
@ToString
public class SubprogramaRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field IDCONVOCATORIARECURSOHUMANO.
     */
    private long idConvocatoriaRecursoHumano;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private String idSubprograma;
    
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
