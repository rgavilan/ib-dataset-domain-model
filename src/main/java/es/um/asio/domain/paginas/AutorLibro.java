package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AutorLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field ALIB_LIBR_ISBN.
     */
    private String alibLibrIsbn;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ALIB_ORDEN.
     */
    private long alibOrden;
}
