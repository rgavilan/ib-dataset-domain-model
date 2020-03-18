package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConceptoGrupo extends DataSetDataBase {  
    private String idGrupoInvestigacion;
    private long numero;
    private String codTipoConcepto;
    private String texto;
}
