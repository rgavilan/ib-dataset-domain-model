package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores diseños.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AutorDiseno extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field DISE_CODIGO.
     */
    private long diseCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
