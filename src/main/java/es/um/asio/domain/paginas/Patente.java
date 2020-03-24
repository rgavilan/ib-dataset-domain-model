package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Patente extends DataSetDataBase {  
    private long pateNumero;
    private String pateTitulo;
    private String pateTipo;
    private String pateFSolicitud;
    private String pateReferencia;
    private String pateFConcesion;
    private String pateFPrioridad;
    private String patePaisPi;
    private String pateEjerPi;
    private String pateNumePi;
    private String pateAgente;
    private String pateEntiCodigo;
    private String pateEntidadTitular;
    private Long pateSectCodigo;
}