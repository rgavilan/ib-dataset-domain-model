package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatenteContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private Long idPatente;
    private String titulo;
}
