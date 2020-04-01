package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Entidades colaboradoras solicitudes ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EntidadColaboradoraSolicitudAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDTERCERO.
     */
    private Long idTercero;
    
    /**
     * Mapping of field CODIGOTIPOCOLABORACION.
     */
    private String codigoTipoColaboracion;
    
    /**
     * Mapping of field IDEMPRESATERCERAPARTE.
     */
    private String idEmpresaTerceraParte;
}
