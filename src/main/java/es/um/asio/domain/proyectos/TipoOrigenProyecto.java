package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos origenes proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoOrigenProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOORIGEN.
     */
    private String codTipoOrigen;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
