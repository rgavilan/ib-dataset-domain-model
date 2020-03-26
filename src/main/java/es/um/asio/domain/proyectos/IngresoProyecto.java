package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Ingresos proyectos.xml"
 */
@Getter
@Setter
@ToString
public class IngresoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field IDINGRESO.
     */
    private long idIngreso;
    
    /**
     * Mapping of field IDINGRESOPREVISTO.
     */
    private String idIngresoPrevisto;
    
    /**
     * Mapping of field CODTIPOORIGEN.
     */
    private String codTipoOrigen;
    
    /**
     * Mapping of field IDORIGENPROYECTO.
     */
    private String idOrigenProyecto;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field CODTIPOINGRESOGENERICO.
     */
    private String codTipoIngresoGenerico;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTE.
     */
    private float importe;
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
}
