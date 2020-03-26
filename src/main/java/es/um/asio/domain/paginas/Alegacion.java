package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Alegacion.
 */
@Getter
@Setter
@ToString
public class Alegacion extends DataSetDataBase {  
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field COD_TIPO.
     */
    private long codTipo;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field MOTIVO.
     */
    private String motivo;
    
    /**
     * Mapping of field TEXTO.
     */
    private String texto;
    
    /**
     * Mapping of field RESUELVE_TEXTO.
     */
    private String resuelveText;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field ESTADO.
     */
    private String estado;
}
