package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EntidadColaboradoraSolicitudAyuda extends DataSetDataBase {  
    private String idDocumento;
    private Long idTercero;
    private String codigoTipoColaboracion;
    private String idEmpresaTerceraParte;
}
