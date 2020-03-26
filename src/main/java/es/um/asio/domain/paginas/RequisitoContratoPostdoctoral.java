package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class RequisitoContratoPostdoctoral.
 */
@Getter
@Setter
@ToString
public class RequisitoContratoPostdoctoral extends DataSetDataBase {  
    
    /**
     * Mapping of field RESOP_NUMERO.
     */
    private Long resopNumero;
    
    /**
     * Mapping of field RESOP_REQCODIGO.
     */
    private String resopReqCodigo;
    
    /**
     * Mapping of field RESOP_CUMPLEREQ.
     */
    private String resopCumpleReq;
}