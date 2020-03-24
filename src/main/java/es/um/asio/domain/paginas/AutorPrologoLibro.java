package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AutorPrologoLibro extends DataSetDataBase {  
    private String aproLibrIsbn;
    private long idPersona;
    private long aproOrden;
}
