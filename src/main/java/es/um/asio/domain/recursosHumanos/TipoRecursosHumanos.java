package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoRecursosHumanos extends DataSetDataBase {  
    private String codTipoRecursoHumano;
    private String descripcion;
}
