package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoFuenteFinanciacion extends DataSetDataBase {  
    private String codTipoFuente;
    private String descripcion;
    private String fondoEstructural;
}
