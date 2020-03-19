package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImpuestoRepercutidoProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numero;
    private String tipoImpuestoRepercutido;
    private String fechaInicioPeriodo;
    private String fechaFinPeriodo;
}
