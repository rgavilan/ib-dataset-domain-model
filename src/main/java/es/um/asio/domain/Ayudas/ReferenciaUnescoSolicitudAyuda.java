package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReferenciaUnescoSolicitudAyuda extends DataSetDataBase {  
    private String idDocumento;
    private Long codAreaUnesco;
    private Long numeroCampoUnesco;
    private String codCampoUnesco;
    private Long numeroLineaUnesco;
    private String codLineaUnesco;
}
