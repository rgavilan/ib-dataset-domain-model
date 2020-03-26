package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class DiplomaEstudiosAvanzadosExterno.
 */
@Getter
@Setter
@ToString
public class DiplomaEstudiosAvanzadosExterno extends DataSetDataBase {  
    
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
     * Mapping of field TINA_UNIV_NOMBRE.
     */
    private String tinaUnivNombre;
    
    /**
     * Mapping of field TINA_UNI_CODIGO.
     */
    private Long tinaUniCodigo;
}
