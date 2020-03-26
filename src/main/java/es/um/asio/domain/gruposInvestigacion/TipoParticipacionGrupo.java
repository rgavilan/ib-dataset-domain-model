package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class TipoParticipacionGrupo.
 */
@Getter
@Setter
@ToString
public class TipoParticipacionGrupo extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOPARTICIPACIONGRUPO.
     */
    private String codTipoParticipacionGrupo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
