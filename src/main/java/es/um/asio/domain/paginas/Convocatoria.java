package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Convocatoria extends DataSetDataBase {  
    private long pconEntiCodigo;
    private long pconModaCodigo;
    private long pconFase;
    private String pconFechaReso;
    private String pconDescripcion;
    private String pconFechaInicio;
    private String pconFechaFin;
}
