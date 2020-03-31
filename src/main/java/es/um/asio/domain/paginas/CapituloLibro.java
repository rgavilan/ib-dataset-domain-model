package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Capitulos libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CapituloLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field CAPV_LIBR_ISBN.
     */
    private String capvLibrIsbn;
    
    /**
     * Mapping of field CAPV_NUMERO.
     */
    private String capvNumero;
    
    /**
     * Mapping of field CAPV_PAGINICIO.
     */
    private Long capvPagInicio;
    
    /**
     * Mapping of field CAPV_PAGFIN.
     */
    private Long capvPagFin;
    
    /**
     * Mapping of field CAPV_TITULO.
     */
    private String capvTitulo;
}
