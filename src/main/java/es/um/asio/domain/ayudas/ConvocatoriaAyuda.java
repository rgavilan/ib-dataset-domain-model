package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Convocatorias ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ConvocatoriaAyuda extends OperationableDataSetDataBase {  
    
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
