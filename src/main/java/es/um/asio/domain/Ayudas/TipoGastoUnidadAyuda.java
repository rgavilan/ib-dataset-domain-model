package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoGastoUnidadAyuda extends DataSetDataBase {  
    private long idUnidadAyuda;
    private long idTipoGastoAyuda;
    private String descripcion;
    private String permitido;
}
