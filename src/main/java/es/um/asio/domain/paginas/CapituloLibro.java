package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CapituloLibro.
 */
@Getter
@Setter
@ToString
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
