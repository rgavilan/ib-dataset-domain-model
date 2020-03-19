package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GastoPrevistoProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long idGastoPrevisto;
    private String codTipoOrigen;
    private String idOrigenProyecto;
    private String numeroAnualidad;
    private String fechaPrevista;
    private String descripcion;
    private long idTipoGasto;
    private String codTipoMoneda;
    private float importe;
}
