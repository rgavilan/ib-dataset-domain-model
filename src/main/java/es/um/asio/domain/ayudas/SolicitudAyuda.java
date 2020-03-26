package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class SolicitudAyuda.
 */
@Getter
@Setter
@ToString
public class SolicitudAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDPERSONASOLICITANTE.
     */
    private Long idPersonaSolicitante;
    
    /**
     * Mapping of field IDCONVOCATORIAAYUDA.
     */
    private Long idConvocatoriaAyuda;
    
    /**
     * Mapping of field DESCRIPCIONCONVOCATORIA.
     */
    private String descripcionConvocatoria;
    
    /**
     * Mapping of field REFERENCIACONVOCATORIA.
     */
    private String referenciaConvocatoria;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private Long idSubprograma;
    
    /**
     * Mapping of field DESCRIPCIONSUBPROGRAMA.
     */
    private String descripcionSubprograma;
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private Long idUnidadAyuda;
    
    /**
     * Mapping of field DESCRIPCIONUNIDADAYUDA.
     */
    private String descripcionUnidadAyuda;
    
    /**
     * Mapping of field IDTERCEROCONVOCANTE.
     */
    private Long idTerceroConvocante;
    
    /**
     * Mapping of field FECHACONVOCATORIA.
     */
    private String fechaConvocatoria;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
    
    /**
     * Mapping of field IDGRUPOGASTO.
     */
    private String idGrupoGasto;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field IMPORTEGLOBAL.
     */
    private String importeGlobal;
    
    /**
     * Mapping of field CODIGOTIPOEVENTO.
     */
    private String codigoTipoEvento;
    
    /**
     * Mapping of field IDTERCEROORGANIZADORA.
     */
    private Long idTerceroOrganizadora;
    
    /**
     * Mapping of field TITULOEVENTO.
     */
    private String tituloEvento;
    
    /**
     * Mapping of field LUGARCELEBRACIONEVENTO.
     */
    private String lugarCelebracionEvento;
    
    /**
     * Mapping of field CODIGOPAISCELEBRACIONEVENTO.
     */
    private String codigoPaisCelebracionEvento;
    
    /**
     * Mapping of field FECHAINICIOCELEBRACIONEVENTO.
     */
    private String fechaInicioCelebracionEvento;
    
    /**
     * Mapping of field FECHAFINCELEBRACIONEVENTO.
     */
    private String fechaFinCelebracionEvento;
    
    /**
     * Mapping of field OBSERVACIONESEVENTO.
     */
    private String observacionesEvento;
    
    /**
     * Mapping of field CODIGOTIPOPARTICIPACIONEVENTO.
     */
    private Long codigoTipoParticipacionEvento;
    
    /**
     * Mapping of field CODIGOSOLICITUD.
     */
    private String codigoSolicitud;
}
