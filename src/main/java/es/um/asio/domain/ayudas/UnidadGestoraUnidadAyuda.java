package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class UnidadGestoraUnidadAyuda.
 */
@Getter
@Setter
@ToString
public class UnidadGestoraUnidadAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODUNIDADADM.
     */
    private String codUnidadAdm;
}
