package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Convocatorias recursos humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ConvocatoriaRecursosHumanos extends OperationableDataSetDataBase {  
    
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
