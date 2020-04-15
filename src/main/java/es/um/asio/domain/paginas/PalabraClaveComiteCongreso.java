package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Palabras clave comite congresos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PalabraClaveComiteCongreso extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field PC_CONG_NUMERO.
     */
    private long pcCongNumero;
    
    /**
     * Mapping of field PC_PALABRA.
     */
    private String pcPalabra;
}