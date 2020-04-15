package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos recursos humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoRecursosHumanos extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPORECURSOHUMANO.
     */
    private String codTipoRecursoHumano;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
