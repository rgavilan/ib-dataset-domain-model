package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Comite congresos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ComiteCongreso extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CONG_NUMERO.
     */
    private long congNumero;
    
    /**
     * Mapping of field CONG_TITCONGRESO.
     */
    private String congTitCongreso;
    
    /**
     * Mapping of field CONG_FECHA.
     */
    private String congFecha;
    
    /**
     * Mapping of field CONG_LUGAR.
     */
    private String congLugar;
    
    /**
     * Mapping of field CONG_INTERNACIONAL.
     */
    private String congInternacional;
}
