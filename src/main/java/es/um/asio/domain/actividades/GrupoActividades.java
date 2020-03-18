package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GrupoActividades extends DataSetDataBase {  
    private long idGrupoActividades;
    private long codTipoActividad;
}
