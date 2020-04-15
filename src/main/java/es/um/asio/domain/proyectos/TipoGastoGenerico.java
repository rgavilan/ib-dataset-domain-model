package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos gastos genericos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoGastoGenerico extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOGASTOGENERICO.
     */
    private String codTipoGastoGenerico;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
