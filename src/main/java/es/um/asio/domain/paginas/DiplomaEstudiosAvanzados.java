package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DiplomaEstudiosAvanzados.
 */
@Getter
@Setter
@ToString
public class DiplomaEstudiosAvanzados extends DataSetDataBase {  
    
    /**
     * Mapping of field TINA_CODIGO.
     */
    private long tinaCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field TINA_TITULO.
     */
    private String tinaTitulo;
    
    /**
     * Mapping of field TINA_FECHA.
     */
    private String tinaFecha;
    
    /**
     * Mapping of field TINA_CENT_CODIGO.
     */
    private String tineCentCodigo;
}
