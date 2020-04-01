package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores prologo libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AutorPrologoLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field APRO_LIBR_ISBN.
     */
    private String aproLibrIsbn;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field APRO_ORDEN.
     */
    private long aproOrden;
}
