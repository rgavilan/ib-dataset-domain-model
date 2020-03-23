package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegistroAyudaDefinitiva extends DataSetDataBase {  
    private String idDocumento;
    private String idDocumentoSolicitud;
    private Long idConvocatoriaAyuda;
    private String descripcionConvocatoria;
    private String referenciaConvocatoria;
    private Long idSubprograma;
    private String descripcionSubprograma;
    private Long idUnidadAyuda;
    private String descripcionUnidadAyuda;
    private Long idTerceroConvocante;
    private String fechaConvocatoria;
    private Long idPersonaSolicitante;
    private String observaciones;
    private String fechaConcesion;
    private String fechaInicioEjecucionProyecto;
    private String fechaFinEjecucionProyecto;    
    private String codTipoMoneda;
    private Float importe;
    private String referenciaConvocatoria_1;
}
