package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IngresoProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long idIngreso;
    private String idIngresoPrevisto;
    private String codTipoOrigen;
    private String idOrigenProyecto;
    private String numeroAnualidad;
    private String descripcion;
    private String codTipoIngresoGenerico;
    private String codTipoMoneda;
    private float importe;
    private String idDocumento;
}
