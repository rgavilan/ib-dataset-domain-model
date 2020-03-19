package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Patente extends DataSetDataBase {  
    private long idPatente;
    private String tipoPatente;
    private String referenciaPatente;
    private String titulo;
    private Long idAgente;
    private String observaciones;
    private Long codigoProvincia;
    private Long numeroSolicitud;
    private Long anioSolicitud;
    private String fechaSolicitud;
    private String codAsiento;
    private Long anioAsiento;
    private Long numeroAsiento;
}
