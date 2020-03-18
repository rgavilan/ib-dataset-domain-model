package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SolicitudAyuda extends DataSetDataBase {  
    private String idDocumento;
    private Long idPersonaSolicitante;
    private Long idConvocatoriaAyuda;
    private String descripcionConvocatoria;
    private String referenciaConvocatoria;
    private Long idSubprograma;
    private String descripcionSubprograma;
    private Long idUnidadAyuda;
    private String descripcionUnidadAyuda;
    private Long idTerceroConvocante;
    private String fechaConvocatoria;
    private String observaciones;
    private String idGrupoGasto;
    private String codTipoMoneda;
    private Float importe;
    private String importeGlobal;
    private String codigoTipoEvento;
    private Long idTerceroOrganizadora;
    private String tituloEvento;
    private String lugarCelebracionEvento;
    private String codigoPaisCelebracionEvento;
    private String fechaInicioCelebracionEvento;
    private String fechaFinCelebracionEvento;
    private String observacionesEvento;
    private Long codigoTipoParticipacionEvento;
    private String codigoSolicitud;
}
