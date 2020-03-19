package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FacturaEmitirProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numeroFacturaPrevista;
    private String numeroAnualidad;
    private String fechaPrevistaEmision;
    private String descripcion;
    private long idTercero;
    private String codTipoMoneda;
    private float importeBase;
    private String tipoImpuesto;
    private String tipoImpositivo;
    private Float importeRepercutido;
    private float importeTotal;
    private Long idActividad;
}
