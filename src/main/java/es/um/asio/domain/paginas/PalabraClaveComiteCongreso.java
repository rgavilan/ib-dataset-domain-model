package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class PalabraClaveComiteCongreso.
 */
@Getter
@Setter
@ToString
public class PalabraClaveComiteCongreso extends DataSetDataBase {  
    
    /**
     * Mapping of field PC_CONG_NUMERO.
     */
    private long pcCongNumero;
    
    /**
     * Mapping of field PC_PALABRA.
     */
    private String pcPalabra;
}