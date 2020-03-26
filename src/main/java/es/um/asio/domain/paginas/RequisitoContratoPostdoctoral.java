package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Requisitos contratos postdoctorales.xml"
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