package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Anualidades proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AnualidadProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;    
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private long numeroAnualidad;
    
    /**
     * Mapping of field FECHAINICIOANUALIDAD.
     */
    private String fechaInicioAnualidad;
    
    /**
     * Mapping of field FECHAFINANUALIDAD.
     */
    private String fechaFinAnualidad;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEANUALIDAD.
     */
    private Float importeAnualidad;    
    
    /**
     * Mapping of field FECHAFINFACTURACION.
     */
    private Float fechaFinFacturacion;
    
    /**
     * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
     */
    private String codTipoMotivoCambioFecha;
    
    /**
     * Mapping of field MOTIVOCAMBIOFECHA.
     */
    private String motivoCambioFecha;
    
}
