package es.um.asio.domain.contratos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Prorrogas contratos proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProrrogaContratoProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDDOCUMENTOCONTRATO.
     */
    private String idDocumentoContrato;
    
    /**
     * Mapping of field IDTERCEROCONTRATANTE.
     */
    private Long idTerceroContratante;
    
    /**
     * Mapping of field IDPERSONARESPONSABLE.
     */
    private String idPersonaResponsable;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private Float importeBase;
    
    /**
     * Mapping of field IMPORTEINFRAESTRUCTURA.
     */
    private Float importeInfraestructura;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field CCBANCARIAABONO.
     */
    private String ccBancariaAbono;
    
    /**
     * Mapping of field FECHAAUTORIZACION.
     */
    private String fechaAutorizacion;
    
    /**
     * Mapping of field FECHAINICIOEJECUCION.
     */
    private String fechaInicioEjecucion;
    
    /**
     * Mapping of field FECHAFINEJECUCION.
     */
    private String fechaFinEjecucion;
}
