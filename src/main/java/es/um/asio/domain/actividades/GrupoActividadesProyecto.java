package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GrupoActividadesProyecto extends DataSetDataBase {
  
    private long idProyecto;
    private long numero;  
    private long idGrupoActividades;
    private String fechaInicioPeriodo;
    private String fechaFinPeriodo;
}
