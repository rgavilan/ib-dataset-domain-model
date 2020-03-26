package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class MiembroComiteCongreso.
 */
@Getter
@Setter
@ToString
public class MiembroComiteCongreso extends DataSetDataBase {  
    
    /**
     * Mapping of field AUCO_CONG_NUMERO.
     */
    private long aucoCongNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field AUCO_ORDEN.
     */
    private long aucoOrden;
}