package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CapituloLibro extends DataSetDataBase {  
    private String capvLibrIsbn;
    private String capvNumero;
    private Long capvPagInicio;
    private Long capvPagFin;
    private String capvTitulo;
}
