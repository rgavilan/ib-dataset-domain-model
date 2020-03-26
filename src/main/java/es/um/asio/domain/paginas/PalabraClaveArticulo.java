package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Palabras clave articulos.xml"
 */
@Getter
@Setter
@ToString
public class PalabraClaveArticulo extends DataSetDataBase {  
    
    /**
     * Mapping of field ARTI_CODIGO.
     */
    private long artiCodigo;
    
    /**
     * Mapping of field PALABRA.
     */
    private String palabra;
}