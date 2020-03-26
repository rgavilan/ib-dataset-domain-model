package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class EntidadColaboradoraSolicitudAyuda.
 */
@Getter
@Setter
@ToString
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
