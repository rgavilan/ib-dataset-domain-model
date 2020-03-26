package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ConvocatoriaRecursosHumanos.
 */
@Getter
@Setter
@ToString
public class ConvocatoriaRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field IDCONVOCATORIARECURSOHUMANO.
     */
    private long idConvocatoriaRecursoHumano;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field IDEMPRESAFINANCIADORA.
     */
    private long idEmpresaFinanciadora;
    
    /**
     * Mapping of field REFERENCIACONVOCATORIA.
     */
    private String referenciaConvocatoria;
    
    /**
     * Mapping of field FECHACONVOCATORIA.
     */
    private String fechaConvocatoria;
    
    /**
     * Mapping of field FECHAALEGACION.
     */
    private String fechaAlegacion;
    
    /**
     * Mapping of field FECHAPUBLICACIONBOLETIN.
     */
    private String fechaPublicacionBoletin;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
