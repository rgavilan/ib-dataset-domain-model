package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FinanciacionUnidadAyuda extends DataSetDataBase {  
    private long idUnidadAyuda;
    private long numero;
    private String codTipoFinanciacion;
    private String codTipoFuente;
}
