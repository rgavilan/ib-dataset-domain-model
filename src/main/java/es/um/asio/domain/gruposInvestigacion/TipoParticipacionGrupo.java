package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoParticipacionGrupo extends DataSetDataBase {  
    private String codTipoParticipacionGrupo;
    private String descripcion;
}
