package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ReferenciaUnescoSolicitudAyuda.
 */
@Getter
@Setter
@ToString
public class ReferenciaUnescoSolicitudAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field CODAREAUNESCO.
     */
    private Long codAreaUnesco;
    
    /**
     * Mapping of field NUMEROCAMPOUNESCO.
     */
    private Long numeroCampoUnesco;
    
    /**
     * Mapping of field CODCAMPOUNESCO.
     */
    private String codCampoUnesco;
    
    /**
     * Mapping of field NUMEROLINEAUNESCO.
     */
    private Long numeroLineaUnesco;
    
    /**
     * Mapping of field CODLINEAUNESCO.
     */
    private String codLineaUnesco;
}
