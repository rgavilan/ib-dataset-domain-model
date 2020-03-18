package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EquipoSolicitudAyuda extends DataSetDataBase {  
    private String idDocumento;
    private Long idPersona;
    private String codigoTipoParticipacion;
}
