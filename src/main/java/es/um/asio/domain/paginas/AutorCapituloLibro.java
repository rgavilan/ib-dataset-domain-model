package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AutorCapituloLibro extends DataSetDataBase {  
    private String acapLibrIsbn;
    private String acapCapvNumero;
    private long idPersona;
    private long acapOrden;
}
