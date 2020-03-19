package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProteccionPatente extends DataSetDataBase {  
    private long idPatente;
    private long numero;
    private String codTipoViaProteccion;
    private String numeroSolicitud;
    private String fechaSolicitud;
    private String numeroPublicacion;
    private String fechaPublicacion;
    private String fechaPrioridad;
    private String fechaFinPlazoPrioridad;
    private String fechaConcesion;
    private String fechaAbandono;
    private String referencia;
    private String motivoCambioFecha;
}
