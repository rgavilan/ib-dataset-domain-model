package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Registro recurso humano concedido.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RegistroRecursosHumanosConcedido extends OperationableDataSetDataBase {  
    
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
    
    /**
     * Mapping of field FECHARESOLUCION.
     */
    private String fechaResolucion;
    
    /**
     * Mapping of field FECHAPUBLICACION.
     */
    private String fechaPublicacion;
}
