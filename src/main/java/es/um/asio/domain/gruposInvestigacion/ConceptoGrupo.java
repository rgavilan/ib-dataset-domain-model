package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Conceptos grupos.xml"
 */
@Getter
@Setter
@ToString
public class ConceptoGrupo extends DataSetDataBase {  
    
    /**
     * Mapping of field IDGRUPOINVESTIGACION.
     */
    private String idGrupoInvestigacion;
    
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
