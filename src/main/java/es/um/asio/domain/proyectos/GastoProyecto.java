package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GastoProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long idGasto;
    private String idGastoPrevisto;
    private String codTipoOrigen;
    private String idOrigenProyecto;
    private String numeroAnualidad;
    private String descripcion;
    private String idTipoGasto;
    private String codTipoMoneda;
    private float importe;
    private String idDocumento;
}
