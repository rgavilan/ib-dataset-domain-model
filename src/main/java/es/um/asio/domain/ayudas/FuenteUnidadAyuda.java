package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Fuentes unidades ayuda.xml"
 */
@Getter
@Setter
@ToString
public class FuenteUnidadAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOFUENTE.
     */
    private String codTipoFuente;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
