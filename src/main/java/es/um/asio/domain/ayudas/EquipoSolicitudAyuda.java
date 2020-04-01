package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Equipos solicitudes ayuda.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EquipoSolicitudAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private Long idPersona;
    
    /**
     * Mapping of field CODIGOTIPOPARTICIPACION.
     */
    private String codigoTipoParticipacion;
}
