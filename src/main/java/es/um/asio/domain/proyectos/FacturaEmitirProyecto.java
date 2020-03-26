package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class FacturaEmitirProyecto.
 */
@Getter
@Setter
@ToString
public class FacturaEmitirProyecto extends DataSetDataBase {  
    
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
