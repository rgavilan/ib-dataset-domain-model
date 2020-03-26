package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class FinanciacionUnidadAyuda.
 */
@Getter
@Setter
@ToString
public class FinanciacionUnidadAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOFINANCIACION.
     */
    private String codTipoFinanciacion;
    
    /**
     * Mapping of field CODTIPOFUENTE.
     */
    private String codTipoFuente;
}
