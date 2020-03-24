package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Congreso extends DataSetDataBase {  
    private long congNumero;
    private Long tipoParticipacion;
    private String tituloContribucion;
    private String tituloCongreso;
    private String fechaCelebracion;
    private String lugarCelebracion;
    private String congresoInternacional;
}
