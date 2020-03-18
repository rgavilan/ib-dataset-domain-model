package es.um.asio.domain.Contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnualidadContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private Long numeroAnualidad;
    private Float importe;
}
