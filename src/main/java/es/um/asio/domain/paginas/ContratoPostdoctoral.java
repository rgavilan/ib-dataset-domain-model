package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Contratos postdoctorales.xml"
 */
@Getter
@Setter
@ToString
public class ContratoPostdoctoral extends DataSetDataBase {  
    
    /**
     * Mapping of field SOLB_NUMERO.
     */
    private long solbNumero;
    
    /**
     * Mapping of field IDPERSONABECARIO.
     */
    private long idPersonaBecario;
    
    /**
     * Mapping of field SOLB_TITUPROYECTO.
     */
    private String solbTituProyecto;
    
    /**
     * Mapping of field SOLB_OBJETIVOS.
     */
    private String solbObjetivos;
    
    /**
     * Mapping of field SOLB_OBSERVACIONES.
     */
    private String solbObservaciones;
    
    /**
     * Mapping of field SOLB_ESTADO.
     */
    private String solbEstado;
}
