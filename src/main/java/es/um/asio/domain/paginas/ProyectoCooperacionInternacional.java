package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProyectoCooperacionInternacional extends DataSetDataBase {  
    private long proyecto;
    private String identificador;
    private String titulo;
    private String fecInicio;
    private String fecFin;
    private Long pcInPorcentaje;
}