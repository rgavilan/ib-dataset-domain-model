package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos fuentes financiacion.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoFuenteFinanciacion extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOFUENTE.
     */
    private String codTipoFuente;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field FONDOESTRUCTURAL.
     */
    private String fondoEstructural;
}
