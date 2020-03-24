package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AutorDiseno extends DataSetDataBase {  
    private long diseCodigo;
    private long idPersona;
    private long orden;
}
