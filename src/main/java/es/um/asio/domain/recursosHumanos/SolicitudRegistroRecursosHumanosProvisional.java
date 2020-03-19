package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SolicitudRegistroRecursosHumanosProvisional extends DataSetDataBase {  
    private String idDocumento;
    private String idDocumentoSolicitud;
    private Long idPersonaSolicitante;
    private Float puntuacion;
}
