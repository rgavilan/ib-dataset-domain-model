package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class SolicitudRecursosHumanosConcedido.
 */
@Getter
@Setter
@ToString
public class SolicitudRecursosHumanosConcedido extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDDOCUMENTOSOLICITUD.
     */
    private String idDocumentoSolicitud;
    
    /**
     * Mapping of field IDPERSONASOLICITANTE.
     */
    private Long idPersonaSolicitante;
    
    /**
     * Mapping of field PUNTUACION.
     */
    private Float puntuacion;
}
