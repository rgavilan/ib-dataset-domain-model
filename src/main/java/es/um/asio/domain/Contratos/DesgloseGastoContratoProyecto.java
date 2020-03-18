package es.um.asio.domain.Contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DesgloseGastoContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private Long codTipoGastoGenerico;
    private Float importe;
}
