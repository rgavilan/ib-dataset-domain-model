package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Datos anualidades proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DatosAnualidadProyecto extends OperationableDataSetDataBase {  
    
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
