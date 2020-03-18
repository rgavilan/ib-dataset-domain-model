package es.um.asio.domain.Contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProrrogaContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private String idDocumentoContrato;
    private Long idTerceroContratante;
    private String idPersonaResponsable;
    private String codTipoMoneda;
    private Float importeBase;
    private Float importeInfraestructura;
    private Float importe;
    private String ccBancariaAbono;
    private String fechaAutorizacion;
    private String fechaInicioEjecucion;
    private String fechaFinEjecucion;
}
