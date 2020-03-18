package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnualidadFinanciacionRegistroAyudaDefinitiva extends DataSetDataBase {  
    private String idDocumento;
    private Long numeroLineaFinanciacion;
    private String codigoTipoFinanciacion;
    private String codigoTipoFuente;
    private Long numeroAnualidad;
    private Float importe;
}
