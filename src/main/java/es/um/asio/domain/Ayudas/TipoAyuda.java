package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TipoAyuda extends DataSetDataBase {  
    private String codTipoAyuda;
    private String descripcion;
}
