package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EditorLibro extends DataSetDataBase {  
    private String alibLibrIsbn;
    private long idPersona;
    private long alibOrden;
}