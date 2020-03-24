package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaisPatente extends DataSetDataBase {  
    private long paipPateNumero;
    private long paipPaisCodigo;
    private String paisNombre;
    private String paipPrioritario;
}