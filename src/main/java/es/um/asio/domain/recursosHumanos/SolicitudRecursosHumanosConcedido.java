package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Solicitudes recurso humano concendido.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SolicitudRecursosHumanosConcedido extends OperationableDataSetDataBase {  
    
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
