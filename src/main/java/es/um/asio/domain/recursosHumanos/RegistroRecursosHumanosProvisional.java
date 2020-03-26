package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class RegistroRecursosHumanosProvisional.
 */
@Getter
@Setter
@ToString
public class RegistroRecursosHumanosProvisional extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDCONVOCATORIARECURSOHUMANO.
     */
    private Long idConvocatoriaRecursoHumano;
    
    /**
     * Mapping of field DESCRIPCIONCONVOCATORIA.
     */
    private String descripcionConvocatoria;
    
    /**
     * Mapping of field REFERENCIACONVOCATORIA.
     */
    private String referenciaConvocatoria;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private Long idSubprograma;
    
    /**
     * Mapping of field DESCRIPCIONSUBPROGRAMA.
     */
    private String descripcionSubprograma;
    
    /**
     * Mapping of field IDUNIDADRECURSOHUMANO.
     */
    private Long idUnidadRecursoHumano;
    
    /**
     * Mapping of field DESCRIPCIONUNIDADRECURSOHUMANO.
     */
    private String descripcionUnidadRecursoHumano;
    
    /**
     * Mapping of field IDTERCEROCONVOCANTE.
     */
    private Long idTerceroConvocante;
    
    /**
     * Mapping of field FECHACONVOCATORIA.
     */
    private String fechaConvocatoria;
}
