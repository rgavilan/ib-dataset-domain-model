package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoActividad extends DataSetDataBase {  
    private String codTipoActividad;
    private String descripcion;
}
