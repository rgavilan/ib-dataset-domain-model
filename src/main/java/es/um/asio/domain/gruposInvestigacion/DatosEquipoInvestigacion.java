package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DatosEquipoInvestigacion extends DataSetDataBase {  
    private String idGrupoInvestigacion;
    private long numero;
    private long idPersona;
    private String codTipoParticipacion;
    private String responsable;
    private Float edp;
    private String fechaInicioPeriodo;
    private String fechaFinPeriodo;
}
