package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FuenteUnidadAyuda extends DataSetDataBase {  
    private long idUnidadAyuda;
    private long numero;
    private String codTipoFuente;
    private String observaciones;
}
