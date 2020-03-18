package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FinanciacionRegistroAyudaDefinitiva extends DataSetDataBase {  
    private Long idInterno;
    private String codOrganizacionEmisor;
    private String idDocumento;
    private Long numero;
    private String codigoTipoFinanciacion;
    private String descripcionTipoFinanciacion;
    private String codigoTipoFuente;
    private String descripcionTipoFuente;
    private Float importe;
}
