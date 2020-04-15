package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Palabras clave articulos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PalabraClaveArticulo extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field ARTI_CODIGO.
     */
    private long artiCodigo;
    
    /**
     * Mapping of field PALABRA.
     */
    private String palabra;
}