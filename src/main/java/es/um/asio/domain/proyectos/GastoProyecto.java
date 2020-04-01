package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Gastos proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GastoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field IDGASTO.
     */
    private long idGasto;
    
    /**
     * Mapping of field IDGASTOPREVISTO.
     */
    private String idGastoPrevisto;
    
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
     * Mapping of field IDTIPOGASTO.
     */
    private String idTipoGasto;
    
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
