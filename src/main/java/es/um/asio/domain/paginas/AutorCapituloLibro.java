package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores captitulos libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AutorCapituloLibro extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field ACAP_LIBR_ISBN.
     */
    private String acapLibrIsbn;
    
    /**
     * Mapping of field ACAP_CAPV_NUMERO.
     */
    private String acapCapvNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ACAP_ORDEN.
     */
    private long acapOrden;
}
