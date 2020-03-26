package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ImpuestoRepercutidoActividad.
 */
@Getter
@Setter
@ToString
public class ImpuestoRepercutidoActividad extends DataSetDataBase {  
    
    /**
     * Mapping of field IDACTIVIDAD.
     */
    private long idActividad;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field TIPOIMPUESTO.
     */
    private String tipoImpuesto;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private float importeBase;
    
    /**
     * Mapping of field TIPOIMPOSITIVO.
     */
    private long tipoImpositivo;
    
    /**
     * Mapping of field IMPORTE.
     */
    private float importe;
    
    /**
     * Mapping of field EXENCION.
     */
    private String exencion;
    
    /**
     * Mapping of field MOTIVOEXENCION.
     */
    private String motivoExencion;
}
