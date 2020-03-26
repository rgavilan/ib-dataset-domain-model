package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Partidas convocatorias.xml"
 */
@Getter
@Setter
@ToString
public class PartidaConvocatoria extends DataSetDataBase {  
    
    /**
     * Mapping of field IDCONVOCATORIAAYUDA.
     */
    private long idConvocatoriaAyuda;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private long idSubprograma;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDUNIDADORG.
     */
    private long idUnidadOrg;
    
    /**
     * Mapping of field CODECONOMICA.
     */
    private String codEconomica;
    
    /**
     * Mapping of field CODFUNCIONAL.
     */
    private String codFuncional;
    
    /**
     * Mapping of field TIPOAPLICACIONECO.
     */
    private String tipoAplicacionEco;
}
