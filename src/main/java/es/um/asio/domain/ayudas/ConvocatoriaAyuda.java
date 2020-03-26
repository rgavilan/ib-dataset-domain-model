package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ConvocatoriaAyuda.
 */
@Getter
@Setter
@ToString
public class ConvocatoriaAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDCONVOCATORIAAYUDA.
     */
    private long idConvocatoriaAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field IDEMPRESAFINANCIADORA.
     */
    private long idEmpresaFinanciadora;
    
    /**
     * Mapping of field IDEMPRESAGESTORA.
     */
    private Long idEmpresaGestora;
    
    /**
     * Mapping of field REFERENCIACONVOCATORIA.
     */
    private String referenciaConvocatoria;
    
    /**
     * Mapping of field FECHACONVOCATORIA.
     */
    private String fechaConvocatoria;
    
    /**
     * Mapping of field FECHARESOLUCION.
     */
    private String fechaResolucion;
    
    /**
     * Mapping of field FECHAALEGACION.
     */
    private String fechaAlegacion;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
