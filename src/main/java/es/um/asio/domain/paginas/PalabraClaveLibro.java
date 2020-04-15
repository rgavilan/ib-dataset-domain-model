package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Palabras clave libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PalabraClaveLibro extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field PC_LIBR_ISBN.
     */
    private String pcLibrIsbn;
    
    /**
     * Mapping of field PC_PALABRA.
     */
    private String pcPalabra;
}