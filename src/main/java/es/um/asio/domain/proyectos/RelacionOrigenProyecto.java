package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Relaciones origenes proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelacionOrigenProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field CODTIPOORIGEN.
     */
    private String codTipoOrigen;
    
    /**
     * Mapping of field IDORIGENPROYECTO.
     */
    private String idOrigenProyecto;
}
