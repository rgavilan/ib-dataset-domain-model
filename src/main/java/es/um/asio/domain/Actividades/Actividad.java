package es.um.asio.domain.Actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Actividad extends DataSetDataBase {  
    private long idActividad;
    private String codTipoActividad;  
    private String titulo;
    private long idTercero;
    private String terceroConfidencial;
    private String codTipoMoneda;
    private float importeBase;
    private String tipoImpuesto;
    private Float tipoImpositivo;
    private float importeRepercutido;
    private float importeTotal;
    private String fechaInicioActividad;
    private String fechaFinActividad;    
}
