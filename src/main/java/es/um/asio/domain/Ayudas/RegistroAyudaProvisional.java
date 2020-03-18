package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegistroAyudaProvisional extends DataSetDataBase {  
    private String idDocumento;
    private String idDocumentoSolicitud;
    private String aprobacionSolicitudAyuda;
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
    private String idGrupoGasto;
    private String codTipoMoneda;
    private Float importe;
    private String referenciaConvocante;
}
