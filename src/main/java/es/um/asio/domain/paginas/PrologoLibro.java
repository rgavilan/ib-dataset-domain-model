package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Prologo libros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PrologoLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field ISBN.
     */
    private String isbn;
    
    /**
     * Mapping of field DEPOSITOLEGAL.
     */
    private String depositoLegal;
    
    /**
     * Mapping of field PARTICIPACION.
     */
    private String participacion;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field EDITORIAL.
     */
    private String editorial;
    
    /**
     * Mapping of field NUM_PAGINAS.
     */
    private Long numPaginas;
    
    /**
     * Mapping of field NUM_CAPITULOS.
     */
    private Long numCapitulos;
    
    /**
     * Mapping of field ANIO_PUBLICACION.
     */
    private Long anioPublicacion;
    
    /**
     * Mapping of field COAUTORIA.
     */
    private String coautoria;
    
    /**
     * Mapping of field CMN.
     */
    private String cmn;
    
    /**
     * Mapping of field NUMERO_PROLOGO.
     */
    private long numeroPrologo;
    
    /**
     * Mapping of field NUMERO_PAGINA.
     */
    private Long numeroPagina;
}