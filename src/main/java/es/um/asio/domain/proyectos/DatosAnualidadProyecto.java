package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DatosAnualidadProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numeroAnualidad;
    private long numero;
    private String fechaInicioAnualidad;
    private String fechaFinAnualidad;
    private Long ejercicioAnualidad;
    private String codTipoMoneda;
    private float importeAnualidad;
    private String iporteCostesGenerales;
    private float importeTotal;
    private String codTipoMotivoCambioFecha;
    private String motivoCambioFecha;
}
