package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FacturaProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numero;
    private String numeroAnualidad;
    private String idFacturaEmitida;
    private Long numeroFacturaPrevista;
}
