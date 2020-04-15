package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Facturas emitir proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FacturaEmitirProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMEROFACTURAPREVISTA.
     */
    private long numeroFacturaPrevista;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field FECHAPREVISTAEMISION.
     */
    private String fechaPrevistaEmision;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field IDTERCERO.
     */
    private long idTercero;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private float importeBase;
    
    /**
     * Mapping of field TIPOIMPUESTO.
     */
    private String tipoImpuesto;
    
    /**
     * Mapping of field TIPOIMPOSITIVO.
     */
    private String tipoImpositivo;
    
    /**
     * Mapping of field IMPORTEREPERCUTIDO.
     */
    private Float importeRepercutido;
    
    /**
     * Mapping of field IMPORTETOTAL.
     */
    private float importeTotal;
    
    /**
     * Mapping of field IDACTIVIDAD.
     */
    private Long idActividad;
}
