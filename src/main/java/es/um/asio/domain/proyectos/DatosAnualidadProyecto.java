package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DatosAnualidadProyecto.
 */
@Getter
@Setter
@ToString
public class DatosAnualidadProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private long numeroAnualidad;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field FECHAINICIOANUALIDAD.
     */
    private String fechaInicioAnualidad;
    
    /**
     * Mapping of field FECHAFINANUALIDAD.
     */
    private String fechaFinAnualidad;
    
    /**
     * Mapping of field EJERCICIOANUALIDAD.
     */
    private Long ejercicioAnualidad;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEANUALIDAD.
     */
    private float importeAnualidad;
    
    /**
     * Mapping of field IMPORTECOSTESGENERALES.
     */
    private String iporteCostesGenerales;
    
    /**
     * Mapping of field IMPORTETOTAL.
     */
    private float importeTotal;
    
    /**
     * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
     */
    private String codTipoMotivoCambioFecha;
    
    /**
     * Mapping of field MOTIVOCAMBIOFECHA.
     */
    private String motivoCambioFecha;
}
