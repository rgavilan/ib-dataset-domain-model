package es.um.asio.domain.Actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImpuestoRepercutidoActividad extends DataSetDataBase {  
    private long idActividad;
    private long numero;
    private String tipoImpuesto;
    private String codTipoMoneda;
    private float importeBase;
    private long tipoImpositivo;
    private float importe;
    private String exencion;
    private String motivoExencion;
}
