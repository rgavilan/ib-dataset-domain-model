package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DesgloseGastoSolitudAyuda extends DataSetDataBase {  
    private String idDocumento;
    private Long numero;
    private Long idTipoGastoAyuda;
    private String descripcion;
    private String numeroAnualidad;
    private Float importe;
    private String permitido;
    private String observaciones;
}
