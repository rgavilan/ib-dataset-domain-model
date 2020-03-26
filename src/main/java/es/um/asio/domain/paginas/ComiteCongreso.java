package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Comite congresos.xml"
 */
@Getter
@Setter
@ToString
public class ComiteCongreso extends DataSetDataBase {  
    
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
