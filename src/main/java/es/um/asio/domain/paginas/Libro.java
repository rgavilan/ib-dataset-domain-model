package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Libro extends DataSetDataBase {  
    private String isbn;
    private String depositoLegal;
    private String participacion;
    private String titulo;
    private String editorial;
    private Long numPaginas;
    private Long numCapitulos;
    private Long anioPublicacion;
    private String coautoria;
    private String cmn;
}