package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos ingresos genericos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoIngresoGenerico extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOINGRESOGENERICO.
     */
    private String codTipoIngresoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
