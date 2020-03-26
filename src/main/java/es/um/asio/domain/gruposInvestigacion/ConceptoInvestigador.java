package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ConceptoInvestigador.
 */
@Getter
@Setter
@ToString
public class ConceptoInvestigador extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOCONCEPTO.
     */
    private String codTipoConcepto;
    
    /**
     * Mapping of field TEXTO.
     */
    private String texto;
}
