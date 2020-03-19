package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FinanciacionProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numero;
    private String codTipoFinanciacion;
    private String codTipoFuente;
    private Long numeroAnualidad;
    private String codTipoMoneda;
    private float importe;
}
